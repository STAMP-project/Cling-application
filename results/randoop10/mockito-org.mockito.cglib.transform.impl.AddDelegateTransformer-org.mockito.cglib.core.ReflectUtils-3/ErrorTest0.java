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
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
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
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = classEmitter0.getAccess();
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(104);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("(IZ)Lhi!;", "L276889264", "org/mockito/asm/Type", 3);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BYTE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type5.getOpcode(5);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type10.getOpcode(5);
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local((-1), type10);
        org.mockito.asm.Type[] typeArray14 = new org.mockito.asm.Type[] { type8, type10 };
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray14);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(130, (int) (byte) -1, "(IZ)Lhi!;", type4, typeArray14, "(DZ)Z");
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((-1), type1);
        org.mockito.asm.Type type5 = local4.getType();
        java.lang.String str6 = type5.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type5.getElementType();
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("org.mockito.asm.Type", "org/mockito/asm/Type");
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((-1), type1);
        org.mockito.asm.Type type5 = local4.getType();
        java.lang.String str6 = type5.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type5.getInternalName();
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter1.visitAnnotation("java.beans.PropertyDescriptor[name=hi!]", false);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(104);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type0.getDimensions();
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]", "(DZ)Z", (int) (byte) 1);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("(IZ)Lhi!;", "(DZ)Z");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type0.getInternalName();
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter0.getStaticHook();
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        int int1 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type0.getElementType();
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L527178774", "Lorg/mockito/asm/Type;", "");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", "Z");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L243601416hi!", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean]", "L276889264");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode(133);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
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
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1900097269", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]", "L527178774", 0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
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
        classEmitter2.visit(153, 112, "L930922338", "org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!; constrained]", strArray16);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.lang.String[] strArray3 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray4 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray5 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray3, methodArray4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.Class[] classArray6 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray5);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
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
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter3.getClassType();
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = classEmitter1.getAccess();
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
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
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter0.visitAnnotation("(DZ)Z", true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter1.visitAnnotation("(DZ)Z", true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
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
        classEmitter1.visit(7, 116, "org.mockito.asm.Type", "(IZ)C", "L243601416", strArray12);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(5);
        int int3 = type0.getSize();
        java.lang.String str4 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type0.getElementType();
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(5);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int5 = type3.getOpcode(5);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type8 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int10 = type8.getOpcode(5);
        org.mockito.cglib.core.Local local11 = new org.mockito.cglib.core.Local((-1), type8);
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] { type6, type8 };
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray12);
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray12);
        java.lang.String str15 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type16 = type0.getElementType();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter2.visitAnnotation("S", false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L1900097269", "hi!", "char", 107);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("", "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getObjectType("L1015173504");
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
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
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
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter2.getSuperType();
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
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
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("hi!");
        int int2 = type1.getSort();
        java.lang.Class<?> wildcardClass3 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean8 = classInfo6.equals((java.lang.Object) type7);
        java.lang.String str9 = type7.toString();
        boolean boolean11 = type7.equals((java.lang.Object) "L107191322");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type12 = type7.getElementType();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter1.getClassType();
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
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
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getClassType();
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type1.getDimensions();
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(104);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type0.getInternalName();
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("()Lorg/mockito/asm/Type;", "L1717639624");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
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
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int2 = type0.getOpcode(133);
        java.lang.String str3 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((-1), type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
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
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
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
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
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
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getObjectType("hi!");
        int int11 = type10.getSort();
        java.lang.String str12 = type10.getInternalName();
        org.mockito.cglib.core.Local local13 = new org.mockito.cglib.core.Local(0, type10);
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
        boolean boolean30 = type16.equals((java.lang.Object) 10L);
        int int31 = type16.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.declare_field(124, "Lorg/mockito/cglib/core/ReflectUtils$4;", type10, (java.lang.Object) type16);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter2.getSuperType();
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "hi!", "hi!", "hi!" };
        java.lang.reflect.Method[] methodArray13 = new java.lang.reflect.Method[] {};
        java.lang.reflect.Method[] methodArray14 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray13);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visit(158, (int) '#', "L805361884", "C", "Z", strArray12);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
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
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = classEmitter2.getClassType();
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter2.getAccess();
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        java.lang.Object obj4 = label0.info;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSort();
        label0.info = type5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type5.getInternalName();
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
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
        classEmitter2.begin_class(7, (int) (byte) 0, "", type13, typeArray22, "L1068302868");
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.end_class();
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("(DZ)Lorg/mockito/asm/Type;", "L180128060");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
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
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
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
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("L1137985648", true);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter1.visitAnnotation("", true);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("org.mockito.cglib.core.ReflectUtils$4", "L1509490424", "(DZ)Lorg/mockito/asm/Type;", (int) '4');
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("java.beans.PropertyDescriptor[name=hi!]", "(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)V", "org.mockito.cglib.core.ReflectUtils$4");
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitOuterClass("Lorg/mockito/cglib/core/ReflectUtils$4;", "L1463064543", "L930922338");
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
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
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        boolean boolean3 = type1.equals((java.lang.Object) 133);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type1.getDimensions();
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("(DZ)J", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]", "L28837920");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
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
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter1.visitAnnotation("L243601416hi!", true);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(130);
        java.lang.String str5 = type0.getClassName();
        java.lang.String str6 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type0.getElementType();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean7 = signature2.equals((java.lang.Object) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = classEmitter4.getAccess();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter3.getSuperType();
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
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
        classEmitter4.begin_class((int) '#', (int) (byte) 100, "L1580073776", type9, typeArray32, "()Ljava/lang/Object;");
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitInnerClass("Lhi!;", "Ljava/beans/PropertyDescriptor;", "(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)V", 112);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter3.getStaticHook();
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
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
        classEmitter4.visit(2, 0, "", "L276889264", "org/mockito/asm/Typejava.beans.PropertyDescriptor[name=hi!]", strArray32);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter1.getStaticHook();
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("()Lg/mockito/asm/Type;", true);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
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
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
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
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L409438762", "L988526452", "(JLorg/mockito/asm/Type;)Lhi!;", 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("L276889264");
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
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
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
        classEmitter2.visit(128, 9, "L243601416", "J", "hi!", strArray48);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
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
        classEmitter3.visit((int) (short) 100, 14, "L988526452", "(DZ)Lorg/mockito/asm/Type;", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; constrained]", strArray12);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
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
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("Z");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(153, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type2.getInternalName();
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
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
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = type0.getElementType();
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L1463064543", "L755526513", "(JLorg/mockito/asm/Type;)Lhi!;");
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = classEmitter2.getAccess();
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
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
        classEmitter7.visit(128, 126, "D", "Lorg/mockito/asm/Type;", "L189200429", strArray18);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
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
        classEmitter0.declare_field(108, "L340719626", type11, (java.lang.Object) str19);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("org.mockito.asm.Type", "L1406423095", "Lg/mockito/asm/Type;", 14);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("(DZ)Lhi!;", "Lorg/mockito/asm/Type;", "LL1015173504;", (int) 'a');
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int11 = classEmitter4.getAccess();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
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
        classEmitter4.visit((int) '4', 1, "L971073760", "(DZ)J", "L340719626", strArray14);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("(JLorg/mockito/asm/Type;)Lhi!;", "L1294565354");
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
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter3.visitAnnotation("L243601416hi!", false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.VOID_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter2.getStaticHook();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
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
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L1328533533", "()Lorg/mockito/asm/Type;", "java.beans.PropertyDescriptor[name=()Lorg/mockito/asm/Type;]", 5);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(130);
        java.lang.String str5 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("(IZ)C", "L1708113484", "Lhi!;", (int) '#');
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("J", "L1717639624", "Lorg/mockito/cglib/core/ReflectUtils$4;", (int) (short) 10);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("java.beans.PropertyDescriptor[name=hi!; displayName=boolean; shortDescription=L1378241671; values={Lhi!;=Lhi!;}]", "L162996724", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={Lhi!;=Lhi!;}]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter1.getClassType();
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter2.getClassType();
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter7.getClassType();
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean7 = signature2.equals((java.lang.Object) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("byte", "L189200429");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L1540179652", "L1743030895");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
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
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(10);
        java.lang.String str3 = type0.getClassName();
        int int4 = type0.getSize();
        int int5 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitSource("(DZ)Lhi!;", "L931003418");
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("L879538535", "short", "");
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1717639624", "L338871258", "()Lorg/mockito/asm/Type;");
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("Ljava/lang/Object;", "L1675365013", "L1850955859");
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = classEmitter2.getAccess();
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("org/mockito/cglib/core/ReflectUtils$4", "L243601416");
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
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
        classEmitter1.visit(158, 104, "L1165862269", "C", "Ljava/lang/Object;", strArray26);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter1.getSuperType();
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter1.visitAnnotation("(DZ)Z", false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L243747227", "L131896529", "double");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("(DZ)Lhi!;", "L2131243882");
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
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        org.mockito.cglib.core.ClassInfo classInfo8 = classEmitter7.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter9 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter7);
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("()Lorg/mockito/asm/Type;", "L879538535", "L755526513", 1041);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type9 = classEmitter3.getClassType();
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type2.getOpcode(5);
        int int5 = type2.getSize();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) '4', type2);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(2, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type2.getElementType();
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classEmitter4.visitAnnotation("Lorg/mockito/asm/Label;", true);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
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
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean7 = signature2.equals((java.lang.Object) classEmitter4);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!; constrained]; preferred]", "L282006869");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor15 = classEmitter4.visitField(96, "()Lg/mockito/asm/Type;", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; constrained]", "[Ljava/beans/PropertyDescriptor;", (java.lang.Object) "java.beans.PropertyDescriptor[name=hi!; displayName=java.beans.PropertyDescriptor[name=hi!; constrained]; preferred]");
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter4.getSuperType();
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
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
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
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
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("L243601416hi!", type11, typeArray38);
        org.mockito.asm.Type[] typeArray40 = signature39.getArgumentTypes();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor41 = classEmitter2.visitField(0, "L879538535", "(DZ)Lhi!;", "L930922338", (java.lang.Object) signature39);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter2.getSuperType();
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("L1463064543", false);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter1.getStaticHook();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.CHAR_TYPE;
        int int5 = type3.getOpcode(10);
        java.lang.String str6 = type3.getClassName();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("hi!");
        int int10 = type9.getSort();
        java.lang.String str11 = type9.getInternalName();
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local(0, type9);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type15 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int17 = type15.getOpcode(5);
        org.mockito.cglib.core.Local local18 = new org.mockito.cglib.core.Local((-1), type15);
        org.mockito.asm.Type type19 = local18.getType();
        org.mockito.asm.Type[] typeArray20 = new org.mockito.asm.Type[] { type13, type19 };
        java.lang.String str21 = org.mockito.asm.Type.getMethodDescriptor(type9, typeArray20);
        java.lang.String str22 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray20);
        int int23 = type3.getSort();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getObjectType("hi!");
        int int27 = type26.getSort();
        java.lang.String str28 = type26.getInternalName();
        org.mockito.cglib.core.Local local29 = new org.mockito.cglib.core.Local(0, type26);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.declare_field(112, "L735073802", type3, (java.lang.Object) local29);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(126, type1);
        int int4 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = type1.getElementType();
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
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
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
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
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str1 = type0.getInternalName();
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("java.beans.PropertyDescriptor[name=hi!; displayName=L527178774]", "L1509490424", "Ljava/lang/Object;", 0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(126, type1);
        org.mockito.asm.Type type4 = local3.getType();
        org.mockito.asm.Type type5 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type5.getDimensions();
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("L527178774", true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("(IZ)C", true);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(IZ)C");
        java.lang.String str3 = signature2.toString();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        int int6 = type4.getOpcode(1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type4.getInternalName();
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(130);
        int int5 = type0.getSort();
        java.lang.String str6 = type0.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type0.getDimensions();
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
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
        propertyDescriptor3.setValue("L107191322", (java.lang.Object) "char");
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
        propertyDescriptor46.setName("L1483665173");
        java.beans.PropertyEditor propertyEditor54 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptor46);
        boolean boolean55 = propertyDescriptor31.isHidden();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor46", propertyDescriptor3.equals(propertyDescriptor46) ? propertyDescriptor3.hashCode() == propertyDescriptor46.hashCode() : true);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L529805110", "L540439040");
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter3.visitAnnotation("()Lava.beans.PropertyDescriptor[name=hi!;", false);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter1.visitAnnotation("org/mockito/cglib/core/ReflectUtils$4", true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("C");
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getObjectType("hi!");
        int int6 = type5.getSort();
        java.lang.String str7 = type5.getInternalName();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local(0, type5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.INT_TYPE;
        org.mockito.asm.Type type11 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int13 = type11.getOpcode(5);
        org.mockito.cglib.core.Local local14 = new org.mockito.cglib.core.Local((-1), type11);
        org.mockito.asm.Type type15 = local14.getType();
        org.mockito.asm.Type[] typeArray16 = new org.mockito.asm.Type[] { type9, type15 };
        java.lang.String str17 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray16);
        boolean boolean19 = type5.equals((java.lang.Object) 10L);
        int int20 = type5.getSort();
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local(9, type5);
        org.mockito.asm.Type type22 = local21.getType();
        boolean boolean23 = type1.equals((java.lang.Object) local21);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int24 = type1.getDimensions();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type20 = type0.getElementType();
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
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
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitInnerClass("java.beans.PropertyDescriptor[name=hi!; displayName=boolean; hidden; values={java.beans.PropertyDescriptor[name=hi!]=java.beans.PropertyDescriptor[name=hi!; displayName=boolean; shortDescription=(IZ)Lhi!;]}]", "Lorg/mockito/asm/Type;", "S", 107);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = type1.getElementType();
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.Class<?> wildcardClass10 = signature9.getClass();
        org.mockito.asm.Type type11 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        java.lang.String str12 = type11.toString();
        org.mockito.asm.Type type13 = type11.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor14 = classEmitter2.visitField(55, "Lorg/mockito/asm/Type;", "Ljava/lang/Object;", "C(IZ)LL527178774;", (java.lang.Object) type13);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter7.visitAnnotation("LL282006869;", true);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter2.visitAnnotation("", false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
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
        propertyDescriptor3.setValue("L107191322", (java.lang.Object) "char");
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
        java.beans.PropertyDescriptor propertyDescriptor46 = new java.beans.PropertyDescriptor("Lg/mockito/asm/Type;", method44, method45);
        java.beans.PropertyEditor propertyEditor47 = propertyDescriptor31.createPropertyEditor((java.lang.Object) method45);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor46", propertyDescriptor3.equals(propertyDescriptor46) ? propertyDescriptor3.hashCode() == propertyDescriptor46.hashCode() : true);
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
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter2.visitAnnotation("(IZ)C", false);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
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
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.end_class();
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((-1), type1);
        org.mockito.asm.Type type5 = local4.getType();
        org.mockito.asm.Type type6 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type6.getDimensions();
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L1688910597", "", "java.beans.PropertyDescriptor[name=hi!; shortDescription=Lhi!;]");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("(IZ)Lorg/mockito/asm/Type;", "L803421219", "L804990632");
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L1167348480", "L1963581312", "org.mockito.cglib.core.ReflectUtils$4", 8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L2087503466", "", "java.beans.PropertyDescriptor[name=Lorg/mockito/cglib/core/Signature;]", 6);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter4 = classEmitter2.getStaticHook();
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((-1), type1);
        org.mockito.asm.Type type5 = local4.getType();
        java.lang.String str6 = type5.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = type5.getDimensions();
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        java.lang.Object obj4 = label0.info;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSort();
        label0.info = type5;
        java.lang.String str8 = type5.getClassName();
        java.lang.String str9 = type5.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = type5.getElementType();
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L282006869", "L526777644", "L1165862269");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("L1165862269", "L1178015239", "Z", 107);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.end_class();
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("Ljava/lang/Object;", "L2014519321", "L351119765");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L988526452", "L853548068");
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int4 = type2.getOpcode(5);
        int int5 = type2.getSize();
        org.mockito.cglib.core.Local local6 = new org.mockito.cglib.core.Local((int) '4', type2);
        org.mockito.cglib.core.Local local7 = new org.mockito.cglib.core.Local(2, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type2.getInternalName();
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(130);
        int int5 = type0.getSort();
        int int6 = type0.getSort();
        java.lang.String str7 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str8 = type0.getInternalName();
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("java.lang.Object", "L755526513", "L243601416hi!()Lhi!;");
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1805744537", "L2131243882");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type10 = classEmitter2.getClassType();
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitInnerClass("L988526452", "L879538535", "L162996724", 157);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
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
        org.mockito.cglib.core.Signature signature40 = new org.mockito.cglib.core.Signature("L1015173504", type10, typeArray39);
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
        classEmitter0.begin_class((int) 'a', 0, "D(IZ)Z", type41, typeArray78, "L616055911");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
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
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
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
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
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
        java.lang.String[] strArray24 = new java.lang.String[] { "java.beans.PropertyDescriptor[name=hi!; displayName=L527178774]", "L930922338" };
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
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitEnd();
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
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
        classEmitter2.visit(0, 96, "L2107422026", "L769378102", "L1266947484", strArray13);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getReturnType("DL1217139539");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(96, type2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type2.getElementType();
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(IZ)C");
        java.lang.String str3 = signature2.toString();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type4.getInternalName();
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("(DZ)C", "L1307577186", "L1657150733");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(104);
        java.lang.String str5 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter4.getStaticHook();
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
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
        classEmitter1.visit(153, (-1), "L1074232078", "java.beans.PropertyDescriptor[name=hi!; displayName=Lorg/mockito/cglib/core/ReflectUtils$4;; constrained]", "L853548068", strArray14);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(5);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int7 = type5.getOpcode(5);
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((-1), type5);
        org.mockito.asm.Type[] typeArray9 = new org.mockito.asm.Type[] { type3, type5 };
        java.lang.String str10 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray9);
        java.lang.String str11 = type0.toString();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = type0.getDimensions();
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter2.visitAnnotation("L1325709370", true);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitEnd();
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
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
        int int20 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type21 = type0.getElementType();
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("D");
        boolean boolean3 = type1.equals((java.lang.Object) 133);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str4 = type1.getInternalName();
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter2.visitAnnotation("java.beans.PropertyDescriptor[name=L527178774; constrained]", true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("L1675365013", true);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
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
        java.lang.String[] strArray19 = new java.lang.String[] { "java.beans.PropertyDescriptor[name=hi!; displayName=L527178774]", "L930922338" };
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
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
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
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter3.visitAnnotation("DL1217139539", false);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor11 = classEmitter7.visitAnnotation("org/mockito/asm/Typejava.beans.PropertyDescriptor[name=hi!]()D", false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("L1850955859", "L1492497655", "(DZ)Lorg/mockito/cglib/core/ReflectUtils$4;");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L1882771997", "D");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("L1859260939", "(DZ)Ljava/lang/Object;", "L1101424300", 130);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
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
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter1.getAccess();
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
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
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
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
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L243601416hi!()Lhi!;", "L847219656", "L1624332484", (int) (byte) 0);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter1.getClassType();
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
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
        classEmitter10.begin_class(116, 134, "L1154135791", type64, typeArray76, "L550373990");
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
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
        classEmitter12.visitSource("L1371906064", "(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)Ljava/lang/Object;");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = classEmitter2.visitAnnotation("L28837920", true);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter4.getClassType();
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("()Lorg/mockito/asm/Type;", "L1882771997", "LL1378241671;");
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("L243747227", "L1463064543");
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter4.getStaticHook();
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
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
        propertyDescriptor10.setValue("L735073802", (java.lang.Object) propertyDescriptor33);
        boolean boolean43 = propertyDescriptor10.isExpert();
        propertyDescriptor10.setShortDescription("L2030468372");
        boolean boolean46 = classInfo5.equals((java.lang.Object) "L2030468372");
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor10 and propertyDescriptor33", propertyDescriptor10.equals(propertyDescriptor33) ? propertyDescriptor10.hashCode() == propertyDescriptor33.hashCode() : true);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.end_class();
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
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
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type1 = classEmitter0.getClassType();
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
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
        java.lang.String[] strArray19 = new java.lang.String[] { "java.beans.PropertyDescriptor[name=hi!; displayName=L527178774]", "L930922338" };
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
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
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
        propertyDescriptor14.setValue("L107191322", (java.lang.Object) "char");
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
        propertyDescriptor57.setName("L1483665173");
        java.beans.PropertyEditor propertyEditor65 = propertyDescriptor42.createPropertyEditor((java.lang.Object) propertyDescriptor57);
        propertyDescriptor57.setShortDescription("L1983213233");
        java.util.Enumeration<java.lang.String> strEnumeration68 = propertyDescriptor57.attributeNames();
        java.util.Enumeration<java.lang.String> strEnumeration69 = propertyDescriptor57.attributeNames();
        boolean boolean70 = type9.equals((java.lang.Object) strEnumeration69);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor57", propertyDescriptor14.equals(propertyDescriptor57) ? propertyDescriptor14.hashCode() == propertyDescriptor57.hashCode() : true);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
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
        classEmitter5.begin_class(116, 42, "L2100326514", type22, typeArray73, "L529014227");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("L2107422026", "L1433958286", "L107191322C", (int) '#');
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("[Ljava/lang/Class;", "L677784237");
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str2 = type1.getClassName();
        int int3 = type1.getSort();
        int int5 = type1.getOpcode(130);
        java.lang.String str6 = type1.getClassName();
        java.lang.String str7 = type1.getDescriptor();
        org.mockito.cglib.core.Local local8 = new org.mockito.cglib.core.Local((int) (short) 1, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int9 = type1.getDimensions();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter2.getClassType();
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter3 = classEmitter1.getStaticHook();
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
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
        org.mockito.cglib.core.Signature signature48 = new org.mockito.cglib.core.Signature("L243601416hi!", type20, typeArray47);
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
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
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
        org.mockito.cglib.core.Signature signature32 = new org.mockito.cglib.core.Signature("L1015173504", type6, typeArray29);
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
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
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
        classEmitter20.visit(133, (int) (short) 0, "L2092968205", "L931003418", "L1289908110", strArray33);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitEnd();
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("L1835218001", false);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("java.beans.PropertyDescriptor[name=L1165862269]", "L243601416", "L336689687", (int) (byte) 10);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        java.lang.String[] strArray12 = new java.lang.String[] { "java.beans.PropertyDescriptor[name=hi!; displayName=L527178774]", "L930922338" };
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
        org.mockito.asm.FieldVisitor fieldVisitor48 = classEmitter1.visitField(154, "L1260232527", "(DZ)L!;", "()J", (java.lang.Object) methodArray47);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitSource("L262929711", "L1865098281");
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
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
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitOuterClass("(DZ)Z", "L1483665173", "java.beans.PropertyDescriptor[name=hi!; displayName=L527178774]");
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(130);
        java.lang.String str5 = type0.getClassName();
        java.lang.String str6 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type0.getInternalName();
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitInnerClass("()LDZ)Ljava/lang/Object;", "L616055911", "org/mockito/asm/Label", 11);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L232574602", "C", "(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)V", 42);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter1.visitAnnotation("L1743030895L1873263643", true);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
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
        classEmitter10.declare_field(39, "L760630667", type23, (java.lang.Object) classArray36);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("LL1015173504;", "java.beans.PropertyDescriptor[]");
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(DZ)D");
        java.lang.String str2 = type1.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type1.getDimensions();
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
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
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
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
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
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
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type2 = classEmitter0.getSuperType();
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
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
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(55, type1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str3 = type1.getInternalName();
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int10 = classEmitter2.getAccess();
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L2049980676", "L1919795115", "L1624332484", 157);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("", "L1127304279", "L1027707825");
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
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
        classEmitter4.visit((int) '4', 130, "L2066651277", "(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)V", "L637597306", strArray19);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
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
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int1 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type0.getDimensions();
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitOuterClass("", "L769878634", "void");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type4.getOpcode(5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type9.getOpcode(5);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type7, type9 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray13);
        java.lang.String str16 = type1.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        int int19 = type18.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type20.getOpcode(5);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type23.getOpcode(5);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type28.getOpcode(5);
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((-1), type28);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type26, type28 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray32);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray32);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("C", type1, typeArray32);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int37 = type1.getDimensions();
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
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
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("L282006869", type1, typeArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type46 = type1.getElementType();
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(IZ)C");
        java.lang.String str3 = signature2.toString();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        int int6 = type4.getOpcode((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str7 = type4.getInternalName();
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.end_class();
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
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
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("L1015173504", type19, typeArray42);
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
        classEmitter2.begin_class(103, 126, "", type15, typeArray70, "L555059025");
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitEnd();
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
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
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.Class<?> wildcardClass19 = signature18.getClass();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass19);
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.FieldVisitor fieldVisitor22 = classEmitter4.visitField((int) '#', "org/mockito/asm/Type", "(SDLg/mockito/asm/Type;Lhi!;Lg/mockito/asm/Type;)Lg/mockito/asm/Type;", "double", (java.lang.Object) str21);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        int int1 = type0.getSort();
        int int2 = type0.getSort();
        int int3 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
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
        org.mockito.asm.FieldVisitor fieldVisitor24 = classEmitter0.visitField(14, "<init>", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; constrained]()LL1015173504;", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; constrained]", (java.lang.Object) type21);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("<init>", "LL1015173504;", "L158821564", 111);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
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
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
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
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
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
        classEmitter0.visit(9, 0, "L1011970028", "L1447124586", "L1812674452", strArray13);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitSource("L392750636", "java.beans.PropertyDescriptor[name=hi!; displayName=Lorg/mockito/asm/Type;; shortDescription=L1015173504; bound]");
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
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
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitSource("L1130833596", "()D");
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter0.visitAnnotation("[Ljava/lang/reflect/Method;", false);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
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
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitOuterClass("(JLorg/mockito/asm/Type;)Lhi!;", "L860796521", "L1167348480");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = classEmitter4.getSuperType();
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("L227264795", "java.beans.PropertyDescriptor[name=hi!; displayName=(IZ)Lhi!;]", "Lg/mockito/cglib/core/ReflectUtils$4;");
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
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
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("L282006869", type1, typeArray40);
        org.mockito.asm.Type type46 = signature45.getReturnType();
        java.lang.String str47 = type46.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str48 = type46.getInternalName();
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L252009378", "D");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("L573408489", "L1628952430(DZ)Lorg/mockito/asm/Type;", "L1486659662");
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
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
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type1.getSize();
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(126, type1);
        int int5 = type1.getOpcode((int) '4');
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type1.getElementType();
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("LL1015173504;", true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
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
        classEmitter2.visit(162, 116, "L2100326514", "C(DZ)Z", "()Lorg.mockito.asm.Type;", strArray16);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
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
        classEmitter2.visit(10, 161, "L61883432", "", "L657669385", strArray20);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
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
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitOuterClass("L340719626", "", "L67066632");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int2 = type1.getDimensions();
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("(DZ)Lava.beans.PropertyDescriptor[name=hi!;", "L241975646");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter1.visitAnnotation("java.beans.PropertyDescriptor[name=L243601416]", false);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
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
        classEmitter1.visit((-1), 0, "()Lva/lang/Object;", "C", "L971073760", strArray14);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter2.visitAnnotation("long", false);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("L2049980676", "org.mockito.asm.Type", "L847304089");
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
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
        classEmitter4.visit(134, 60, "L1725911421", "org/mockito/asm/Typejava.beans.PropertyDescriptor[name=hi!]()D", "L487505049", strArray14);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L616055911", "L2108296472");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
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
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitSource("java/lang/Object", "Z");
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter0.visitAnnotation("L1495984023", true);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitSource("L2087503466", "L323700656");
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter2.visitAnnotation("L1486659662", false);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(DZ)J");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.end_class();
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("hi!", "");
        java.lang.String str3 = signature2.getName();
        java.lang.String str4 = signature2.toString();
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str6 = type5.getClassName();
        int int7 = type5.getSort();
        int int9 = type5.getOpcode(104);
        boolean boolean10 = signature2.equals((java.lang.Object) 104);
        java.lang.reflect.Method method12 = null;
        java.lang.reflect.Method method13 = null;
        java.beans.PropertyDescriptor propertyDescriptor14 = new java.beans.PropertyDescriptor("L527178774", method12, method13);
        java.util.Enumeration<java.lang.String> strEnumeration15 = propertyDescriptor14.attributeNames();
        boolean boolean16 = signature2.equals((java.lang.Object) propertyDescriptor14);
        java.lang.String str17 = signature2.getName();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.CHAR_TYPE;
        int int20 = type18.getOpcode(10);
        java.lang.String str21 = type18.getClassName();
        int int22 = type18.getSize();
        boolean boolean23 = signature2.equals((java.lang.Object) type18);
        java.lang.String str24 = signature2.getName();
        java.lang.reflect.Method method26 = null;
        java.lang.reflect.Method method27 = null;
        java.beans.PropertyDescriptor propertyDescriptor28 = new java.beans.PropertyDescriptor("hi!", method26, method27);
        propertyDescriptor28.setHidden(false);
        propertyDescriptor28.setDisplayName("boolean");
        boolean boolean33 = propertyDescriptor28.isHidden();
        boolean boolean34 = propertyDescriptor28.isPreferred();
        java.lang.reflect.Method method35 = null;
        propertyDescriptor28.setWriteMethod(method35);
        java.lang.String str37 = propertyDescriptor28.getDisplayName();
        boolean boolean38 = signature2.equals((java.lang.Object) str37);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor14 and propertyDescriptor28", propertyDescriptor14.equals(propertyDescriptor28) ? propertyDescriptor14.hashCode() == propertyDescriptor28.hashCode() : true);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getReturnType("(IZ)Z");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str2 = type1.getInternalName();
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter10 = classEmitter7.getStaticHook();
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test347");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("C", "java.beans.PropertyDescriptor[name=hi!; displayName=(IZ)Lhi!;]", "L1853631486", 11);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test348");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter1.getStaticHook();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test349");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L53811120", "void", "Ljava.beans.PropertyDescriptor[name=hi!; displayName=boolean; propertyEditorClass=class org.mockito.asm.Type];");
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test350");
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
        int int20 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str21 = type0.getInternalName();
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test351");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("L323700656", "L555318549", "L822826927");
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test352");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter1.visitAnnotation("", true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test353");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitInnerClass("java.beans.PropertyDescriptor[name=Z]", "L360214043", "L198171552", 39);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test354");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor7 = classEmitter4.visitAnnotation("java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={L276889264=5}]", false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test355");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test356");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L1069200501", "L1515966778");
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test357");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitEnd();
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test358");
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
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test359");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("L107191322", false);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test360");
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
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test361");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int2 = type0.getOpcode(5);
        int int3 = type0.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = type0.getElementType();
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test362");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("L1177214773", "L773677935", "L957468783");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test363");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type4.getOpcode(5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type9.getOpcode(5);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type7, type9 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray13);
        java.lang.String str16 = type1.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        int int19 = type18.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type20.getOpcode(5);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type23.getOpcode(5);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type28.getOpcode(5);
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((-1), type28);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type26, type28 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray32);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray32);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("C", type1, typeArray32);
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        org.mockito.asm.Type type38 = signature36.getReturnType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int39 = type38.getDimensions();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test364");
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
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test365");
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
        classEmitter2.visit(2, 141, "java.beans.PropertyDescriptor[name=Lorg/mockito/cglib/core/Signature;]", "L1328672204", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; preferred; hidden]", strArray17);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test366");
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
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test367");
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
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test368");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter4.getStaticHook();
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test369");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter2.visitAnnotation("L714189134", true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test370");
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
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test371");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classEmitter7.visitAnnotation("java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={L276889264=5}]", true);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test372");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.LONG_TYPE;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int1 = type0.getDimensions();
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test373");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitOuterClass("L1609201004", "L1927308696", "I");
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test374");
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
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("L1433958286", type38, typeArray45);
        java.lang.Class[] classArray48 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray45);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.begin_class(59, (int) (short) -1, "L259469216", type25, typeArray45, "L1211050741");
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test375");
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
        classEmitter1.visit(59, 8, "java.beans.PropertyDescriptor[name=[Ljava/beans/PropertyDescriptor;; values={L1406423095=L1402247005}]", "LL1015173504;", "L1540179652", strArray15);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test376");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(130);
        int int5 = type0.getSort();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = type0.getDimensions();
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test377");
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
        propertyDescriptor3.setValue("L107191322", (java.lang.Object) "char");
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
        propertyDescriptor46.setName("L1483665173");
        java.beans.PropertyEditor propertyEditor54 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptor46);
        propertyDescriptor46.setShortDescription("L1983213233");
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
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test378");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("L1402247005", "L262929711", "L1900097269");
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test379");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("Lorg/mockito/asm/Type;", "(IZ)C");
        java.lang.String str3 = signature2.toString();
        org.mockito.asm.Type type4 = signature2.getReturnType();
        int int6 = type4.getOpcode(1);
        java.lang.String str7 = type4.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type4.getElementType();
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test380");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((-1), type1);
        org.mockito.asm.Type type5 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str6 = type5.getInternalName();
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test381");
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
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test382");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitSource("java.lang.Object(DZ)Lava.beans.PropertyDescriptor[name=hi!;", "L67066632");
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test383");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        org.mockito.asm.Type type4 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int6 = type4.getOpcode(5);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type9 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int11 = type9.getOpcode(5);
        org.mockito.cglib.core.Local local12 = new org.mockito.cglib.core.Local((-1), type9);
        org.mockito.asm.Type[] typeArray13 = new org.mockito.asm.Type[] { type7, type9 };
        java.lang.String str14 = org.mockito.asm.Type.getMethodDescriptor(type4, typeArray13);
        java.lang.String str15 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray13);
        java.lang.String str16 = type1.toString();
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("hi!");
        int int19 = type18.getSort();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int22 = type20.getOpcode(5);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int25 = type23.getOpcode(5);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type28 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int30 = type28.getOpcode(5);
        org.mockito.cglib.core.Local local31 = new org.mockito.cglib.core.Local((-1), type28);
        org.mockito.asm.Type[] typeArray32 = new org.mockito.asm.Type[] { type26, type28 };
        java.lang.String str33 = org.mockito.asm.Type.getMethodDescriptor(type23, typeArray32);
        java.lang.String str34 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray32);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type18, typeArray32);
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("C", type1, typeArray32);
        org.mockito.asm.Type[] typeArray37 = signature36.getArgumentTypes();
        org.mockito.asm.Type type38 = signature36.getReturnType();
        int int39 = type38.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type40 = type38.getElementType();
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test384");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test385");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("D(IZ)Z", "(DZ)Lava.beans.PropertyDescriptor[name=hi!;");
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test386");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("java.beans.PropertyDescriptor[name=hi!; constrained; propertyEditorClass=class org.mockito.asm.Type]", "L1687185638", "L543133615");
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test387");
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
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor14 = classEmitter11.visitAnnotation("DL1217139539", false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test388");
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
        propertyDescriptor31.setName("L1294565354");
        boolean boolean41 = propertyDescriptor31.isPreferred();
        label0.info = boolean41;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor17 and propertyDescriptor31", propertyDescriptor17.equals(propertyDescriptor31) ? propertyDescriptor17.hashCode() == propertyDescriptor31.hashCode() : true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test389");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor13 = classEmitter7.visitAnnotation("[Ljava/lang/String;", false);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test390");
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
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test391");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        int int4 = type0.getOpcode(104);
        java.lang.String str5 = type0.getDescriptor();
        int int6 = type0.getSize();
        java.lang.String str7 = type0.getDescriptor();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int8 = type0.getDimensions();
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test392");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter5.visitSource("L123987976", "");
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test393");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = classEmitter0.getAccess();
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test394");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter4.visitAnnotation("L1820870291", false);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test395");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitEnd();
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test396");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.visitEnd();
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test397");
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
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test398");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitSource("LLorg/mockito/asm/Type;;", "L1509485977");
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test399");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter3.visitInnerClass("L259469216", "(DZ)LL276889264;", "Lg/mockito/cglib/core/ReflectUtils$4;", 50);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test400");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean7 = signature2.equals((java.lang.Object) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L107191322", "L95535466", "L1927308696");
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test401");
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
        java.beans.PropertyDescriptor propertyDescriptor55 = new java.beans.PropertyDescriptor("L616055911", method53, method54);
        boolean boolean56 = type13.equals((java.lang.Object) method54);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor5 and propertyDescriptor55", propertyDescriptor5.equals(propertyDescriptor55) ? propertyDescriptor5.hashCode() == propertyDescriptor55.hashCode() : true);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test402");
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
        java.beans.PropertyDescriptor propertyDescriptor44 = new java.beans.PropertyDescriptor("L1983213233", method42, method43);
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
        propertyDescriptor51.setDisplayName("L527178774");
        boolean boolean61 = propertyDescriptor51.isHidden();
        java.lang.String str62 = propertyDescriptor51.getName();
        propertyDescriptor51.setBound(false);
        java.lang.reflect.Method method67 = null;
        java.lang.reflect.Method method68 = null;
        java.beans.PropertyDescriptor propertyDescriptor69 = new java.beans.PropertyDescriptor("(DZ)C", method67, method68);
        propertyDescriptor69.setBound(false);
        boolean boolean72 = propertyDescriptor69.isExpert();
        propertyDescriptor51.setValue("L9433643", (java.lang.Object) boolean72);
        java.lang.Class<?> wildcardClass74 = propertyDescriptor51.getPropertyType();
        boolean boolean75 = type19.equals((java.lang.Object) wildcardClass74);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor44 and propertyDescriptor51", propertyDescriptor44.equals(propertyDescriptor51) ? propertyDescriptor44.hashCode() == propertyDescriptor51.hashCode() : true);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test403");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitInnerClass("java.beans.PropertyDescriptor[name=DL1217139539]", "java.beans.PropertyDescriptor[name=hi!; displayName=(IZ)Lhi!;]", "()LL805361884;", 155);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test404");
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
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test405");
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
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test406");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = 1.0d;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        java.lang.Object obj7 = label0.info;
        java.lang.Object obj8 = label0.info;
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        propertyDescriptor12.setHidden(false);
        propertyDescriptor12.setDisplayName("boolean");
        boolean boolean17 = propertyDescriptor12.isHidden();
        label0.info = propertyDescriptor12;
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("L1378241671", method20, method21);
        java.lang.reflect.Method method23 = null;
        propertyDescriptor22.setReadMethod(method23);
        java.lang.String str25 = propertyDescriptor22.getShortDescription();
        java.lang.String str26 = propertyDescriptor22.getName();
        label0.info = propertyDescriptor22;
        java.lang.String str28 = label0.toString();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor12 and propertyDescriptor22", propertyDescriptor12.equals(propertyDescriptor22) ? propertyDescriptor12.hashCode() == propertyDescriptor22.hashCode() : true);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test407");
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
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test408");
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
        org.mockito.cglib.core.Signature signature83 = new org.mockito.cglib.core.Signature("L243601416hi!", type47, typeArray79);
        java.lang.String str84 = org.mockito.asm.Type.getMethodDescriptor(type37, typeArray79);
        org.mockito.cglib.core.Signature signature85 = new org.mockito.cglib.core.Signature("L107191322C", type24, typeArray79);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type86 = type24.getElementType();
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test409");
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
        org.mockito.cglib.core.Signature signature36 = new org.mockito.cglib.core.Signature("L22359859", type23, typeArray35);
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
        classEmitter2.declare_field(2, "L1399587278java.beans.PropertyDescriptor[name=hi!; constrained]", type23, (java.lang.Object) typeArray46);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test410");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(IZ)Lhi!;");
        org.mockito.asm.Type type2 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type3 = type2.getElementType();
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test411");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitOuterClass("java.beans.PropertyDescriptor[name=hi!; bound; constrained]", "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; values={L180128060=L1737028653}; propertyEditorClass=class java.beans.PropertyDescriptor]", "L1787250729");
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test412");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L1404740322", "L559327504");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test413");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo2 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("L1404740322", "L1001661467");
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test414");
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
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test415");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L573408489", "L803421219", "Lg.mockito.asm.Type;");
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test416");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test417");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter5 = classEmitter2.getStaticHook();
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test418");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter6.visitEnd();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test419");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor5 = classEmitter0.visitAnnotation("L294598047", true);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test420");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter22.visitEnd();
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test421");
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
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test422");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getObjectType("L836942535");
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
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test423");
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
        classEmitter22.visit(36, 50, "L2066651277", "L1578268957", "L259469216", strArray32);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test424");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter4.getAccess();
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test425");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter11.end_class();
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test426");
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
        classEmitter2.visit(100, 137, "Lorg/mockito/cglib/core/Signature;()C", "L734420874", "L1989372756", strArray13);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test427");
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
        org.mockito.cglib.core.Signature signature34 = new org.mockito.cglib.core.Signature("L1015173504", type4, typeArray33);
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray33);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type36 = type1.getElementType();
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test428");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitSource("", "(Ljava/lang/Object;LIZ)Lhi!;Lhi!;FZ)Ljava/lang/Object;");
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test429");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter4.getSuperType();
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test430");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor6 = classEmitter3.visitAnnotation("L1721750686", false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test431");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test432");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean7 = signature2.equals((java.lang.Object) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter4.getStaticHook();
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test433");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("L107262255", "L147808947", "Lg/mockito/asm/Type;", 155);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test434");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter2 = classEmitter1.getStaticHook();
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test435");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.CHAR_TYPE;
        int int2 = type0.getOpcode(10);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int3 = type0.getDimensions();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test436");
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
        classEmitter12.visitInnerClass("", "L1307577186", "", 0);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test437");
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
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test438");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        boolean boolean4 = propertyDescriptor3.isPreferred();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        propertyDescriptor9.setHidden(false);
        java.lang.reflect.Method method12 = propertyDescriptor9.getReadMethod();
        java.lang.reflect.Method method13 = propertyDescriptor9.getReadMethod();
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
        java.beans.PropertyEditor propertyEditor29 = propertyDescriptor9.createPropertyEditor((java.lang.Object) str28);
        propertyDescriptor9.setName("(IZ)C");
        java.lang.reflect.Method method32 = null;
        propertyDescriptor9.setReadMethod(method32);
        java.lang.reflect.Method method34 = propertyDescriptor9.getWriteMethod();
        boolean boolean35 = propertyDescriptor9.isHidden();
        java.beans.PropertyEditor propertyEditor36 = propertyDescriptor3.createPropertyEditor((java.lang.Object) boolean35);
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("Z", method38, method39);
        boolean boolean41 = propertyDescriptor40.isPreferred();
        java.util.Enumeration<java.lang.String> strEnumeration42 = propertyDescriptor40.attributeNames();
        java.beans.PropertyEditor propertyEditor43 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor40);
        propertyDescriptor3.setPreferred(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor9 and propertyDescriptor40", propertyDescriptor9.equals(propertyDescriptor40) ? propertyDescriptor9.hashCode() == propertyDescriptor40.hashCode() : true);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test439");
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
        classEmitter1.begin_class(19, 15, "L559327504", type40, typeArray53, "");
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test440");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter6 = classEmitter3.getStaticHook();
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test441");
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
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getObjectType("L1015173504");
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
        classEmitter7.begin_class(60, 8, "L1674626025", type16, typeArray31, "L2030468372");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test442");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("(IZ)Lhi!;");
        java.lang.String str2 = type1.getInternalName();
        java.lang.String str3 = type1.getInternalName();
        java.lang.String str4 = type1.getInternalName();
        org.mockito.asm.Type type5 = type1.getElementType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = type5.getElementType();
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test443");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = ' ';
        java.lang.Object obj4 = label0.info;
        org.mockito.asm.Type type5 = org.mockito.asm.Type.BYTE_TYPE;
        int int6 = type5.getSort();
        label0.info = type5;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = type5.getElementType();
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test444");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("java.beans.PropertyDescriptor[name=hi!; preferred]", "L1211050741", "L1674626025");
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test445");
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
        classEmitter31.visitOuterClass("L957468783", "L1624332484", "L392920397");
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test446");
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
        propertyDescriptor3.setValue("L107191322", (java.lang.Object) "char");
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
        propertyDescriptor46.setName("L1483665173");
        java.beans.PropertyEditor propertyEditor54 = propertyDescriptor31.createPropertyEditor((java.lang.Object) propertyDescriptor46);
        propertyDescriptor46.setShortDescription("L1983213233");
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
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test447");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("Z");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(153, type2);
        org.mockito.asm.Type type4 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int5 = type4.getDimensions();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test448");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.getType("Z");
        org.mockito.cglib.core.Local local3 = new org.mockito.cglib.core.Local(153, type2);
        org.mockito.asm.Type type4 = local3.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str5 = type4.getInternalName();
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test449");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean7 = signature2.equals((java.lang.Object) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter4.getClassType();
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test450");
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
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter12 = classEmitter8.getStaticHook();
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test451");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitOuterClass("java.beans.PropertyDescriptor[name=L616055911]", "L1510687310", "java.beans.PropertyDescriptor[name=hi!; shortDescription=Lhi!;]");
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test452");
        org.mockito.cglib.core.Signature signature2 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "java.beans.PropertyDescriptor[name=hi!]");
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        boolean boolean7 = signature2.equals((java.lang.Object) classEmitter4);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitOuterClass("L1868675227", "java.beans.PropertyDescriptor[name=java/lang/Object; displayName=boolean]", "L2125215800");
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test453");
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
        org.mockito.cglib.core.Signature signature27 = new org.mockito.cglib.core.Signature("L1433958286", type18, typeArray25);
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
        classEmitter0.visit(5, 154, "L9368052", "L1556693900", "L1338734287", strArray51);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test454");
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
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter8.visitOuterClass("L737265985", "L2137549886", "");
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test455");
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
        classEmitter1.visit(116, 3, "L847436125", "L1329877052", "L30606234", strArray14);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test456");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor26 = classEmitter7.visitAnnotation("L357584586", true);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test457");
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
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test458");
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
        propertyDescriptor3.setValue("L107191322", (java.lang.Object) "char");
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
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test459");
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
        classEmitter1.visit(19, 52, "java.beans.PropertyDescriptor[name=hi!; displayName=boolean; hidden]", "L526777644", "L2060067062", strArray30);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test460");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("L1074232078");
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
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test461");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter8 = classEmitter6.getStaticHook();
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test462");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor4 = classEmitter1.visitAnnotation("char", true);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test463");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo6 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int7 = classEmitter4.getAccess();
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test464");
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
        org.mockito.cglib.core.ClassInfo classInfo11 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = classEmitter4.getAccess();
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test465");
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
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type13 = classEmitter8.getSuperType();
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test466");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test467");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitInnerClass("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=hi!; displayName=boolean; constrained]]", "L6743491", "Lva/lang/Object;", 133);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test468");
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
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test469");
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
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test470");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = classEmitter10.getAccess();
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test471");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        java.lang.String str6 = type1.getClassName();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type7 = type1.getElementType();
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test472");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter10.visitSource("L1369303883", "L2125215800");
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test473");
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
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test474");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int6 = classEmitter1.getAccess();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test475");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter3);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor8 = classEmitter5.visitAnnotation("L979907335", true);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test476");
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
        classEmitter2.visit(0, 16, "L23134466", "LL939962487;", "L1711109982", strArray26);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test477");
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
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        org.mockito.cglib.core.ClassInfo classInfo12 = classEmitter8.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter13 = classEmitter8.getStaticHook();
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test478");
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
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test479");
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
        org.mockito.cglib.core.ClassInfo classInfo10 = classEmitter8.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter11 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter8);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int12 = classEmitter8.getAccess();
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test480");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter24 = classEmitter7.getStaticHook();
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test481");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type4 = classEmitter2.getSuperType();
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test482");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.LONG_TYPE;
        int int2 = type1.getSort();
        int int3 = type1.getSort();
        org.mockito.cglib.core.Signature signature6 = new org.mockito.cglib.core.Signature("", "(SDLg/mockito/asm/Type;Lhi!;Lg/mockito/asm/Type;)Lg/mockito/asm/Type;");
        org.mockito.asm.Type[] typeArray7 = signature6.getArgumentTypes();
        org.mockito.cglib.core.Signature signature8 = new org.mockito.cglib.core.Signature("L630049513", type1, typeArray7);
        int int9 = type1.getSize();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str10 = type1.getInternalName();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test483");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter4);
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter5);
        classEmitter3.setTarget((org.mockito.asm.ClassVisitor) classEmitter7);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitEnd();
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test484");
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
        classEmitter4.visit(136, 9, "(SDLg/mockito/asm/Type;Lhi!;Lg/mockito/asm/Type;)Lg/mockito/asm/Type;", "", "L137483190", strArray21);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test485");
        org.mockito.asm.Label label0 = new org.mockito.asm.Label();
        java.lang.Object obj1 = label0.info;
        label0.info = 1.0d;
        java.lang.String str4 = label0.toString();
        java.lang.String str5 = label0.toString();
        java.lang.String str6 = label0.toString();
        java.lang.Object obj7 = label0.info;
        java.lang.Object obj8 = label0.info;
        java.lang.reflect.Method method10 = null;
        java.lang.reflect.Method method11 = null;
        java.beans.PropertyDescriptor propertyDescriptor12 = new java.beans.PropertyDescriptor("hi!", method10, method11);
        propertyDescriptor12.setHidden(false);
        propertyDescriptor12.setDisplayName("boolean");
        boolean boolean17 = propertyDescriptor12.isHidden();
        label0.info = propertyDescriptor12;
        java.lang.reflect.Method method20 = null;
        java.lang.reflect.Method method21 = null;
        java.beans.PropertyDescriptor propertyDescriptor22 = new java.beans.PropertyDescriptor("L1378241671", method20, method21);
        java.lang.reflect.Method method23 = null;
        propertyDescriptor22.setReadMethod(method23);
        java.lang.String str25 = propertyDescriptor22.getShortDescription();
        java.lang.String str26 = propertyDescriptor22.getName();
        label0.info = propertyDescriptor22;
        java.lang.Object obj28 = label0.info;
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor12 and obj28", propertyDescriptor12.equals(obj28) ? propertyDescriptor12.hashCode() == obj28.hashCode() : true);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test486");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor12 = classEmitter2.visitAnnotation("java.beans.PropertyDescriptor[name=Lorg/mockito/cglib/core/Signature;]", false);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test487");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitSource("L1609201004", "L1805744537");
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test488");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("hi!", method1, method2);
        boolean boolean4 = propertyDescriptor3.isPreferred();
        java.lang.String str5 = propertyDescriptor3.getName();
        java.lang.reflect.Method method7 = null;
        java.lang.reflect.Method method8 = null;
        java.beans.PropertyDescriptor propertyDescriptor9 = new java.beans.PropertyDescriptor("hi!", method7, method8);
        propertyDescriptor9.setHidden(false);
        java.lang.reflect.Method method12 = propertyDescriptor9.getReadMethod();
        java.lang.reflect.Method method13 = propertyDescriptor9.getReadMethod();
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
        java.beans.PropertyEditor propertyEditor29 = propertyDescriptor9.createPropertyEditor((java.lang.Object) str28);
        propertyDescriptor9.setName("(IZ)C");
        java.lang.reflect.Method method32 = null;
        propertyDescriptor9.setReadMethod(method32);
        java.lang.reflect.Method method34 = propertyDescriptor9.getWriteMethod();
        boolean boolean35 = propertyDescriptor9.isHidden();
        java.beans.PropertyEditor propertyEditor36 = propertyDescriptor3.createPropertyEditor((java.lang.Object) boolean35);
        java.lang.reflect.Method method38 = null;
        java.lang.reflect.Method method39 = null;
        java.beans.PropertyDescriptor propertyDescriptor40 = new java.beans.PropertyDescriptor("Z", method38, method39);
        boolean boolean41 = propertyDescriptor40.isPreferred();
        java.util.Enumeration<java.lang.String> strEnumeration42 = propertyDescriptor40.attributeNames();
        java.beans.PropertyEditor propertyEditor43 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptor40);
        java.lang.String str44 = propertyDescriptor40.getShortDescription();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor9", propertyDescriptor3.equals(propertyDescriptor9) ? propertyDescriptor3.hashCode() == propertyDescriptor9.hashCode() : true);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test489");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter5 = new org.mockito.cglib.core.ClassEmitter();
        classEmitter4.setTarget((org.mockito.asm.ClassVisitor) classEmitter5);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter7 = classEmitter5.getStaticHook();
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test490");
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
        org.mockito.asm.Type type21 = org.mockito.asm.Type.getObjectType("L527178774");
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
        classEmitter2.begin_class(56, 1045, "java.beans.PropertyDescriptor[name=L527178774; propertyEditorClass=class org.mockito.asm.Type]", type15, typeArray77, "L1428906274");
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test491");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter0.visitSource("L1052899054", "L2022404025");
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test492");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter2.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter2);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter2.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type6 = classEmitter2.getClassType();
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test493");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type11 = classEmitter4.getSuperType();
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test494");
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
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.cglib.core.CodeEmitter codeEmitter11 = classEmitter4.getStaticHook();
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test495");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter4.getClassType();
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test496");
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
        classEmitter3.visit(136, 9, "L974364544", "L1688910597", "L860796521", strArray14);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test497");
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
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("L282006869", type1, typeArray40);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        java.lang.String str46 = type1.getInternalName();
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test498");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter7.visitSource("java.beans.PropertyDescriptor[name=hi!; displayName=Lorg/mockito/asm/Type;; shortDescription=L1015173504]", "L1684097181");
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test499");
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
        classEmitter1.visit(136, 103, "L15951421", "ZL527178774", "", strArray18);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test500");
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
}


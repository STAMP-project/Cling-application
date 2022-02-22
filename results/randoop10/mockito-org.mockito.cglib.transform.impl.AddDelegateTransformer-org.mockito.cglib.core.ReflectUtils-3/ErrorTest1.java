import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test501");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitEnd();
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test502");
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
        classEmitter9.visitEnd();
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test503");
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
        classEmitter11.declare_field((int) (short) 1, "L974364544", type33, (java.lang.Object) propertyDescriptorArray47);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test504");
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
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test505");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter1.visitSource("()J", "Djava.beans.PropertyDescriptor[name=hi!; displayName=Lorg/mockito/cglib/core/ReflectUtils$4;; constrained]");
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test506");
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
        org.mockito.asm.Type type18 = org.mockito.asm.Type.getObjectType("L1074232078");
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
        classEmitter10.visit(160, 36, "L1433958286", "L15951421", "L555059025", strArray33);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test507");
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
        classEmitter1.begin_class(0, 166, "L306494686", type24, typeArray54, "L1832383739");
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test508");
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
        classEmitter0.visit(120, (int) (byte) 100, "java.lang.Object", "L1709628984", "L1145121706", strArray11);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test509");
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
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test510");
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
        classEmitter8.visitOuterClass("L1178126774", "L2055556112", "L1989372756");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test511");
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
        java.lang.reflect.Method method55 = propertyDescriptor31.getReadMethod();
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor46", propertyDescriptor3.equals(propertyDescriptor46) ? propertyDescriptor3.hashCode() == propertyDescriptor46.hashCode() : true);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test512");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter3 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter4.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter4.visitEnd();
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test513");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        int int4 = type1.getSize();
        org.mockito.cglib.core.Local local5 = new org.mockito.cglib.core.Local((int) '4', type1);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getObjectType("hi!");
        int int9 = type8.getSort();
        org.mockito.asm.Type type10 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int12 = type10.getOpcode(5);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int15 = type13.getOpcode(5);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.DOUBLE_TYPE;
        org.mockito.asm.Type type18 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int20 = type18.getOpcode(5);
        org.mockito.cglib.core.Local local21 = new org.mockito.cglib.core.Local((-1), type18);
        org.mockito.asm.Type[] typeArray22 = new org.mockito.asm.Type[] { type16, type18 };
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type13, typeArray22);
        java.lang.String str24 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray22);
        java.lang.String str25 = org.mockito.asm.Type.getMethodDescriptor(type8, typeArray22);
        org.mockito.cglib.core.Local local26 = new org.mockito.cglib.core.Local(156, type8);
        boolean boolean27 = type1.equals((java.lang.Object) 156);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int28 = type1.getDimensions();
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test514");
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
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test515");
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
        propertyDescriptor31.setBound(true);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on propertyDescriptor3 and propertyDescriptor46", propertyDescriptor3.equals(propertyDescriptor46) ? propertyDescriptor3.hashCode() == propertyDescriptor46.hashCode() : true);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test516");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.VOID_TYPE;
        org.mockito.cglib.core.Local local2 = new org.mockito.cglib.core.Local(55, type1);
        org.mockito.asm.Type type3 = local2.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int4 = type3.getDimensions();
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test517");
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
        org.mockito.asm.Type type13 = classEmitter10.getClassType();
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test518");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type8 = classEmitter6.getSuperType();
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test519");
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
        classEmitter10.visitSource("java.beans.PropertyDescriptor[name=hi!; displayName=boolean; hidden; values={java.beans.PropertyDescriptor[name=hi!]=java.beans.PropertyDescriptor[name=hi!; displayName=boolean; shortDescription=(IZ)Lhi!;]}]", "java.beans.PropertyDescriptor[name=DL1217139539]");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test520");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter0.getClassInfo();
        org.mockito.cglib.core.ClassInfo classInfo4 = classEmitter0.getClassInfo();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.Type type5 = classEmitter0.getClassType();
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test521");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo3 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter4 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassInfo classInfo5 = classEmitter1.getClassInfo();
        org.mockito.cglib.core.ClassEmitter classEmitter6 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        org.mockito.cglib.core.ClassEmitter classEmitter7 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter6);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        org.mockito.asm.AnnotationVisitor annotationVisitor10 = classEmitter6.visitAnnotation("L567189636", true);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test522");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.BOOLEAN_TYPE;
        int int3 = type1.getOpcode(5);
        org.mockito.cglib.core.Local local4 = new org.mockito.cglib.core.Local((-1), type1);
        org.mockito.asm.Type type5 = local4.getType();
        int int6 = local4.getIndex();
        int int7 = local4.getIndex();
        int int8 = local4.getIndex();
        org.mockito.asm.Type type9 = local4.getType();
        int int10 = local4.getIndex();
        org.mockito.asm.Type type11 = local4.getType();
        org.mockito.asm.Type type12 = local4.getType();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        int int13 = type12.getDimensions();
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest1.test523");
        org.mockito.cglib.core.ClassEmitter classEmitter0 = new org.mockito.cglib.core.ClassEmitter();
        org.mockito.cglib.core.ClassEmitter classEmitter1 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter0);
        org.mockito.cglib.core.ClassEmitter classEmitter2 = new org.mockito.cglib.core.ClassEmitter((org.mockito.asm.ClassVisitor) classEmitter1);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        classEmitter2.visitOuterClass("java.beans.PropertyDescriptor[name=boolean]", "L168898091", "L573395978");
    }
}


import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest32 {

    public static boolean debug = false;

    @Test
    public void test16001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16001");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type[] typeArray5 = classInfo4.getInterfaces();
        boolean boolean7 = classInfo4.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type8 = classInfo4.getType();
        int int9 = type8.getSize();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test16002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16002");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("()D", method1, method2);
        propertyDescriptor3.setPreferred(false);
        java.util.Enumeration<java.lang.String> strEnumeration6 = propertyDescriptor3.attributeNames();
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getClass();
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass7);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass10 = type9.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray11 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass10);
        java.lang.String str12 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass10);
        java.beans.PropertyDescriptor[] propertyDescriptorArray13 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass10);
        java.lang.String str14 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass10);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass10);
        java.lang.String str18 = type17.toString();
        boolean boolean19 = classInfo8.equals((java.lang.Object) type17);
        int int20 = classInfo8.getModifiers();
        org.mockito.asm.Type type21 = classInfo8.getType();
        org.mockito.asm.Type type22 = classInfo8.getType();
        org.mockito.asm.Type type23 = classInfo8.getType();
        java.lang.String str24 = type23.getClassName();
        java.lang.String str25 = type23.getClassName();
        org.junit.Assert.assertNotNull(strEnumeration6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(classInfo8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(wildcardClass10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org/mockito/asm/Type" + "'", str12, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str14, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str16, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str18, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "java.beans.PropertyDescriptor" + "'", str24, "java.beans.PropertyDescriptor");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "java.beans.PropertyDescriptor" + "'", str25, "java.beans.PropertyDescriptor");
    }

    @Test
    public void test16003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16003");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setPreferred(true);
        java.lang.String str12 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method13 = null;
        propertyDescriptor3.setReadMethod(method13);
        java.lang.reflect.Method method15 = propertyDescriptor3.getReadMethod();
        propertyDescriptor3.setPreferred(true);
        propertyDescriptor3.setDisplayName("L()Lg/mockito/asm/Type;;");
        propertyDescriptor3.setConstrained(false);
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()D=1}]");
        java.lang.String str24 = propertyDescriptor3.getShortDescription();
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass27 = type26.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass27);
        java.lang.String str29 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass27);
        org.mockito.cglib.core.ClassInfo classInfo30 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass27);
        org.mockito.asm.Type[] typeArray31 = classInfo30.getInterfaces();
        boolean boolean33 = classInfo30.equals((java.lang.Object) 10L);
        org.mockito.asm.Type type34 = classInfo30.getType();
        java.lang.String str35 = classInfo30.toString();
        java.lang.String str36 = classInfo30.toString();
        org.mockito.asm.Type type38 = org.mockito.asm.Type.getReturnType("LLjava/lang/Object;;");
        boolean boolean39 = classInfo30.equals((java.lang.Object) type38);
        org.mockito.asm.Type type40 = classInfo30.getType();
        propertyDescriptor3.setValue("ava.beans.PropertyDescriptor[name=org/mockito/asm/Type", (java.lang.Object) classInfo30);
        java.lang.String str42 = classInfo30.toString();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(Z)C" + "'", str12, "(Z)C");
        org.junit.Assert.assertNull(method15);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "L()Lg/mockito/asm/Type;;" + "'", str24, "L()Lg/mockito/asm/Type;;");
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "org/mockito/asm/Type" + "'", str29, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org.mockito.asm.Type" + "'", str35, "org.mockito.asm.Type");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "org.mockito.asm.Type" + "'", str36, "org.mockito.asm.Type");
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "org.mockito.asm.Type" + "'", str42, "org.mockito.asm.Type");
    }

    @Test
    public void test16004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16004");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        java.lang.String str6 = classInfo4.toString();
        org.mockito.asm.Type type7 = classInfo4.getSuperType();
        int int8 = classInfo4.getModifiers();
        org.mockito.asm.Type type9 = classInfo4.getType();
        int int10 = classInfo4.getModifiers();
        org.mockito.asm.Type[] typeArray11 = classInfo4.getInterfaces();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.mockito.asm.Type" + "'", str6, "org.mockito.asm.Type");
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(typeArray11);
    }

    @Test
    public void test16005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16005");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setShortDescription("Z");
        boolean boolean12 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setBound(false);
        java.lang.reflect.Method method15 = null;
        propertyDescriptor3.setReadMethod(method15);
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getObjectType("char");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass21 = type20.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass21);
        java.lang.String str23 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass21);
        org.mockito.cglib.core.ClassInfo classInfo25 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type26 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass21);
        org.mockito.asm.Type type28 = org.mockito.asm.Type.CHAR_TYPE;
        int int30 = type28.getOpcode(0);
        int int31 = type28.getSort();
        org.mockito.asm.Type type32 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass33 = type32.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray34 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass33);
        java.lang.String str35 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass33);
        java.beans.PropertyDescriptor[] propertyDescriptorArray36 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass33);
        org.mockito.cglib.core.ClassInfo classInfo37 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass33);
        org.mockito.asm.Type[] typeArray38 = classInfo37.getInterfaces();
        org.mockito.cglib.core.Signature signature39 = new org.mockito.cglib.core.Signature("", type28, typeArray38);
        boolean boolean40 = type26.equals((java.lang.Object) typeArray38);
        java.lang.String str41 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray38);
        org.mockito.asm.Type type42 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type43 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean45 = type43.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type[] typeArray46 = new org.mockito.asm.Type[] { type43 };
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type42, typeArray46);
        java.lang.String str48 = org.mockito.asm.Type.getMethodDescriptor(type19, typeArray46);
        java.lang.Class<?> wildcardClass49 = typeArray46.getClass();
        org.mockito.cglib.core.ClassInfo classInfo50 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass49);
        org.mockito.asm.Type type51 = classInfo50.getType();
        org.mockito.asm.Type type52 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean54 = type52.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass55 = type52.getClass();
        java.lang.String str56 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass55);
        java.beans.PropertyDescriptor[] propertyDescriptorArray57 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass55);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass55);
        java.lang.String str59 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass55);
        java.beans.PropertyDescriptor[] propertyDescriptorArray60 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass55);
        java.beans.PropertyDescriptor[] propertyDescriptorArray61 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass55);
        boolean boolean62 = classInfo50.equals((java.lang.Object) propertyDescriptorArray61);
        java.lang.String str63 = classInfo50.toString();
        java.lang.String str64 = classInfo50.toString();
        org.mockito.asm.Type type65 = classInfo50.getSuperType();
        propertyDescriptor3.setValue("int", (java.lang.Object) type65);
        java.lang.String str67 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setShortDescription("org.mockito.asm.Type[]java.beans.PropertyDescriptor[name=(Z)C; displayName=org.mockito.asm.Type; values={org/mockito/asm/Type=char}; constrained]");
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "org/mockito/asm/Type" + "'", str23, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertNotNull(classInfo25);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertNotNull(wildcardClass33);
        org.junit.Assert.assertNotNull(propertyDescriptorArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "org/mockito/asm/Type" + "'", str35, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray36);
        org.junit.Assert.assertNotNull(classInfo37);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "()Lchar;" + "'", str41, "()Lchar;");
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "(Z)C" + "'", str47, "(Z)C");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "(Z)Lchar;" + "'", str48, "(Z)Lchar;");
        org.junit.Assert.assertNotNull(wildcardClass49);
        org.junit.Assert.assertNotNull(classInfo50);
        org.junit.Assert.assertNotNull(type51);
        org.junit.Assert.assertNotNull(type52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "org/mockito/asm/Type" + "'", str56, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray57);
        org.junit.Assert.assertNotNull(propertyDescriptorArray58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "org/mockito/asm/Type" + "'", str59, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray60);
        org.junit.Assert.assertNotNull(propertyDescriptorArray61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "org.mockito.asm.Type[]" + "'", str63, "org.mockito.asm.Type[]");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "org.mockito.asm.Type[]" + "'", str64, "org.mockito.asm.Type[]");
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "(Z)C" + "'", str67, "(Z)C");
    }

    @Test
    public void test16006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16006");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.lang.String str5 = classInfo4.toString();
        java.lang.Object[] objArray11 = new java.lang.Object[] { (byte) -1, (short) -1, '4', 10, 0.0f };
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses(objArray11);
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        java.lang.Class[] classArray16 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) strArray15);
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass21 = type20.getClass();
        boolean boolean22 = signature19.equals((java.lang.Object) wildcardClass21);
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass21);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass21);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray24, true, true);
        java.lang.reflect.Method[] methodArray28 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray15, methodArray27);
        boolean boolean29 = classInfo4.equals((java.lang.Object) methodArray27);
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("(Z)C", method31, method32);
        propertyDescriptor33.setBound(true);
        java.lang.Class<?> wildcardClass36 = propertyDescriptor33.getPropertyType();
        boolean boolean37 = propertyDescriptor33.isExpert();
        propertyDescriptor33.setValue("org/mockito/asm/TypeLorg/mockito/asm/Type;", (java.lang.Object) 10.0d);
        java.lang.reflect.Method method41 = null;
        propertyDescriptor33.setWriteMethod(method41);
        java.lang.Object obj44 = propertyDescriptor33.getValue("");
        java.util.Enumeration<java.lang.String> strEnumeration45 = propertyDescriptor33.attributeNames();
        org.mockito.cglib.core.Signature signature49 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "D");
        java.lang.String str50 = signature49.toString();
        java.lang.String str51 = signature49.getDescriptor();
        propertyDescriptor33.setValue("(Z)C", (java.lang.Object) str51);
        java.lang.Class<?> wildcardClass53 = propertyDescriptor33.getPropertyEditorClass();
        boolean boolean54 = classInfo4.equals((java.lang.Object) wildcardClass53);
        org.mockito.asm.Type type55 = classInfo4.getType();
        java.lang.String str56 = type55.getDescriptor();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org.mockito.asm.Type" + "'", str5, "org.mockito.asm.Type");
        org.junit.Assert.assertNotNull(objArray11);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray11), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray11), "[-1, -1, 4, 10, 0.0]");
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(classArray16);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str23, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertNotNull(methodArray27);
        org.junit.Assert.assertNotNull(methodArray28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(wildcardClass36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(obj44);
        org.junit.Assert.assertNotNull(strEnumeration45);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "org/mockito/asm/TypeD" + "'", str50, "org/mockito/asm/TypeD");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "D" + "'", str51, "D");
        org.junit.Assert.assertNull(wildcardClass53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str56, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test16007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16007");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.reflect.Method method9 = propertyDescriptor3.getReadMethod();
        java.lang.Object obj11 = propertyDescriptor3.getValue("org/mockito/asm/Type");
        java.lang.reflect.Method method12 = propertyDescriptor3.getReadMethod();
        boolean boolean13 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method15 = null;
        java.lang.reflect.Method method16 = null;
        java.beans.PropertyDescriptor propertyDescriptor17 = new java.beans.PropertyDescriptor("(Z)C", method15, method16);
        org.mockito.cglib.core.Signature signature21 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor17.setValue("org/mockito/asm/Type", (java.lang.Object) signature21);
        java.lang.String str23 = propertyDescriptor17.getDisplayName();
        propertyDescriptor17.setHidden(false);
        propertyDescriptor17.setHidden(false);
        propertyDescriptor17.setName("org/mockito/asm/Type");
        propertyDescriptor17.setDisplayName("long");
        boolean boolean32 = propertyDescriptor17.isPreferred();
        propertyDescriptor17.setName("org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.mockito.asm.Type type35 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass36 = type35.getClass();
        java.beans.PropertyEditor propertyEditor37 = propertyDescriptor17.createPropertyEditor((java.lang.Object) wildcardClass36);
        java.beans.PropertyDescriptor[] propertyDescriptorArray38 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass36);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray38, false, false);
        java.lang.Class[] classArray42 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray41);
        java.beans.PropertyEditor propertyEditor43 = propertyDescriptor3.createPropertyEditor((java.lang.Object) methodArray41);
        org.junit.Assert.assertNull(method9);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "char");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "char");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "char");
        org.junit.Assert.assertNull(method12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "(Z)C" + "'", str23, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNull(propertyEditor37);
        org.junit.Assert.assertNotNull(propertyDescriptorArray38);
        org.junit.Assert.assertNotNull(methodArray41);
        org.junit.Assert.assertNotNull(classArray42);
        org.junit.Assert.assertNull(propertyEditor43);
    }

    @Test
    public void test16008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16008");
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
        org.mockito.asm.Type type21 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass22 = type21.getClass();
        java.beans.PropertyEditor propertyEditor23 = propertyDescriptor3.createPropertyEditor((java.lang.Object) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass22);
        java.lang.String str25 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass22);
        org.mockito.cglib.core.ClassInfo classInfo28 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass22);
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass22);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method30 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNull(propertyEditor23);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "org/mockito/asm/Type" + "'", str25, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertNotNull(propertyDescriptorArray27);
        org.junit.Assert.assertNotNull(classInfo28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str29, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test16009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16009");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean2 = type0.equals((java.lang.Object) (byte) 0);
        java.lang.Class<?> wildcardClass3 = type0.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.Class[] classArray7 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray6);
        java.lang.String[] strArray8 = org.mockito.cglib.core.ReflectUtils.getNames(classArray7);
        java.lang.Class[] classArray9 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray7);
        java.lang.Class class10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer11 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray7, class10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(classArray7);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(classArray9);
    }

    @Test
    public void test16010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16010");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = classInfo5.getSuperType();
        org.mockito.asm.Type type7 = classInfo5.getSuperType();
        org.mockito.asm.Type[] typeArray8 = classInfo5.getInterfaces();
        org.mockito.asm.Type type9 = classInfo5.getType();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test16011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16011");
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
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor14.setValue("org/mockito/asm/Type", (java.lang.Object) signature18);
        java.lang.String str20 = propertyDescriptor14.getDisplayName();
        boolean boolean21 = propertyDescriptor14.isHidden();
        propertyDescriptor14.setDisplayName("org.mockito.asm.Type");
        propertyDescriptor14.setConstrained(true);
        boolean boolean26 = classInfo4.equals((java.lang.Object) propertyDescriptor14);
        int int27 = classInfo4.getModifiers();
        org.mockito.asm.Type type28 = classInfo4.getType();
        java.lang.reflect.Method method30 = null;
        java.lang.reflect.Method method31 = null;
        java.beans.PropertyDescriptor propertyDescriptor32 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=Z; bound]", method30, method31);
        java.lang.Class<?> wildcardClass33 = propertyDescriptor32.getPropertyType();
        boolean boolean34 = classInfo4.equals((java.lang.Object) wildcardClass33);
        org.mockito.asm.Type[] typeArray35 = classInfo4.getInterfaces();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.mockito.asm.Type" + "'", str10, "org.mockito.asm.Type");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(Z)C" + "'", str20, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNull(wildcardClass33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(typeArray35);
    }

    @Test
    public void test16012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16012");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()D=1}]", method1, method2);
        boolean boolean4 = propertyDescriptor3.isPreferred();
        java.lang.Object obj6 = propertyDescriptor3.getValue("hi!()Ljava/lang/Object;");
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.String str8 = propertyDescriptor3.toString();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()D=1}]]" + "'", str8, "java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()D=1}]]");
    }

    @Test
    public void test16013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16013");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = signature7.getName();
        java.lang.String str10 = signature7.getDescriptor();
        java.lang.Class<?> wildcardClass11 = signature7.getClass();
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        int int13 = classInfo12.getModifiers();
        org.mockito.asm.Type type14 = classInfo12.getSuperType();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "char" + "'", str9, "char");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(classInfo12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(type14);
    }

    @Test
    public void test16014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16014");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        boolean boolean3 = type0.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass4);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "D" + "'", str1, "D");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(classInfo7);
    }

    @Test
    public void test16015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16015");
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
        java.lang.Class[] classArray12 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray11);
        int int13 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        int int14 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray12);
        java.lang.String[] strArray15 = org.mockito.cglib.core.ReflectUtils.getNames(classArray12);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo21 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type22 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.lang.String str23 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        java.lang.String str24 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass17);
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo27 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        java.lang.String str28 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass17);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer29 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray12, (java.lang.Class) wildcardClass17);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(propertyDescriptorArray11);
        org.junit.Assert.assertNotNull(classArray12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org/mockito/asm/Type" + "'", str19, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertNotNull(classInfo21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str23, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str24, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertNotNull(classInfo27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str28, "Lorg/mockito/asm/Type;");
    }

    @Test
    public void test16016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16016");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=; values={org/mockito/asm/TypeLorg/mockito/asm/Type;=10.0}; bound]");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test16017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16017");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        propertyDescriptor3.setHidden(false);
        propertyDescriptor3.setHidden(false);
        java.lang.Object obj15 = propertyDescriptor3.getValue("()D");
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=(Z)C; values={()D=Lorg/mockito/asm/Type;}]");
        propertyDescriptor3.setName("C");
        boolean boolean20 = propertyDescriptor3.isExpert();
        boolean boolean21 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method22 = propertyDescriptor3.getWriteMethod();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass24 = type23.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray25 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass24);
        java.lang.String str26 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass24);
        org.mockito.cglib.core.ClassInfo classInfo27 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass24);
        org.mockito.asm.Type type28 = classInfo27.getSuperType();
        org.mockito.asm.Type type29 = classInfo27.getSuperType();
        org.mockito.asm.Type type30 = classInfo27.getSuperType();
        org.mockito.asm.Type[] typeArray31 = classInfo27.getInterfaces();
        java.lang.reflect.Method method33 = null;
        java.lang.reflect.Method method34 = null;
        java.beans.PropertyDescriptor propertyDescriptor35 = new java.beans.PropertyDescriptor("(Z)C", method33, method34);
        java.util.Enumeration<java.lang.String> strEnumeration36 = propertyDescriptor35.attributeNames();
        boolean boolean37 = propertyDescriptor35.isPreferred();
        java.lang.String str38 = propertyDescriptor35.getName();
        boolean boolean39 = propertyDescriptor35.isExpert();
        propertyDescriptor35.setBound(true);
        java.lang.Class<?> wildcardClass42 = propertyDescriptor35.getPropertyEditorClass();
        propertyDescriptor35.setConstrained(true);
        propertyDescriptor35.setPreferred(false);
        java.util.Enumeration<java.lang.String> strEnumeration47 = propertyDescriptor35.attributeNames();
        boolean boolean48 = classInfo27.equals((java.lang.Object) strEnumeration47);
        java.beans.PropertyEditor propertyEditor49 = propertyDescriptor3.createPropertyEditor((java.lang.Object) boolean48);
        java.lang.Class<?> wildcardClass50 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setHidden(true);
        propertyDescriptor3.setPreferred(false);
        boolean boolean55 = propertyDescriptor3.isHidden();
        java.lang.String str56 = propertyDescriptor3.getShortDescription();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(method22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(wildcardClass24);
        org.junit.Assert.assertNotNull(propertyDescriptorArray25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "org/mockito/asm/Type" + "'", str26, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNotNull(typeArray31);
        org.junit.Assert.assertNotNull(strEnumeration36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "(Z)C" + "'", str38, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(wildcardClass42);
        org.junit.Assert.assertNotNull(strEnumeration47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(propertyEditor49);
        org.junit.Assert.assertNull(wildcardClass50);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "C" + "'", str56, "C");
    }

    @Test
    public void test16018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16018");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        boolean boolean10 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setShortDescription("Z");
        java.util.Enumeration<java.lang.String> strEnumeration13 = propertyDescriptor3.attributeNames();
        java.lang.String str14 = propertyDescriptor3.getDisplayName();
        java.lang.String str15 = propertyDescriptor3.getName();
        propertyDescriptor3.setHidden(false);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getClass();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass18);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strEnumeration13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(Z)C" + "'", str14, "(Z)C");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(Z)C" + "'", str15, "(Z)C");
        org.junit.Assert.assertNotNull(wildcardClass18);
        org.junit.Assert.assertNotNull(type19);
    }

    @Test
    public void test16019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16019");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str1 = type0.getDescriptor();
        boolean boolean3 = type0.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass4 = type0.getClass();
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass4);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass4);
        java.lang.reflect.Method[] methodArray12 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray9, true, false);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "D" + "'", str1, "D");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertNotNull(methodArray12);
    }

    @Test
    public void test16020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16020");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("java.beans.PropertyDescriptor[name=(Z)C; displayName=java.beans.PropertyDescriptor[name=[Lorg/mockito/asm/Type;; shortDescription=Lchar;; bound]]");
        org.junit.Assert.assertNotNull(type1);
    }

    @Test
    public void test16021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16021");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        boolean boolean10 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setShortDescription("Z");
        java.lang.Object obj14 = propertyDescriptor3.getValue("org.mockito.asm.Type");
        boolean boolean15 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass18 = propertyDescriptor3.getPropertyType();
        java.lang.Class<?> wildcardClass19 = propertyDescriptor3.getPropertyType();
        propertyDescriptor3.setPreferred(false);
        java.lang.Class<?> wildcardClass22 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setPreferred(false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(wildcardClass18);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertNull(wildcardClass22);
    }

    @Test
    public void test16022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16022");
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.asm.Type type1 = org.mockito.asm.Type.getType("ckito/asm/Type");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16023");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo8 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo11 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(classInfo8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(classInfo11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
    }

    @Test
    public void test16024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16024");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("char");
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test16025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16025");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]; displayName=java.beans.PropertyDescriptor[name=(Z)C; constrained]; values={B=100.0}]", method1, method2);
    }

    @Test
    public void test16026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16026");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isHidden();
        java.lang.reflect.Method method8 = null;
        propertyDescriptor3.setWriteMethod(method8);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        boolean boolean11 = propertyDescriptor3.isPreferred();
        java.lang.Class<?> wildcardClass12 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setShortDescription("Lva/lang/Object;");
        java.util.Enumeration<java.lang.String> strEnumeration15 = propertyDescriptor3.attributeNames();
        java.lang.Object obj16 = null;
        java.beans.PropertyEditor propertyEditor17 = propertyDescriptor3.createPropertyEditor(obj16);
        boolean boolean18 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setName("[Ljava/beans/PropertyDescriptor;");
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(wildcardClass12);
        org.junit.Assert.assertNotNull(strEnumeration15);
        org.junit.Assert.assertNull(propertyEditor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test16027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16027");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass2);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type[] typeArray7 = classInfo6.getInterfaces();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass9);
        boolean boolean11 = classInfo6.equals((java.lang.Object) wildcardClass9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        int int14 = type12.getOpcode(2);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str17 = type16.getClassName();
        int int18 = type16.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType("D");
        int int21 = type20.getSort();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        int int26 = type22.getOpcode(100);
        int int27 = type22.getSize();
        int int29 = type22.getOpcode(4);
        int int31 = type22.getOpcode((int) ' ');
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] {};
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray34);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray34);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray34);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray34);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray44 = signature43.getArgumentTypes();
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("mockito/asm/Type", type40, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type16, typeArray44);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("[Ljava/beans/PropertyDescriptor;", type12, typeArray44);
        java.lang.reflect.Method method49 = null;
        java.lang.reflect.Method method50 = null;
        java.beans.PropertyDescriptor propertyDescriptor51 = new java.beans.PropertyDescriptor("(Z)C", method49, method50);
        java.util.Enumeration<java.lang.String> strEnumeration52 = propertyDescriptor51.attributeNames();
        java.lang.Object obj54 = propertyDescriptor51.getValue("(Z)Lchar;");
        java.lang.String str55 = propertyDescriptor51.getName();
        java.lang.String str56 = propertyDescriptor51.getShortDescription();
        java.lang.String str57 = propertyDescriptor51.getDisplayName();
        boolean boolean58 = signature47.equals((java.lang.Object) propertyDescriptor51);
        propertyDescriptor51.setDisplayName("Z)Lorg.mockito.asm.Type");
        java.lang.Class<?> wildcardClass61 = propertyDescriptor51.getPropertyEditorClass();
        propertyDescriptor51.setHidden(true);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "char" + "'", str17, "char");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "D" + "'", str33, "D");
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "()D" + "'", str35, "()D");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "()Z" + "'", str36, "()Z");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "()D" + "'", str37, "()D");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "()C" + "'", str38, "()C");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(strEnumeration52);
        org.junit.Assert.assertNull(obj54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "(Z)C" + "'", str55, "(Z)C");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "(Z)C" + "'", str56, "(Z)C");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "(Z)C" + "'", str57, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(wildcardClass61);
    }

    @Test
    public void test16028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16028");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass10 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setConstrained(true);
        propertyDescriptor3.setPreferred(false);
        java.util.Enumeration<java.lang.String> strEnumeration15 = propertyDescriptor3.attributeNames();
        java.util.Enumeration<java.lang.String> strEnumeration16 = propertyDescriptor3.attributeNames();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass10);
        org.junit.Assert.assertNotNull(strEnumeration15);
        org.junit.Assert.assertNotNull(strEnumeration16);
    }

    @Test
    public void test16029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16029");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass2);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type[] typeArray7 = classInfo6.getInterfaces();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass9);
        boolean boolean11 = classInfo6.equals((java.lang.Object) wildcardClass9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        int int14 = type12.getOpcode(2);
        org.mockito.asm.Type type15 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass16 = type15.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass16);
        java.lang.String str18 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray19 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass16);
        java.lang.String str20 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass16);
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass16);
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass16);
        org.mockito.cglib.core.ClassInfo classInfo24 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass16);
        org.mockito.asm.Type[] typeArray25 = classInfo24.getInterfaces();
        org.mockito.cglib.core.Signature signature26 = new org.mockito.cglib.core.Signature("java.lang.Object", type12, typeArray25);
        java.lang.String str27 = signature26.getDescriptor();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(wildcardClass16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "org/mockito/asm/Type" + "'", str18, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str20, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org/mockito/asm/Type" + "'", str22, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(classInfo24);
        org.junit.Assert.assertNotNull(typeArray25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str27, "()Lorg/mockito/asm/Type;");
    }

    @Test
    public void test16030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16030");
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
        org.mockito.asm.Type[] typeArray16 = signature15.getArgumentTypes();
        java.lang.String str17 = signature15.toString();
        org.mockito.asm.Type type18 = signature15.getReturnType();
        java.lang.String str19 = signature15.toString();
        java.lang.String str20 = signature15.getDescriptor();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "D" + "'", str2, "D");
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "()D" + "'", str4, "()D");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "D" + "'", str5, "D");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org/mockito/asm/Type" + "'", str9, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(classInfo11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.mockito.asm.Type" + "'", str13, "org.mockito.asm.Type");
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "B()D" + "'", str17, "B()D");
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "B()D" + "'", str19, "B()D");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "()D" + "'", str20, "()D");
    }

    @Test
    public void test16031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16031");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass2);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type[] typeArray7 = classInfo6.getInterfaces();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass9);
        boolean boolean11 = classInfo6.equals((java.lang.Object) wildcardClass9);
        org.mockito.asm.Type type12 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass9);
        int int14 = type12.getOpcode(2);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.CHAR_TYPE;
        java.lang.String str17 = type16.getClassName();
        int int18 = type16.getSize();
        org.mockito.asm.Type type20 = org.mockito.asm.Type.getType("D");
        int int21 = type20.getSort();
        org.mockito.asm.Type type22 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean24 = type22.equals((java.lang.Object) (byte) 0);
        int int26 = type22.getOpcode(100);
        int int27 = type22.getSize();
        int int29 = type22.getOpcode(4);
        int int31 = type22.getOpcode((int) ' ');
        org.mockito.asm.Type type32 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str33 = type32.getDescriptor();
        org.mockito.asm.Type[] typeArray34 = new org.mockito.asm.Type[] {};
        java.lang.String str35 = org.mockito.asm.Type.getMethodDescriptor(type32, typeArray34);
        java.lang.String str36 = org.mockito.asm.Type.getMethodDescriptor(type22, typeArray34);
        java.lang.String str37 = org.mockito.asm.Type.getMethodDescriptor(type20, typeArray34);
        java.lang.String str38 = org.mockito.asm.Type.getMethodDescriptor(type16, typeArray34);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Signature signature43 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray44 = signature43.getArgumentTypes();
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("mockito/asm/Type", type40, typeArray44);
        org.mockito.cglib.core.Signature signature46 = new org.mockito.cglib.core.Signature("", type16, typeArray44);
        org.mockito.cglib.core.Signature signature47 = new org.mockito.cglib.core.Signature("[Ljava/beans/PropertyDescriptor;", type12, typeArray44);
        java.lang.Class[] classArray48 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) typeArray44);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass50 = type49.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray51 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass50);
        java.lang.String str52 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass50);
        java.beans.PropertyDescriptor[] propertyDescriptorArray53 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass50);
        org.mockito.cglib.core.ClassInfo classInfo54 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass50);
        org.mockito.asm.Type type55 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass50);
        java.lang.String str56 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass50);
        java.lang.String str57 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass50);
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass50);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass50);
        org.mockito.cglib.core.ClassInfo classInfo60 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass50);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer61 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray48, (java.lang.Class) wildcardClass50);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 6 + "'", int14 == 6);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "char" + "'", str17, "char");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 100 + "'", int26 == 100);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 4 + "'", int29 == 4);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 32 + "'", int31 == 32);
        org.junit.Assert.assertNotNull(type32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "D" + "'", str33, "D");
        org.junit.Assert.assertNotNull(typeArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "()D" + "'", str35, "()D");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "()Z" + "'", str36, "()Z");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "()D" + "'", str37, "()D");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "()C" + "'", str38, "()C");
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertNotNull(typeArray44);
        org.junit.Assert.assertNotNull(classArray48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertNotNull(propertyDescriptorArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "org/mockito/asm/Type" + "'", str52, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray53);
        org.junit.Assert.assertNotNull(classInfo54);
        org.junit.Assert.assertNotNull(type55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str56, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str57, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(propertyDescriptorArray59);
        org.junit.Assert.assertNotNull(classInfo60);
    }

    @Test
    public void test16032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16032");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        boolean boolean7 = propertyDescriptor3.isExpert();
        java.lang.Class<?> wildcardClass8 = propertyDescriptor3.getPropertyEditorClass();
        propertyDescriptor3.setShortDescription("LI;");
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(wildcardClass8);
    }

    @Test
    public void test16033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16033");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("org.mockito.cglib.core.Signature", method1, method2);
        boolean boolean4 = propertyDescriptor3.isPreferred();
        propertyDescriptor3.setDisplayName("char");
        java.lang.Class<?> wildcardClass7 = propertyDescriptor3.getPropertyEditorClass();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass9);
        org.mockito.asm.Type type13 = classInfo12.getSuperType();
        org.mockito.asm.Type type14 = classInfo12.getSuperType();
        java.lang.String str15 = type14.getClassName();
        java.lang.Object obj16 = null;
        boolean boolean17 = type14.equals(obj16);
        java.lang.String str18 = type14.toString();
        int int19 = type14.getSort();
        java.beans.PropertyEditor propertyEditor20 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type14);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(wildcardClass7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/Type" + "'", str11, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.lang.Object" + "'", str15, "java.lang.Object");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Ljava/lang/Object;" + "'", str18, "Ljava/lang/Object;");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNull(propertyEditor20);
    }

    @Test
    public void test16034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16034");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setHidden(true);
        boolean boolean7 = propertyDescriptor3.isExpert();
        java.lang.reflect.Method method8 = propertyDescriptor3.getWriteMethod();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(method8);
    }

    @Test
    public void test16035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16035");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass1);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray7 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray9 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str2, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(propertyDescriptorArray7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(propertyDescriptorArray9);
    }

    @Test
    public void test16036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16036");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        propertyDescriptor3.setBound(true);
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        java.beans.PropertyEditor propertyEditor8 = propertyDescriptor3.createPropertyEditor((java.lang.Object) 104);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        java.lang.reflect.Method method10 = null;
        propertyDescriptor3.setReadMethod(method10);
        propertyDescriptor3.setShortDescription("()L)Lchar;");
        java.lang.reflect.Method method14 = propertyDescriptor3.getReadMethod();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(propertyEditor8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertNull(method14);
    }

    @Test
    public void test16037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16037");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        int int5 = type3.getOpcode(96);
        java.lang.String str6 = type3.getDescriptor();
        java.lang.Object obj7 = null;
        boolean boolean8 = type3.equals(obj7);
        java.lang.String str9 = type3.toString();
        int int10 = type3.getSort();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 100 + "'", int5 == 100);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str6, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str9, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test16038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16038");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.String str1 = type0.getClassName();
        int int2 = type0.getSort();
        org.mockito.asm.Type type3 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str4 = type3.getDescriptor();
        org.mockito.asm.Type[] typeArray5 = new org.mockito.asm.Type[] {};
        java.lang.String str6 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray5);
        java.lang.String str7 = type3.toString();
        int int8 = type3.getSize();
        java.lang.String str9 = type3.getClassName();
        java.lang.String str10 = type3.getClassName();
        java.lang.String str11 = type3.getDescriptor();
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
        org.mockito.asm.Type type27 = org.mockito.asm.Type.getType("D");
        int int28 = type27.getSort();
        org.mockito.asm.Type type29 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean31 = type29.equals((java.lang.Object) (byte) 0);
        int int33 = type29.getOpcode(100);
        int int34 = type29.getSize();
        int int36 = type29.getOpcode(4);
        int int38 = type29.getOpcode((int) ' ');
        org.mockito.asm.Type type39 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str40 = type39.getDescriptor();
        org.mockito.asm.Type[] typeArray41 = new org.mockito.asm.Type[] {};
        java.lang.String str42 = org.mockito.asm.Type.getMethodDescriptor(type39, typeArray41);
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray41);
        java.lang.String str44 = org.mockito.asm.Type.getMethodDescriptor(type27, typeArray41);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("org/mockito/asm/TypeLorg/mockito/asm/Type;", type14, typeArray41);
        java.lang.String str46 = org.mockito.asm.Type.getMethodDescriptor(type3, typeArray41);
        java.lang.String str47 = org.mockito.asm.Type.getMethodDescriptor(type0, typeArray41);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "short" + "'", str1, "short");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "D" + "'", str4, "D");
        org.junit.Assert.assertNotNull(typeArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "()D" + "'", str6, "()D");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "D" + "'", str7, "D");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "double" + "'", str9, "double");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "double" + "'", str10, "double");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "D" + "'", str11, "D");
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org/mockito/asm/Type" + "'", str21, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(classInfo23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 8 + "'", int28 == 8);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 100 + "'", int33 == 100);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 4 + "'", int36 == 4);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 32 + "'", int38 == 32);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "D" + "'", str40, "D");
        org.junit.Assert.assertNotNull(typeArray41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "()D" + "'", str42, "()D");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "()Z" + "'", str43, "()Z");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "()D" + "'", str44, "()D");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "()D" + "'", str46, "()D");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "()S" + "'", str47, "()S");
    }

    @Test
    public void test16039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16039");
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
        propertyDescriptor26.setExpert(false);
        propertyDescriptor26.setExpert(true);
        boolean boolean51 = propertyDescriptor26.isPreferred();
        propertyDescriptor26.setHidden(true);
        org.mockito.asm.Type type54 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass55 = type54.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray56 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass55);
        java.lang.String str57 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass55);
        org.mockito.cglib.core.ClassInfo classInfo58 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass55);
        org.mockito.asm.Type type59 = classInfo58.getSuperType();
        org.mockito.asm.Type type60 = classInfo58.getSuperType();
        org.mockito.asm.Type[] typeArray61 = classInfo58.getInterfaces();
        org.mockito.asm.Type[] typeArray62 = classInfo58.getInterfaces();
        java.lang.Class<?> wildcardClass63 = typeArray62.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray64 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass63);
        java.beans.PropertyDescriptor[] propertyDescriptorArray65 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass63);
        java.lang.Class[] classArray66 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray65);
        java.lang.Class[] classArray67 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray66);
        java.lang.String[] strArray68 = org.mockito.cglib.core.ReflectUtils.getNames(classArray67);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean71 = type69.equals((java.lang.Object) (byte) 0);
        int int73 = type69.getOpcode(100);
        int int74 = type69.getSize();
        int int76 = type69.getOpcode(4);
        int int78 = type69.getOpcode((int) ' ');
        org.mockito.asm.Type type79 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str80 = type79.getDescriptor();
        boolean boolean82 = type79.equals((java.lang.Object) (-1));
        java.lang.Class<?> wildcardClass83 = type79.getClass();
        java.lang.String str84 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass83);
        java.beans.PropertyDescriptor[] propertyDescriptorArray85 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass83);
        boolean boolean86 = type69.equals((java.lang.Object) wildcardClass83);
        java.beans.PropertyDescriptor[] propertyDescriptorArray87 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass83);
        java.lang.reflect.Method[] methodArray90 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray87, true, false);
        java.lang.reflect.Method[] methodArray91 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray68, methodArray90);
        java.beans.PropertyEditor propertyEditor92 = propertyDescriptor26.createPropertyEditor((java.lang.Object) methodArray91);
        propertyDescriptor26.setBound(true);
        java.lang.String str95 = propertyDescriptor26.toString();
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/Type" + "'", str15, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo16);
        org.junit.Assert.assertNotNull(typeArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNull(wildcardClass29);
        org.junit.Assert.assertNull(obj31);
        org.junit.Assert.assertNotNull(type35);
        org.junit.Assert.assertNotNull(wildcardClass36);
        org.junit.Assert.assertNotNull(propertyDescriptorArray37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "org/mockito/asm/Type" + "'", str38, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(propertyDescriptorArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "org/mockito/asm/Type" + "'", str57, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo58);
        org.junit.Assert.assertNotNull(type59);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(typeArray61);
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(wildcardClass63);
        org.junit.Assert.assertNotNull(propertyDescriptorArray64);
        org.junit.Assert.assertNotNull(propertyDescriptorArray65);
        org.junit.Assert.assertNotNull(classArray66);
        org.junit.Assert.assertNotNull(classArray67);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 100 + "'", int73 == 100);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 1 + "'", int74 == 1);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 4 + "'", int76 == 4);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 32 + "'", int78 == 32);
        org.junit.Assert.assertNotNull(type79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "D" + "'", str80, "D");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(wildcardClass83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "org/mockito/asm/Type" + "'", str84, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray87);
        org.junit.Assert.assertNotNull(methodArray90);
        org.junit.Assert.assertNotNull(methodArray91);
        org.junit.Assert.assertNull(propertyEditor92);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "java.beans.PropertyDescriptor[name=(Z)C; hidden; expert; values={()Lg/mockito/asm/Type;=org.mockito.asm.Type}; bound]" + "'", str95, "java.beans.PropertyDescriptor[name=(Z)C; hidden; expert; values={()Lg/mockito/asm/Type;=org.mockito.asm.Type}; bound]");
    }

    @Test
    public void test16040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16040");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("char");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass3 = type2.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass3);
        java.lang.String str5 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass3);
        org.mockito.cglib.core.ClassInfo classInfo7 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type8 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
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
        boolean boolean22 = type8.equals((java.lang.Object) typeArray20);
        java.lang.String str23 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray20);
        org.mockito.asm.Type type24 = org.mockito.asm.Type.CHAR_TYPE;
        org.mockito.asm.Type type25 = org.mockito.asm.Type.BOOLEAN_TYPE;
        boolean boolean27 = type25.equals((java.lang.Object) (byte) 0);
        org.mockito.asm.Type[] typeArray28 = new org.mockito.asm.Type[] { type25 };
        java.lang.String str29 = org.mockito.asm.Type.getMethodDescriptor(type24, typeArray28);
        java.lang.String str30 = org.mockito.asm.Type.getMethodDescriptor(type1, typeArray28);
        java.lang.Class<?> wildcardClass31 = typeArray28.getClass();
        org.mockito.cglib.core.ClassInfo classInfo32 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass31);
        org.mockito.asm.Type type33 = classInfo32.getType();
        boolean boolean35 = classInfo32.equals((java.lang.Object) "java.beans.PropertyDescriptor[name=(Z)C; hidden; bound]");
        int int36 = classInfo32.getModifiers();
        java.lang.String str37 = classInfo32.toString();
        org.mockito.asm.Type type38 = classInfo32.getType();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/Type" + "'", str5, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(classInfo7);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org/mockito/asm/Type" + "'", str17, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertNotNull(classInfo19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "()Lchar;" + "'", str23, "()Lchar;");
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(typeArray28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "(Z)C" + "'", str29, "(Z)C");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "(Z)Lchar;" + "'", str30, "(Z)Lchar;");
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertNotNull(classInfo32);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1041 + "'", int36 == 1041);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "org.mockito.asm.Type[]" + "'", str37, "org.mockito.asm.Type[]");
        org.junit.Assert.assertNotNull(type38);
    }

    @Test
    public void test16041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16041");
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
        java.lang.Class<?> wildcardClass13 = propertyDescriptor3.getPropertyEditorClass();
        java.lang.Object obj15 = propertyDescriptor3.getValue("Lorg/mockito/asm/Type;");
        propertyDescriptor3.setHidden(true);
        org.mockito.asm.Type type18 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass19 = type18.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray20 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass19);
        java.lang.String str21 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass19);
        java.beans.PropertyDescriptor[] propertyDescriptorArray22 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass19);
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass19);
        org.mockito.asm.Type[] typeArray24 = classInfo23.getInterfaces();
        org.mockito.asm.Type type25 = classInfo23.getType();
        java.lang.reflect.Method method27 = null;
        java.lang.reflect.Method method28 = null;
        java.beans.PropertyDescriptor propertyDescriptor29 = new java.beans.PropertyDescriptor("(Z)C", method27, method28);
        propertyDescriptor29.setBound(true);
        java.lang.Class<?> wildcardClass32 = propertyDescriptor29.getPropertyType();
        java.lang.Object obj34 = propertyDescriptor29.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method35 = null;
        propertyDescriptor29.setWriteMethod(method35);
        org.mockito.asm.Type type38 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass39 = type38.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray40 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass39);
        java.lang.String str41 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass39);
        org.mockito.cglib.core.ClassInfo classInfo42 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass39);
        org.mockito.asm.Type[] typeArray43 = classInfo42.getInterfaces();
        boolean boolean45 = classInfo42.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray46 = classInfo42.getInterfaces();
        org.mockito.asm.Type type47 = classInfo42.getSuperType();
        propertyDescriptor29.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo42);
        java.lang.reflect.Method method50 = null;
        java.lang.reflect.Method method51 = null;
        java.beans.PropertyDescriptor propertyDescriptor52 = new java.beans.PropertyDescriptor("(Z)C", method50, method51);
        propertyDescriptor52.setBound(true);
        java.lang.Class<?> wildcardClass55 = propertyDescriptor52.getPropertyType();
        java.lang.Object obj57 = propertyDescriptor52.getValue("org.mockito.asm.Type");
        java.lang.reflect.Method method58 = null;
        propertyDescriptor52.setWriteMethod(method58);
        org.mockito.asm.Type type61 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass62 = type61.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray63 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass62);
        java.lang.String str64 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass62);
        org.mockito.cglib.core.ClassInfo classInfo65 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass62);
        org.mockito.asm.Type[] typeArray66 = classInfo65.getInterfaces();
        boolean boolean68 = classInfo65.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray69 = classInfo65.getInterfaces();
        org.mockito.asm.Type type70 = classInfo65.getSuperType();
        propertyDescriptor52.setValue("()Lg/mockito/asm/Type;", (java.lang.Object) classInfo65);
        boolean boolean72 = classInfo42.equals((java.lang.Object) propertyDescriptor52);
        boolean boolean73 = classInfo23.equals((java.lang.Object) propertyDescriptor52);
        org.mockito.asm.Type type74 = classInfo23.getType();
        org.mockito.asm.Type type75 = classInfo23.getSuperType();
        java.lang.String str76 = classInfo23.toString();
        int int77 = classInfo23.getModifiers();
        int int78 = classInfo23.getModifiers();
        java.beans.PropertyEditor propertyEditor79 = propertyDescriptor3.createPropertyEditor((java.lang.Object) classInfo23);
        java.lang.String str80 = propertyDescriptor3.getName();
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org/mockito/asm/Type" + "'", str7, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(classInfo9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNull(propertyEditor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "(Z)C" + "'", str12, "(Z)C");
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(wildcardClass19);
        org.junit.Assert.assertNotNull(propertyDescriptorArray20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "org/mockito/asm/Type" + "'", str21, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray22);
        org.junit.Assert.assertNotNull(classInfo23);
        org.junit.Assert.assertNotNull(typeArray24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNull(wildcardClass32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(type38);
        org.junit.Assert.assertNotNull(wildcardClass39);
        org.junit.Assert.assertNotNull(propertyDescriptorArray40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "org/mockito/asm/Type" + "'", str41, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo42);
        org.junit.Assert.assertNotNull(typeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(typeArray46);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNull(wildcardClass55);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(type61);
        org.junit.Assert.assertNotNull(wildcardClass62);
        org.junit.Assert.assertNotNull(propertyDescriptorArray63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "org/mockito/asm/Type" + "'", str64, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo65);
        org.junit.Assert.assertNotNull(typeArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(typeArray69);
        org.junit.Assert.assertNotNull(type70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(type74);
        org.junit.Assert.assertNotNull(type75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "org.mockito.asm.Type" + "'", str76, "org.mockito.asm.Type");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 1 + "'", int77 == 1);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 1 + "'", int78 == 1);
        org.junit.Assert.assertNull(propertyEditor79);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "(Z)C" + "'", str80, "(Z)C");
    }

    @Test
    public void test16042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16042");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("java.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char}]", method1, method2);
        java.lang.reflect.Method method4 = propertyDescriptor3.getWriteMethod();
        java.util.Enumeration<java.lang.String> strEnumeration5 = propertyDescriptor3.attributeNames();
        propertyDescriptor3.setDisplayName("()Lg/mockito/asm/Type;");
        java.lang.String str8 = propertyDescriptor3.getShortDescription();
        org.junit.Assert.assertNull(method4);
        org.junit.Assert.assertNotNull(strEnumeration5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "()Lg/mockito/asm/Type;" + "'", str8, "()Lg/mockito/asm/Type;");
    }

    @Test
    public void test16043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16043");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        org.mockito.asm.Type type6 = classInfo4.getSuperType();
        org.mockito.asm.Type type7 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray8 = classInfo4.getInterfaces();
        java.lang.String str9 = classInfo4.toString();
        int int10 = classInfo4.getModifiers();
        org.mockito.asm.Type[] typeArray11 = classInfo4.getInterfaces();
        java.lang.String str12 = classInfo4.toString();
        java.lang.String str13 = classInfo4.toString();
        java.lang.String str14 = classInfo4.toString();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.mockito.asm.Type" + "'", str9, "org.mockito.asm.Type");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(typeArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "org.mockito.asm.Type" + "'", str12, "org.mockito.asm.Type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.mockito.asm.Type" + "'", str13, "org.mockito.asm.Type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org.mockito.asm.Type" + "'", str14, "org.mockito.asm.Type");
    }

    @Test
    public void test16044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16044");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        org.mockito.cglib.core.Signature signature7 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor3.setValue("org/mockito/asm/Type", (java.lang.Object) signature7);
        java.lang.String str9 = propertyDescriptor3.getDisplayName();
        boolean boolean10 = propertyDescriptor3.isHidden();
        propertyDescriptor3.setShortDescription("Z");
        java.util.Enumeration<java.lang.String> strEnumeration13 = propertyDescriptor3.attributeNames();
        java.lang.String str14 = propertyDescriptor3.getDisplayName();
        java.lang.String str15 = propertyDescriptor3.getName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass17 = type16.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray18 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass17);
        java.lang.String str19 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass17);
        org.mockito.cglib.core.ClassInfo classInfo20 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass17);
        org.mockito.asm.Type type21 = classInfo20.getSuperType();
        org.mockito.asm.Type type22 = classInfo20.getSuperType();
        java.lang.Class<?> wildcardClass23 = type22.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass23);
        org.mockito.asm.Type type25 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass23);
        java.beans.PropertyDescriptor[] propertyDescriptorArray26 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass23);
        java.lang.String str27 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass23);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass23);
        java.beans.PropertyDescriptor[] propertyDescriptorArray29 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass23);
        java.beans.PropertyEditor propertyEditor30 = propertyDescriptor3.createPropertyEditor((java.lang.Object) propertyDescriptorArray29);
        propertyDescriptor3.setName("java.beans.PropertyDescriptor[name=org.mockito.asm.Type; values={org/mockito/asm/TypeLorg/mockito/asm/Type;=10.0}; bound]");
        propertyDescriptor3.setName("org/mockito/asm/TypeD()Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "(Z)C" + "'", str9, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strEnumeration13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "(Z)C" + "'", str14, "(Z)C");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "(Z)C" + "'", str15, "(Z)C");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(propertyDescriptorArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "org/mockito/asm/Type" + "'", str19, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(wildcardClass23);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(propertyDescriptorArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "org/mockito/asm/Type" + "'", str27, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertNotNull(propertyDescriptorArray29);
        org.junit.Assert.assertNull(propertyEditor30);
    }

    @Test
    public void test16045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16045");
        java.lang.Class[] classArray0 = new java.lang.Class[] {};
        java.lang.String[] strArray1 = org.mockito.cglib.core.ReflectUtils.getNames(classArray0);
        org.mockito.asm.Type type2 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass3 = type2.getClass();
        java.lang.String str4 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        java.beans.PropertyDescriptor[] propertyDescriptorArray6 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass3);
        java.lang.reflect.Method[] methodArray9 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray6, true, true);
        java.lang.reflect.Method[] methodArray10 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray9);
        java.lang.Class[] classArray11 = new java.lang.Class[] {};
        java.lang.String[] strArray12 = org.mockito.cglib.core.ReflectUtils.getNames(classArray11);
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass14 = type13.getClass();
        java.lang.String str15 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type16 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass14);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass14);
        java.lang.reflect.Method[] methodArray20 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray17, true, true);
        java.lang.reflect.Method[] methodArray21 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray12, methodArray20);
        java.lang.reflect.Method[] methodArray22 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray20);
        java.lang.reflect.Method method24 = null;
        java.lang.reflect.Method method25 = null;
        java.beans.PropertyDescriptor propertyDescriptor26 = new java.beans.PropertyDescriptor("(Z)C", method24, method25);
        propertyDescriptor26.setBound(true);
        boolean boolean29 = propertyDescriptor26.isExpert();
        org.mockito.cglib.core.Signature signature33 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type34 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass35 = type34.getClass();
        boolean boolean36 = signature33.equals((java.lang.Object) wildcardClass35);
        java.beans.PropertyDescriptor[] propertyDescriptorArray37 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass35);
        propertyDescriptor26.setValue("java.beans.PropertyDescriptor[name=(Z)C; constrained]", (java.lang.Object) propertyDescriptorArray37);
        java.lang.reflect.Method[] methodArray41 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray37, false, false);
        java.lang.reflect.Method[] methodArray42 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray41);
        org.mockito.asm.Type type43 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass44 = type43.getClass();
        org.mockito.asm.Type type45 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass46 = type45.getClass();
        java.lang.String str47 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass46);
        org.mockito.asm.Type type48 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass46);
        org.mockito.asm.Type type49 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass50 = type49.getClass();
        java.lang.String str51 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass50);
        java.lang.Class[] classArray52 = new java.lang.Class[] { wildcardClass44, wildcardClass46, wildcardClass50 };
        int int53 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray52);
        int int54 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray52);
        java.lang.String[] strArray55 = org.mockito.cglib.core.ReflectUtils.getNames(classArray52);
        org.mockito.asm.Type type56 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass57 = type56.getClass();
        org.mockito.asm.Type type58 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass57);
        java.beans.PropertyDescriptor[] propertyDescriptorArray59 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass57);
        java.lang.reflect.Method[] methodArray62 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray59, true, false);
        java.lang.Class[] classArray63 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray62);
        java.lang.reflect.Method[] methodArray64 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray55, methodArray62);
        java.lang.reflect.Method[] methodArray65 = org.mockito.cglib.core.ReflectUtils.findMethods(strArray1, methodArray62);
        java.lang.Class[] classArray66 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) methodArray62);
        java.lang.String[] strArray67 = org.mockito.cglib.core.ReflectUtils.getNames(classArray66);
        java.lang.Class[] classArray68 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) classArray66);
        org.mockito.asm.Type type69 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass70 = type69.getClass();
        org.mockito.asm.Type type71 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass70);
        java.beans.PropertyDescriptor[] propertyDescriptorArray72 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass70);
        java.beans.PropertyDescriptor[] propertyDescriptorArray73 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass70);
        java.beans.PropertyDescriptor[] propertyDescriptorArray74 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass70);
        // The following exception was thrown during execution in test generation
        try {
            org.mockito.cglib.transform.impl.AddDelegateTransformer addDelegateTransformer75 = new org.mockito.cglib.transform.impl.AddDelegateTransformer(classArray68, (java.lang.Class) wildcardClass70);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>(java.lang.Object)");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(classArray0);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str4, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(propertyDescriptorArray6);
        org.junit.Assert.assertNotNull(methodArray9);
        org.junit.Assert.assertNotNull(methodArray10);
        org.junit.Assert.assertNotNull(classArray11);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str15, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(methodArray20);
        org.junit.Assert.assertNotNull(methodArray21);
        org.junit.Assert.assertNotNull(methodArray22);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(type34);
        org.junit.Assert.assertNotNull(wildcardClass35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray37);
        org.junit.Assert.assertNotNull(methodArray41);
        org.junit.Assert.assertNotNull(methodArray42);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNotNull(wildcardClass44);
        org.junit.Assert.assertNotNull(type45);
        org.junit.Assert.assertNotNull(wildcardClass46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str47, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type48);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertNotNull(wildcardClass50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str51, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(classArray52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(type56);
        org.junit.Assert.assertNotNull(wildcardClass57);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(propertyDescriptorArray59);
        org.junit.Assert.assertNotNull(methodArray62);
        org.junit.Assert.assertNotNull(classArray63);
        org.junit.Assert.assertNotNull(methodArray64);
        org.junit.Assert.assertNotNull(methodArray65);
        org.junit.Assert.assertNotNull(classArray66);
        org.junit.Assert.assertNotNull(strArray67);
        org.junit.Assert.assertNotNull(classArray68);
        org.junit.Assert.assertNotNull(type69);
        org.junit.Assert.assertNotNull(wildcardClass70);
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertNotNull(propertyDescriptorArray72);
        org.junit.Assert.assertNotNull(propertyDescriptorArray73);
        org.junit.Assert.assertNotNull(propertyDescriptorArray74);
    }

    @Test
    public void test16046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16046");
        org.mockito.asm.Type type2 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass3 = type2.getClass();
        org.mockito.asm.Type type4 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass3);
        org.mockito.asm.Type type5 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str6 = type5.getDescriptor();
        org.mockito.asm.Type[] typeArray7 = new org.mockito.asm.Type[] {};
        java.lang.String str8 = org.mockito.asm.Type.getMethodDescriptor(type5, typeArray7);
        org.mockito.cglib.core.Signature signature9 = new org.mockito.cglib.core.Signature("double", type4, typeArray7);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass11 = type10.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass11);
        java.lang.String str13 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass11);
        java.beans.PropertyDescriptor[] propertyDescriptorArray14 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass11);
        org.mockito.cglib.core.ClassInfo classInfo15 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass11);
        org.mockito.asm.Type[] typeArray16 = classInfo15.getInterfaces();
        org.mockito.asm.Type type17 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str18 = type17.getDescriptor();
        boolean boolean19 = classInfo15.equals((java.lang.Object) type17);
        boolean boolean20 = type4.equals((java.lang.Object) classInfo15);
        int int21 = type4.getSize();
        org.mockito.asm.Type type22 = type4.getElementType();
        org.mockito.cglib.core.Signature signature25 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type26 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass27 = type26.getClass();
        boolean boolean28 = signature25.equals((java.lang.Object) wildcardClass27);
        java.lang.String str29 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass27);
        java.beans.PropertyDescriptor[] propertyDescriptorArray30 = org.mockito.cglib.core.ReflectUtils.getBeanGetters((java.lang.Class) wildcardClass27);
        java.lang.reflect.Method[] methodArray33 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray30, true, true);
        boolean boolean34 = type22.equals((java.lang.Object) propertyDescriptorArray30);
        org.mockito.cglib.core.Signature signature37 = new org.mockito.cglib.core.Signature("Ljava/lang/Object;", "()D");
        org.mockito.asm.Type[] typeArray38 = signature37.getArgumentTypes();
        org.mockito.asm.Type type39 = signature37.getReturnType();
        org.mockito.asm.Type[] typeArray40 = signature37.getArgumentTypes();
        org.mockito.cglib.core.Signature signature41 = new org.mockito.cglib.core.Signature("", type22, typeArray40);
        org.mockito.asm.Type type42 = signature41.getReturnType();
        org.mockito.asm.Type[] typeArray43 = signature41.getArgumentTypes();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(wildcardClass3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "D" + "'", str6, "D");
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "()D" + "'", str8, "()D");
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(wildcardClass11);
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org/mockito/asm/Type" + "'", str13, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray14);
        org.junit.Assert.assertNotNull(classInfo15);
        org.junit.Assert.assertNotNull(typeArray16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "D" + "'", str18, "D");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(type22);
        org.junit.Assert.assertNotNull(type26);
        org.junit.Assert.assertNotNull(wildcardClass27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str29, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(propertyDescriptorArray30);
        org.junit.Assert.assertNotNull(methodArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(typeArray38);
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(typeArray40);
        org.junit.Assert.assertNotNull(type42);
        org.junit.Assert.assertNotNull(typeArray43);
    }

    @Test
    public void test16047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16047");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("java.beans.PropertyDescriptor[name=java/lang/Object; displayName=java.beans.PropertyDescriptor[name=(Z)C; bound]; preferred]");
        java.lang.String str2 = type1.getDescriptor();
        int int3 = type1.getSort();
        java.lang.String str4 = type1.toString();
        int int5 = type1.getSort();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Ljava.beans.PropertyDescriptor[name=java/lang/Object; displayName=java.beans.PropertyDescriptor[name=(Z)C; bound]; preferred];" + "'", str2, "Ljava.beans.PropertyDescriptor[name=java/lang/Object; displayName=java.beans.PropertyDescriptor[name=(Z)C; bound]; preferred];");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Ljava.beans.PropertyDescriptor[name=java/lang/Object; displayName=java.beans.PropertyDescriptor[name=(Z)C; bound]; preferred];" + "'", str4, "Ljava.beans.PropertyDescriptor[name=java/lang/Object; displayName=java.beans.PropertyDescriptor[name=(Z)C; bound]; preferred];");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test16048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16048");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray4 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        java.lang.String str7 = classInfo5.toString();
        org.mockito.asm.Type[] typeArray8 = classInfo5.getInterfaces();
        int int9 = classInfo5.getModifiers();
        int int10 = classInfo5.getModifiers();
        java.lang.String str11 = classInfo5.toString();
        org.mockito.asm.Type type12 = classInfo5.getType();
        org.mockito.asm.Type type13 = classInfo5.getType();
        int int14 = classInfo5.getModifiers();
        org.mockito.asm.Type type15 = classInfo5.getType();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray4);
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "org.mockito.asm.Type" + "'", str7, "org.mockito.asm.Type");
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org.mockito.asm.Type" + "'", str11, "org.mockito.asm.Type");
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(type15);
    }

    @Test
    public void test16049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16049");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass2);
        org.mockito.cglib.core.ClassInfo classInfo6 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type7 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        java.lang.String str8 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str11 = type10.getDescriptor();
        org.mockito.asm.Type[] typeArray12 = new org.mockito.asm.Type[] {};
        java.lang.String str13 = org.mockito.asm.Type.getMethodDescriptor(type10, typeArray12);
        org.mockito.cglib.core.Signature signature14 = new org.mockito.cglib.core.Signature("long", type9, typeArray12);
        java.lang.String str15 = type9.getInternalName();
        org.mockito.asm.Type type16 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Signature signature19 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type20 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass21 = type20.getClass();
        boolean boolean22 = signature19.equals((java.lang.Object) wildcardClass21);
        java.lang.String str23 = signature19.getName();
        boolean boolean24 = type16.equals((java.lang.Object) str23);
        java.lang.String str25 = type16.getDescriptor();
        java.lang.Class<?> wildcardClass26 = type16.getClass();
        org.mockito.cglib.core.ClassInfo classInfo27 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass26);
        boolean boolean28 = type9.equals((java.lang.Object) classInfo27);
        org.mockito.asm.Type[] typeArray29 = classInfo27.getInterfaces();
        java.lang.String str30 = classInfo27.toString();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(classInfo6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str8, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "D" + "'", str11, "D");
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "()D" + "'", str13, "()D");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/Type" + "'", str15, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(wildcardClass21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "F" + "'", str25, "F");
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(classInfo27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(typeArray29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "org.mockito.asm.Type" + "'", str30, "org.mockito.asm.Type");
    }

    @Test
    public void test16050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16050");
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
        java.lang.reflect.Method method31 = null;
        java.lang.reflect.Method method32 = null;
        java.beans.PropertyDescriptor propertyDescriptor33 = new java.beans.PropertyDescriptor("(Z)C", method31, method32);
        propertyDescriptor33.setBound(true);
        java.lang.Class<?> wildcardClass36 = propertyDescriptor33.getPropertyType();
        java.lang.Object obj38 = propertyDescriptor33.getValue("org.mockito.asm.Type");
        propertyDescriptor33.setShortDescription("D");
        boolean boolean41 = propertyDescriptor33.isPreferred();
        propertyDescriptor33.setName("java.beans.PropertyDescriptor[name=(Z)C; shortDescription=Z; values={org/mockito/asm/Type=char}]");
        java.lang.String str44 = propertyDescriptor33.getShortDescription();
        boolean boolean45 = propertyDescriptor33.isHidden();
        propertyDescriptor33.setBound(false);
        propertyDescriptor33.setExpert(true);
        propertyDescriptor10.setValue("java.beans.PropertyDescriptor[name=(Z)C; displayName=java.beans.PropertyDescriptor[name=(Z)C; shortDescription=D; expert; bound]; bound; propertyEditorClass=class org.mockito.asm.Type]", (java.lang.Object) propertyDescriptor33);
        propertyDescriptor10.setConstrained(true);
        java.lang.Class<?> wildcardClass53 = propertyDescriptor10.getClass();
        java.lang.String str54 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass53);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "org/mockito/asm/TypeLorg/mockito/asm/Type;" + "'", str5, "org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertNotNull(propertyDescriptorArray13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/Type" + "'", str14, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertNotNull(classInfo16);
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertNull(propertyEditor18);
        org.junit.Assert.assertNull(wildcardClass19);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNull(wildcardClass36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "D" + "'", str44, "D");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(wildcardClass53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "java/beans/PropertyDescriptor" + "'", str54, "java/beans/PropertyDescriptor");
    }

    @Test
    public void test16051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16051");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        java.lang.String str3 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type5 = classInfo4.getSuperType();
        java.lang.String str6 = classInfo4.toString();
        int int7 = classInfo4.getModifiers();
        org.mockito.asm.Type type8 = classInfo4.getSuperType();
        java.lang.String str9 = classInfo4.toString();
        org.mockito.cglib.core.Signature signature12 = new org.mockito.cglib.core.Signature("org/mockito/asm/Type", "Lorg/mockito/asm/Type;");
        java.lang.String str13 = signature12.toString();
        java.lang.String str14 = signature12.getName();
        java.lang.String str15 = signature12.getName();
        java.lang.String str16 = signature12.getName();
        java.lang.String str17 = signature12.toString();
        java.lang.String str18 = signature12.getDescriptor();
        java.lang.String str19 = signature12.getDescriptor();
        org.mockito.asm.Type type20 = signature12.getReturnType();
        org.mockito.asm.Type type21 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass22 = type21.getClass();
        org.mockito.asm.Type type23 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass22);
        java.lang.reflect.Method[] methodArray27 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray24, true, false);
        boolean boolean28 = type20.equals((java.lang.Object) propertyDescriptorArray24);
        boolean boolean29 = classInfo4.equals((java.lang.Object) type20);
        org.mockito.asm.Type type30 = classInfo4.getType();
        int int32 = type30.getOpcode(3);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "org.mockito.asm.Type" + "'", str6, "org.mockito.asm.Type");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org.mockito.asm.Type" + "'", str9, "org.mockito.asm.Type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org/mockito/asm/TypeLorg/mockito/asm/Type;" + "'", str13, "org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "org/mockito/asm/Type" + "'", str14, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "org/mockito/asm/Type" + "'", str15, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org/mockito/asm/Type" + "'", str16, "org/mockito/asm/Type");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "org/mockito/asm/TypeLorg/mockito/asm/Type;" + "'", str17, "org/mockito/asm/TypeLorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str18, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str19, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type20);
        org.junit.Assert.assertNotNull(type21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(type23);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertNotNull(methodArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 7 + "'", int32 == 7);
    }

    @Test
    public void test16052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16052");
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
        org.mockito.asm.Type type12 = classInfo4.getType();
        org.mockito.asm.Type type13 = classInfo4.getType();
        org.mockito.asm.Type type14 = classInfo4.getSuperType();
        org.mockito.asm.Type[] typeArray15 = classInfo4.getInterfaces();
        org.mockito.asm.Type type16 = classInfo4.getSuperType();
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(typeArray15);
        org.junit.Assert.assertNotNull(type16);
    }

    @Test
    public void test16053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16053");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.getObjectType("Ljava/lang/Object;");
        org.mockito.asm.Type type2 = type1.getElementType();
        org.mockito.asm.Type type3 = type1.getElementType();
        java.lang.String str4 = type3.getDescriptor();
        java.lang.String str5 = type3.getClassName();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lava/lang/Object;" + "'", str4, "Lava/lang/Object;");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "ava.lang.Object" + "'", str5, "ava.lang.Object");
    }

    @Test
    public void test16054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16054");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.Class<?> wildcardClass6 = propertyDescriptor3.getPropertyType();
        org.mockito.asm.Type type8 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass9 = type8.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray10 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass9);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass9);
        java.beans.PropertyDescriptor[] propertyDescriptorArray12 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass9);
        java.lang.String str13 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        java.lang.String str14 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass9);
        propertyDescriptor3.setValue("()D", (java.lang.Object) str14);
        boolean boolean16 = propertyDescriptor3.isPreferred();
        java.lang.reflect.Method method17 = null;
        propertyDescriptor3.setReadMethod(method17);
        java.lang.String str19 = propertyDescriptor3.getDisplayName();
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(wildcardClass6);
        org.junit.Assert.assertNotNull(type8);
        org.junit.Assert.assertNotNull(wildcardClass9);
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/Type" + "'", str11, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str13, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str14, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "(Z)C" + "'", str19, "(Z)C");
    }

    @Test
    public void test16055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16055");
        org.mockito.asm.Type type1 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass2 = type1.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray3 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass2);
        java.lang.String str4 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass2);
        org.mockito.cglib.core.ClassInfo classInfo5 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass2);
        org.mockito.asm.Type[] typeArray6 = classInfo5.getInterfaces();
        boolean boolean8 = classInfo5.equals((java.lang.Object) 10L);
        org.mockito.asm.Type[] typeArray9 = classInfo5.getInterfaces();
        org.mockito.asm.Type type10 = classInfo5.getSuperType();
        org.mockito.asm.Type type11 = classInfo5.getType();
        int int12 = classInfo5.getModifiers();
        org.mockito.asm.Type type13 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass14 = type13.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray15 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass14);
        java.lang.String str16 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass14);
        org.mockito.cglib.core.ClassInfo classInfo17 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass14);
        org.mockito.asm.Type type18 = classInfo17.getSuperType();
        org.mockito.asm.Type type19 = classInfo17.getSuperType();
        org.mockito.asm.Type[] typeArray20 = classInfo17.getInterfaces();
        org.mockito.asm.Type[] typeArray21 = classInfo17.getInterfaces();
        java.lang.Class<?> wildcardClass22 = typeArray21.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray23 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass22);
        java.beans.PropertyDescriptor[] propertyDescriptorArray24 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass22);
        boolean boolean25 = classInfo5.equals((java.lang.Object) wildcardClass22);
        int int26 = classInfo5.getModifiers();
        org.mockito.asm.Type[] typeArray27 = classInfo5.getInterfaces();
        org.mockito.asm.Type type28 = classInfo5.getType();
        org.mockito.asm.Type type29 = classInfo5.getType();
        org.mockito.asm.Type type31 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass32 = type31.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray33 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass32);
        java.lang.String str34 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass32);
        java.beans.PropertyDescriptor[] propertyDescriptorArray35 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass32);
        org.mockito.cglib.core.ClassInfo classInfo36 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type37 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        java.lang.String str38 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type39 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass32);
        org.mockito.asm.Type type40 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str41 = type40.getDescriptor();
        org.mockito.asm.Type[] typeArray42 = new org.mockito.asm.Type[] {};
        java.lang.String str43 = org.mockito.asm.Type.getMethodDescriptor(type40, typeArray42);
        org.mockito.cglib.core.Signature signature44 = new org.mockito.cglib.core.Signature("long", type39, typeArray42);
        org.mockito.cglib.core.Signature signature45 = new org.mockito.cglib.core.Signature("", type29, typeArray42);
        org.mockito.asm.Type type46 = type29.getElementType();
        org.mockito.asm.Type type47 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.asm.Type type49 = org.mockito.asm.Type.DOUBLE_TYPE;
        java.lang.String str50 = type49.getDescriptor();
        org.mockito.asm.Type[] typeArray51 = new org.mockito.asm.Type[] {};
        java.lang.String str52 = org.mockito.asm.Type.getMethodDescriptor(type49, typeArray51);
        java.lang.String str53 = type49.toString();
        org.mockito.asm.Type type54 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass55 = type54.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray56 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass55);
        java.lang.String str57 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass55);
        java.beans.PropertyDescriptor[] propertyDescriptorArray58 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass55);
        org.mockito.cglib.core.ClassInfo classInfo59 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass55);
        org.mockito.asm.Type[] typeArray60 = classInfo59.getInterfaces();
        java.lang.String str61 = classInfo59.toString();
        org.mockito.asm.Type[] typeArray62 = classInfo59.getInterfaces();
        org.mockito.cglib.core.Signature signature63 = new org.mockito.cglib.core.Signature("B", type49, typeArray62);
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
        boolean boolean74 = signature63.equals((java.lang.Object) typeArray73);
        java.lang.String str75 = org.mockito.asm.Type.getMethodDescriptor(type47, typeArray73);
        java.lang.String str76 = org.mockito.asm.Type.getMethodDescriptor(type29, typeArray73);
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(wildcardClass2);
        org.junit.Assert.assertNotNull(propertyDescriptorArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "org/mockito/asm/Type" + "'", str4, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo5);
        org.junit.Assert.assertNotNull(typeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(typeArray9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(type13);
        org.junit.Assert.assertNotNull(wildcardClass14);
        org.junit.Assert.assertNotNull(propertyDescriptorArray15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "org/mockito/asm/Type" + "'", str16, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo17);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(typeArray20);
        org.junit.Assert.assertNotNull(typeArray21);
        org.junit.Assert.assertNotNull(wildcardClass22);
        org.junit.Assert.assertNotNull(propertyDescriptorArray23);
        org.junit.Assert.assertNotNull(propertyDescriptorArray24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertNotNull(typeArray27);
        org.junit.Assert.assertNotNull(type28);
        org.junit.Assert.assertNotNull(type29);
        org.junit.Assert.assertNotNull(type31);
        org.junit.Assert.assertNotNull(wildcardClass32);
        org.junit.Assert.assertNotNull(propertyDescriptorArray33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "org/mockito/asm/Type" + "'", str34, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray35);
        org.junit.Assert.assertNotNull(classInfo36);
        org.junit.Assert.assertNotNull(type37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str38, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type39);
        org.junit.Assert.assertNotNull(type40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "D" + "'", str41, "D");
        org.junit.Assert.assertNotNull(typeArray42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "()D" + "'", str43, "()D");
        org.junit.Assert.assertNotNull(type46);
        org.junit.Assert.assertNotNull(type47);
        org.junit.Assert.assertNotNull(type49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "D" + "'", str50, "D");
        org.junit.Assert.assertNotNull(typeArray51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "()D" + "'", str52, "()D");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "D" + "'", str53, "D");
        org.junit.Assert.assertNotNull(type54);
        org.junit.Assert.assertNotNull(wildcardClass55);
        org.junit.Assert.assertNotNull(propertyDescriptorArray56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "org/mockito/asm/Type" + "'", str57, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray58);
        org.junit.Assert.assertNotNull(classInfo59);
        org.junit.Assert.assertNotNull(typeArray60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "org.mockito.asm.Type" + "'", str61, "org.mockito.asm.Type");
        org.junit.Assert.assertNotNull(typeArray62);
        org.junit.Assert.assertNotNull(type64);
        org.junit.Assert.assertNotNull(wildcardClass65);
        org.junit.Assert.assertNotNull(propertyDescriptorArray66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "org/mockito/asm/Type" + "'", str67, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray68);
        org.junit.Assert.assertNotNull(classInfo69);
        org.junit.Assert.assertNotNull(typeArray70);
        org.junit.Assert.assertNotNull(type71);
        org.junit.Assert.assertNotNull(type72);
        org.junit.Assert.assertNotNull(typeArray73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "()F" + "'", str75, "()F");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "()Lorg/mockito/asm/Type;" + "'", str76, "()Lorg/mockito/asm/Type;");
    }

    @Test
    public void test16056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16056");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("[Ljava/beans/PropertyDescriptor;()Lorg/mockito/asm/Type;", method1, method2);
        boolean boolean4 = propertyDescriptor3.isConstrained();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test16057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16057");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("doublejava.beans.PropertyDescriptor[name=(Z)C; shortDescription=Z; values={org/mockito/asm/Type=char}]", method1, method2);
        java.lang.String str4 = propertyDescriptor3.getName();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "doublejava.beans.PropertyDescriptor[name=(Z)C; shortDescription=Z; values={org/mockito/asm/Type=char}]" + "'", str4, "doublejava.beans.PropertyDescriptor[name=(Z)C; shortDescription=Z; values={org/mockito/asm/Type=char}]");
    }

    @Test
    public void test16058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16058");
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
        java.lang.String str17 = signature15.toString();
        java.lang.String str18 = signature15.toString();
        org.mockito.asm.Type type19 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass20 = type19.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray21 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass20);
        java.lang.String str22 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass20);
        org.mockito.cglib.core.ClassInfo classInfo23 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass20);
        org.mockito.asm.Type type24 = classInfo23.getSuperType();
        org.mockito.asm.Type type25 = classInfo23.getSuperType();
        java.lang.Class<?> wildcardClass26 = type25.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray27 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass26);
        java.beans.PropertyDescriptor[] propertyDescriptorArray28 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass26);
        java.lang.reflect.Method[] methodArray31 = org.mockito.cglib.core.ReflectUtils.getPropertyMethods(propertyDescriptorArray28, false, true);
        boolean boolean32 = signature15.equals((java.lang.Object) true);
        org.mockito.asm.Type type33 = signature15.getReturnType();
        java.lang.String str34 = type33.getClassName();
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "D" + "'", str2, "D");
        org.junit.Assert.assertNotNull(typeArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "()D" + "'", str4, "()D");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "D" + "'", str5, "D");
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "org/mockito/asm/Type" + "'", str9, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(propertyDescriptorArray10);
        org.junit.Assert.assertNotNull(classInfo11);
        org.junit.Assert.assertNotNull(typeArray12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "org.mockito.asm.Type" + "'", str13, "org.mockito.asm.Type");
        org.junit.Assert.assertNotNull(typeArray14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "()D" + "'", str16, "()D");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "B()D" + "'", str17, "B()D");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "B()D" + "'", str18, "B()D");
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNotNull(wildcardClass20);
        org.junit.Assert.assertNotNull(propertyDescriptorArray21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "org/mockito/asm/Type" + "'", str22, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo23);
        org.junit.Assert.assertNotNull(type24);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNotNull(wildcardClass26);
        org.junit.Assert.assertNotNull(propertyDescriptorArray27);
        org.junit.Assert.assertNotNull(propertyDescriptorArray28);
        org.junit.Assert.assertNotNull(methodArray31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(type33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "double" + "'", str34, "double");
    }

    @Test
    public void test16059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16059");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.BYTE_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray2 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo3 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        org.mockito.cglib.core.ClassInfo classInfo4 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass1);
        java.beans.PropertyDescriptor[] propertyDescriptorArray5 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type6 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertNotNull(classInfo3);
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(propertyDescriptorArray5);
        org.junit.Assert.assertNotNull(type6);
    }

    @Test
    public void test16060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16060");
        java.lang.reflect.Method method1 = null;
        java.lang.reflect.Method method2 = null;
        java.beans.PropertyDescriptor propertyDescriptor3 = new java.beans.PropertyDescriptor("(Z)C", method1, method2);
        java.util.Enumeration<java.lang.String> strEnumeration4 = propertyDescriptor3.attributeNames();
        boolean boolean5 = propertyDescriptor3.isPreferred();
        java.lang.String str6 = propertyDescriptor3.getName();
        boolean boolean7 = propertyDescriptor3.isExpert();
        propertyDescriptor3.setBound(true);
        propertyDescriptor3.setShortDescription("Z");
        boolean boolean12 = propertyDescriptor3.isHidden();
        java.lang.Class<?> wildcardClass13 = propertyDescriptor3.getPropertyEditorClass();
        org.mockito.asm.Type type14 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.lang.String str16 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass15);
        org.mockito.asm.Type type17 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass15);
        java.lang.String str18 = type17.toString();
        java.beans.PropertyEditor propertyEditor19 = propertyDescriptor3.createPropertyEditor((java.lang.Object) type17);
        java.lang.reflect.Method method20 = null;
        propertyDescriptor3.setReadMethod(method20);
        java.lang.String str22 = propertyDescriptor3.getName();
        java.lang.String str23 = propertyDescriptor3.getShortDescription();
        java.lang.String str24 = propertyDescriptor3.getDisplayName();
        java.lang.String str25 = propertyDescriptor3.getShortDescription();
        propertyDescriptor3.setDisplayName("()LLjava.beans.PropertyDescriptor[name=(Z)C; values={org/mockito/asm/Type=char; ()D=1}];;");
        propertyDescriptor3.setPreferred(true);
        org.junit.Assert.assertNotNull(strEnumeration4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "(Z)C" + "'", str6, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(wildcardClass13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str16, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str18, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNull(propertyEditor19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "(Z)C" + "'", str22, "(Z)C");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Z" + "'", str23, "Z");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "(Z)C" + "'", str24, "(Z)C");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Z" + "'", str25, "Z");
    }

    @Test
    public void test16061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16061");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.FLOAT_TYPE;
        org.mockito.cglib.core.Signature signature3 = new org.mockito.cglib.core.Signature("", "");
        org.mockito.asm.Type type4 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass5 = type4.getClass();
        boolean boolean6 = signature3.equals((java.lang.Object) wildcardClass5);
        boolean boolean7 = type0.equals((java.lang.Object) wildcardClass5);
        java.beans.PropertyDescriptor[] propertyDescriptorArray8 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type9 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type10 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass5);
        java.lang.String str11 = org.mockito.asm.Type.getInternalName((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo12 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.cglib.core.ClassInfo classInfo13 = org.mockito.cglib.core.ReflectUtils.getClassInfo((java.lang.Class) wildcardClass5);
        org.mockito.asm.Type type14 = org.mockito.asm.Type.FLOAT_TYPE;
        java.lang.Class<?> wildcardClass15 = type14.getClass();
        java.beans.PropertyDescriptor[] propertyDescriptorArray16 = org.mockito.cglib.core.ReflectUtils.getBeanProperties((java.lang.Class) wildcardClass15);
        java.beans.PropertyDescriptor[] propertyDescriptorArray17 = org.mockito.cglib.core.ReflectUtils.getBeanSetters((java.lang.Class) wildcardClass15);
        java.lang.Class[] classArray18 = org.mockito.cglib.core.ReflectUtils.getClasses((java.lang.Object[]) propertyDescriptorArray17);
        int int19 = org.mockito.cglib.core.ReflectUtils.findPackageProtected(classArray18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Constructor constructor20 = org.mockito.cglib.core.ReflectUtils.getConstructor((java.lang.Class) wildcardClass5, classArray18);
            org.junit.Assert.fail("Expected exception of type org.mockito.cglib.core.CodeGenerationException; message: java.lang.NoSuchMethodException-->org.mockito.asm.Type.<init>()");
        } catch (org.mockito.cglib.core.CodeGenerationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(wildcardClass5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(propertyDescriptorArray8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "org/mockito/asm/Type" + "'", str11, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo12);
        org.junit.Assert.assertNotNull(classInfo13);
        org.junit.Assert.assertNotNull(type14);
        org.junit.Assert.assertNotNull(wildcardClass15);
        org.junit.Assert.assertNotNull(propertyDescriptorArray16);
        org.junit.Assert.assertNotNull(propertyDescriptorArray17);
        org.junit.Assert.assertNotNull(classArray18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test16062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16062");
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
        org.mockito.cglib.core.Signature signature18 = new org.mockito.cglib.core.Signature("char", "");
        propertyDescriptor14.setValue("org/mockito/asm/Type", (java.lang.Object) signature18);
        java.lang.String str20 = propertyDescriptor14.getDisplayName();
        boolean boolean21 = propertyDescriptor14.isHidden();
        propertyDescriptor14.setDisplayName("org.mockito.asm.Type");
        propertyDescriptor14.setConstrained(true);
        boolean boolean26 = classInfo4.equals((java.lang.Object) propertyDescriptor14);
        java.lang.Object obj28 = propertyDescriptor14.getValue("java.beans.PropertyDescriptor[name=(Z)C; bound]");
        boolean boolean29 = propertyDescriptor14.isPreferred();
        propertyDescriptor14.setShortDescription("()Lorg/mockito/asm/Type;");
        java.lang.String str32 = propertyDescriptor14.getName();
        java.util.Enumeration<java.lang.String> strEnumeration33 = propertyDescriptor14.attributeNames();
        propertyDescriptor14.setExpert(true);
        propertyDescriptor14.setHidden(false);
        propertyDescriptor14.setName("hi!");
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(propertyDescriptorArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "org/mockito/asm/Type" + "'", str3, "org/mockito/asm/Type");
        org.junit.Assert.assertNotNull(classInfo4);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertNotNull(typeArray7);
        org.junit.Assert.assertNotNull(typeArray8);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "org.mockito.asm.Type" + "'", str10, "org.mockito.asm.Type");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "(Z)C" + "'", str20, "(Z)C");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "(Z)C" + "'", str32, "(Z)C");
        org.junit.Assert.assertNotNull(strEnumeration33);
    }

    @Test
    public void test16063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16063");
        org.mockito.asm.Type type0 = org.mockito.asm.Type.SHORT_TYPE;
        java.lang.Class<?> wildcardClass1 = type0.getClass();
        java.lang.String str2 = org.mockito.asm.Type.getDescriptor((java.lang.Class) wildcardClass1);
        org.mockito.asm.Type type3 = org.mockito.asm.Type.getType((java.lang.Class) wildcardClass1);
        java.lang.String str4 = type3.toString();
        org.mockito.asm.Type type5 = type3.getElementType();
        java.lang.Class<?> wildcardClass6 = type5.getClass();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.reflect.Method method7 = org.mockito.cglib.core.ReflectUtils.findInterfaceMethod((java.lang.Class) wildcardClass6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: class org.mockito.asm.Type is not an interface");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type0);
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str2, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Lorg/mockito/asm/Type;" + "'", str4, "Lorg/mockito/asm/Type;");
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }
}


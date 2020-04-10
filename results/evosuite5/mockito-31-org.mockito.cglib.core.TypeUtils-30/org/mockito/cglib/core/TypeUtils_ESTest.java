/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 09:52:43 GMT 2019
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Type;
import org.mockito.cglib.core.MethodInfo;
import org.mockito.cglib.core.Signature;
import org.mockito.cglib.core.TypeUtils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TypeUtils_ESTest extends TypeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = TypeUtils.escapeType("Ljava/lang/Object;");
      assertEquals("Ljava$2Flang$2FObject$3B", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = TypeUtils.escapeType("|vS.m_\"E'CAg");
      assertEquals("|vS$2Em_\"E'CAg", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = TypeUtils.escapeType("G1Nk:T(<t|s)]T");
      assertEquals("G1Nk:T$28<t|s$29]T", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = TypeUtils.escapeType("[?>3XU$|J?hY6q:d;2p");
      assertEquals("$5B?>3XU$24|J?hY6q:d$3B2p", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Type type0 = TypeUtils.fromInternalName("pm{6Fo=m^JR]sEdx,");
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = TypeUtils.DCONST(1);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = TypeUtils.DCONST(0);
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = TypeUtils.DCONST(3);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = TypeUtils.FCONST(2.0F);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = TypeUtils.FCONST(1);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = TypeUtils.FCONST(0);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = TypeUtils.FCONST(3);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = TypeUtils.LCONST(9);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = TypeUtils.LCONST(0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = TypeUtils.LCONST(1);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = TypeUtils.ICONST(5);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = TypeUtils.ICONST(4);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = TypeUtils.ICONST(3);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = TypeUtils.ICONST(2);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = TypeUtils.ICONST(1);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = TypeUtils.ICONST(0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = TypeUtils.ICONST(8);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = TypeUtils.ICONST((-1));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 9);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = class0;
      classArray0[3] = classArray0[1];
      classArray0[4] = classArray0[3];
      classArray0[5] = class0;
      classArray0[6] = classArray0[0];
      classArray0[7] = class0;
      classArray0[8] = classArray0[0];
      Type[] typeArray0 = TypeUtils.getTypes(classArray0);
      assertEquals(9, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Type[] typeArray0 = TypeUtils.getTypes((Class[]) null);
      assertNull(typeArray0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Type type0 = Type.getObjectType("[?>3XU$|J?hY6q:d;2p");
      String string0 = TypeUtils.emulateClassGetName(type0);
      assertEquals("[?>3XU$|J?hY6q:d;2p", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Type type0 = Type.VOID_TYPE;
      String string0 = TypeUtils.emulateClassGetName(type0);
      assertEquals("void", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Type type0 = Type.getType(class0);
      // Undeclared exception!
      try { 
        TypeUtils.getComponentType(type0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Type Ljava/lang/Object; is not an array
         //
         verifyException("org.mockito.cglib.core.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(2, type2.getSort());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.getType(class0);
      Type type1 = TypeUtils.getUnboxedType(type0);
      assertEquals(5, type1.getSort());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      Type type1 = TypeUtils.getUnboxedType(type0);
      assertEquals(2, type1.getSort());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Type type0 = TypeUtils.fromInternalName("Q[O\"$4tU-LW");
      Type type1 = TypeUtils.getBoxedType(type0);
      assertEquals(2, type1.getDimensions());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(2, type2.getSize());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(7, type2.getSort());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(6, type2.getSort());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(4, type2.getSort());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(1, type2.getSort());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Type type0 = TypeUtils.parseType("[]");
      assertEquals(9, type0.getSort());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.parseType("");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Type[] typeArray0 = TypeUtils.parseTypes("Lpm{6Fo=m^JR]sEdx,;");
      assertEquals(2, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Type type0 = TypeUtils.getType("Integer");
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = TypeUtils.parseConstructor(typeArray0);
      assertEquals("<init>", signature0.getName());
      assertEquals("(LInteger;)V", signature0.getDescriptor());
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String[] stringArray0 = TypeUtils.toInternalNames((Type[]) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      String[] stringArray0 = new String[7];
      Type[] typeArray0 = TypeUtils.fromInternalNames(stringArray0);
      String[] stringArray1 = TypeUtils.toInternalNames(typeArray0);
      assertEquals(7, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Type[] typeArray0 = TypeUtils.parseTypes("~P24|aTCF^_Fi");
      int int0 = TypeUtils.getStackSize(typeArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Type[] typeArray0 = TypeUtils.fromInternalNames((String[]) null);
      assertNull(typeArray0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Type type0 = TypeUtils.fromInternalName("pm{6Fo=m^JR]sEdx,");
      String[] stringArray0 = new String[4];
      stringArray0[0] = "pm{6Fo=m^JR]sEdx,";
      Type[] typeArray0 = TypeUtils.fromInternalNames(stringArray0);
      Type[] typeArray1 = TypeUtils.add(typeArray0, type0);
      assertEquals(4, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = TypeUtils.add((Type[]) null, type0);
      assertEquals(1, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      String[] stringArray0 = new String[4];
      Type[] typeArray0 = TypeUtils.fromInternalNames(stringArray0);
      Type[] typeArray1 = TypeUtils.add(typeArray0, type0);
      assertEquals(5, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Type type0 = Type.getReturnType("[Z+6b\"typ!>Gkr^");
      String string0 = TypeUtils.getClassName(type0);
      assertEquals("boolean[]", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = TypeUtils.upperFirst("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      String string0 = TypeUtils.upperFirst("void");
      assertEquals("Void", string0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      String string0 = TypeUtils.upperFirst((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      String string0 = TypeUtils.getPackageName(type1);
      assertEquals("java.lang", string0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      boolean boolean0 = TypeUtils.isSynthetic((-4055));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      boolean boolean0 = TypeUtils.isSynthetic(5);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean boolean0 = TypeUtils.isPrivate(6);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean boolean0 = TypeUtils.isPrivate(116);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      boolean boolean0 = TypeUtils.isInterface((-1285));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      boolean boolean0 = TypeUtils.isInterface(3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      boolean boolean0 = TypeUtils.isAbstract(3893);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      boolean boolean0 = TypeUtils.isAbstract(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      boolean boolean0 = TypeUtils.isPublic(3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      boolean boolean0 = TypeUtils.isPublic(2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      boolean boolean0 = TypeUtils.isProtected(61);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      boolean boolean0 = TypeUtils.isProtected(8);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      boolean boolean0 = TypeUtils.isStatic((-258));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      boolean boolean0 = TypeUtils.isStatic(5);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      boolean boolean0 = TypeUtils.isFinal(188);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      boolean boolean0 = TypeUtils.isFinal(6);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      String string0 = TypeUtils.getPackageName(type0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      // Undeclared exception!
      try { 
        TypeUtils.isConstructor((MethodInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Type type0 = TypeUtils.getType("java.lang.Byte");
      Type type1 = TypeUtils.getUnboxedType(type0);
      assertEquals(3, type1.getSort());
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      String[] stringArray0 = new String[0];
      Type[] typeArray0 = TypeUtils.fromInternalNames(stringArray0);
      assertNotNull(typeArray0);
      
      Type[] typeArray1 = TypeUtils.add(typeArray0, typeArray0);
      assertNotSame(typeArray1, typeArray0);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Signature signature0 = TypeUtils.parseConstructor((String) null);
      assertEquals("(Ljava/lang/null;)V", signature0.getDescriptor());
      assertEquals("<init>", signature0.getName());
  }
}

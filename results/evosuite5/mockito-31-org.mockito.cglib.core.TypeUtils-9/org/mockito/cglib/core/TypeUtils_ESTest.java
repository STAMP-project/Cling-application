/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 22:12:30 GMT 2019
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.Type;
import org.mockito.cglib.core.MethodInfo;
import org.mockito.cglib.core.Signature;
import org.mockito.cglib.core.TypeUtils;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class TypeUtils_ESTest extends TypeUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = TypeUtils.escapeType("F9ykd[R<;vF+u^w8");
      assertEquals("F9ykd$5BR<$3BvF+u^w8", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = TypeUtils.escapeType("/R\"|)mO,^(");
      assertEquals("$2FR\"|$29mO,^$28", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = TypeUtils.escapeType("org.mockito.cglib.core.CodeEmitter$State");
      assertEquals("org$2Emockito$2Ecglib$2Ecore$2ECodeEmitter$24State", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Type type0 = TypeUtils.getType("y_x4rVl9bMDbgxy");
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int int0 = TypeUtils.DCONST(1.0);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int int0 = TypeUtils.DCONST(0.0);
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = TypeUtils.DCONST(7);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = TypeUtils.FCONST(2);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = TypeUtils.FCONST(1.0F);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = TypeUtils.FCONST(0);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = TypeUtils.FCONST((-547.1748F));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = TypeUtils.LCONST(1L);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = TypeUtils.LCONST(0L);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = TypeUtils.LCONST((-1L));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = TypeUtils.ICONST(10);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = TypeUtils.ICONST(4);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = TypeUtils.ICONST(3);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = TypeUtils.ICONST(2);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = TypeUtils.ICONST(1);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = TypeUtils.ICONST(0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = TypeUtils.ICONST(5);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = TypeUtils.ICONST((-1));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 4);
      classArray0[0] = class0;
      classArray0[1] = class0;
      classArray0[2] = classArray0[0];
      classArray0[3] = class0;
      Type[] typeArray0 = TypeUtils.getTypes(classArray0);
      assertEquals(4, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Type[] typeArray0 = TypeUtils.getTypes((Class[]) null);
      assertNull(typeArray0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Type type0 = Type.getObjectType("[]");
      String string0 = TypeUtils.emulateClassGetName(type0);
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Type type0 = TypeUtils.getType("TrEwabxe");
      String string0 = TypeUtils.emulateClassGetName(type0);
      assertEquals("TrEwabxe", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Type type0 = TypeUtils.getType("TrEwabxe");
      // Undeclared exception!
      try { 
        TypeUtils.getComponentType(type0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Type LTrEwabxe; is not an array
         //
         verifyException("org.mockito.cglib.core.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.getType(class0);
      Type type1 = TypeUtils.getUnboxedType(type0);
      assertEquals(5, type1.getSort());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Type type0 = TypeUtils.getType("TrEwabxe");
      Type type1 = TypeUtils.getUnboxedType(type0);
      assertEquals(10, type1.getSort());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(2, type2.getSize());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(7, type2.getSort());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(6, type2.getSort());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(4, type2.getSort());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(3, type2.getSort());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(2, type2.getSort());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Type[] typeArray0 = TypeUtils.parseTypes("[]");
      assertEquals(1, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Type[] typeArray0 = new Type[2];
      // Undeclared exception!
      try { 
        TypeUtils.parseConstructor(typeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Type[] typeArray0 = new Type[0];
      Signature signature0 = TypeUtils.parseConstructor(typeArray0);
      assertEquals("()V", signature0.getDescriptor());
      assertEquals("<init>", signature0.getName());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String[] stringArray0 = TypeUtils.toInternalNames((Type[]) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Type[] typeArray0 = new Type[1];
      Type type0 = Type.BOOLEAN_TYPE;
      typeArray0[0] = type0;
      int int0 = TypeUtils.getStackSize(typeArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Type[] typeArray0 = TypeUtils.fromInternalNames((String[]) null);
      assertNull(typeArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String[] stringArray0 = new String[2];
      Type[] typeArray0 = TypeUtils.fromInternalNames(stringArray0);
      String[] stringArray1 = TypeUtils.toInternalNames(typeArray0);
      assertEquals(2, stringArray1.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Type[] typeArray0 = new Type[1];
      Type type0 = Type.SHORT_TYPE;
      typeArray0[0] = type0;
      Type[] typeArray1 = TypeUtils.add(typeArray0, type0);
      assertEquals(1, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Type[] typeArray0 = TypeUtils.add((Type[]) null, (Type) null);
      assertEquals(1, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Type[] typeArray0 = new Type[1];
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray1 = TypeUtils.add(typeArray0, type0);
      assertEquals(2, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Type type0 = Type.getReturnType("[FR &j");
      String string0 = TypeUtils.getClassName(type0);
      assertEquals("float[]", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      String string0 = TypeUtils.upperFirst("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = TypeUtils.upperFirst("TrEwabxe");
      assertEquals("TrEwabxe", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = TypeUtils.upperFirst((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Class<Type> class0 = Type.class;
      Type type0 = Type.getType(class0);
      String string0 = TypeUtils.getPackageName(type0);
      assertEquals("org.mockito.asm", string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      boolean boolean0 = TypeUtils.isSynthetic((-1012));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      boolean boolean0 = TypeUtils.isSynthetic(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      boolean boolean0 = TypeUtils.isPrivate(6);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      boolean boolean0 = TypeUtils.isPrivate(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      boolean boolean0 = TypeUtils.isInterface((-1199));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean boolean0 = TypeUtils.isInterface(2249);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean boolean0 = TypeUtils.isAbstract(3170);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      boolean boolean0 = TypeUtils.isAbstract(104);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      boolean boolean0 = TypeUtils.isPublic(1831);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      boolean boolean0 = TypeUtils.isPublic(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      boolean boolean0 = TypeUtils.isProtected(47);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      boolean boolean0 = TypeUtils.isProtected(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      boolean boolean0 = TypeUtils.isStatic(10);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      boolean boolean0 = TypeUtils.isStatic((-2603));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      boolean boolean0 = TypeUtils.isFinal((-3246));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      boolean boolean0 = TypeUtils.isFinal(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      String string0 = TypeUtils.getPackageName(type0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Type type0 = TypeUtils.parseType("dnUXayf10T!5i_%");
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      MethodInfo methodInfo0 = mock(MethodInfo.class, new ViolatedAssumptionAnswer());
      doReturn((Signature) null).when(methodInfo0).getSignature();
      // Undeclared exception!
      try { 
        TypeUtils.isConstructor(methodInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Type type0 = TypeUtils.getType("TrEwabxe");
      Type type1 = TypeUtils.getBoxedType(type0);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Type[] typeArray0 = new Type[1];
      Type[] typeArray1 = TypeUtils.add(typeArray0, typeArray0);
      assertEquals(2, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Signature signature0 = TypeUtils.parseConstructor("MJA5?iI$:EG0.~,");
      assertEquals("(LMJA5?iI$:EG0/~;)V", signature0.getDescriptor());
      assertEquals("<init>", signature0.getName());
  }
}

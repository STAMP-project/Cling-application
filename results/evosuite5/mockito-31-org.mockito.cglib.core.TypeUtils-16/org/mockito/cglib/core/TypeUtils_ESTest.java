/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 13 14:04:27 GMT 2019
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
      String string0 = TypeUtils.escapeType(">AvL|o[V<*BU(");
      assertEquals(">AvL|o$5BV<*BU$28", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = TypeUtils.escapeType("h;3%L28-IwnXvk");
      assertEquals("h$3B3%L28-IwnXvk", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = TypeUtils.escapeType("+vZo_>A!&/");
      assertEquals("+vZo_>A!&$2F", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = TypeUtils.escapeType("BH.]%\" (,)mSiL|D");
      assertEquals("BH$2E]%\" $28,$29mSiL|D", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = TypeUtils.escapeType("!7<$]2bH!M5");
      assertEquals("!7<$24]2bH!M5", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      int int0 = TypeUtils.NEWARRAY(type0);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int int0 = TypeUtils.DCONST(1.0);
      assertEquals(15, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int int0 = TypeUtils.DCONST(0.0);
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int int0 = TypeUtils.DCONST(123);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int int0 = TypeUtils.FCONST(2.0F);
      assertEquals(13, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      int int0 = TypeUtils.FCONST(1.0F);
      assertEquals(12, int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      int int0 = TypeUtils.FCONST(0.0F);
      assertEquals(11, int0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      int int0 = TypeUtils.FCONST(1690.0F);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      int int0 = TypeUtils.LCONST((-52L));
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      int int0 = TypeUtils.LCONST(0L);
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      int int0 = TypeUtils.LCONST(1L);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      int int0 = TypeUtils.ICONST(5);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      int int0 = TypeUtils.ICONST(4);
      assertEquals(7, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      int int0 = TypeUtils.ICONST(3);
      assertEquals(6, int0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      int int0 = TypeUtils.ICONST(2);
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      int int0 = TypeUtils.ICONST(1);
      assertEquals(4, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      int int0 = TypeUtils.ICONST(0);
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      int int0 = TypeUtils.ICONST(6);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      int int0 = TypeUtils.ICONST((-1));
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Class<Object>[] classArray0 = (Class<Object>[]) Array.newInstance(Class.class, 1);
      Class<Object> class0 = Object.class;
      classArray0[0] = class0;
      Type[] typeArray0 = TypeUtils.getTypes(classArray0);
      assertEquals(1, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Type[] typeArray0 = TypeUtils.getTypes((Class[]) null);
      assertNull(typeArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Type type0 = TypeUtils.parseType("String[]");
      String string0 = TypeUtils.emulateClassGetName(type0);
      assertEquals("[Ljava.lang.String;", string0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      String string0 = TypeUtils.emulateClassGetName(type0);
      assertEquals("float", string0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      // Undeclared exception!
      try { 
        TypeUtils.getComponentType(type0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Type B is not an array
         //
         verifyException("org.mockito.cglib.core.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Type type0 = TypeUtils.parseType("Character");
      Type type1 = TypeUtils.getUnboxedType(type0);
      assertEquals(2, type1.getSort());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      Type type1 = TypeUtils.getUnboxedType(type0);
      assertEquals(6, type1.getSort());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Type type0 = Type.VOID_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(8, type2.getSort());
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
      Type type0 = Type.INT_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(5, type2.getSort());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(4, type2.getSort());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(3, type2.getSort());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(6, type2.getSort());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      Type type1 = TypeUtils.getBoxedType(type0);
      Type type2 = TypeUtils.getUnboxedType(type1);
      assertEquals(1, type2.getSort());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      String[] stringArray0 = new String[4];
      Type[] typeArray0 = TypeUtils.fromInternalNames(stringArray0);
      Signature signature0 = TypeUtils.parseConstructor(typeArray0);
      assertEquals("<init>", signature0.getName());
      assertEquals("(Lnull;Lnull;Lnull;Lnull;)V", signature0.getDescriptor());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Type[] typeArray0 = new Type[1];
      // Undeclared exception!
      try { 
        TypeUtils.toInternalNames(typeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      String[] stringArray0 = TypeUtils.toInternalNames((Type[]) null);
      assertNull(stringArray0);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Type[] typeArray0 = new Type[0];
      String[] stringArray0 = TypeUtils.toInternalNames(typeArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Type type0 = TypeUtils.getType("7*]iwzx.d4HgP`BY[.d");
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = typeArray0[2];
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      int int0 = TypeUtils.getStackSize(typeArray0);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Type[] typeArray0 = TypeUtils.fromInternalNames((String[]) null);
      assertNull(typeArray0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      Type[] typeArray1 = TypeUtils.add(typeArray0, type0);
      assertEquals(3, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = TypeUtils.add((Type[]) null, type0);
      assertEquals(1, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      Type[] typeArray0 = new Type[0];
      Type[] typeArray1 = TypeUtils.add(typeArray0, type0);
      assertEquals(1, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      String string0 = TypeUtils.upperFirst("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String string0 = TypeUtils.upperFirst("$29");
      assertEquals("$29", string0);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      String string0 = TypeUtils.upperFirst((String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      boolean boolean0 = TypeUtils.isSynthetic((-1081));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      boolean boolean0 = TypeUtils.isSynthetic(219);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      boolean boolean0 = TypeUtils.isPrivate(11);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      boolean boolean0 = TypeUtils.isPrivate(16);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      boolean boolean0 = TypeUtils.isInterface((-1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      boolean boolean0 = TypeUtils.isInterface(2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      boolean boolean0 = TypeUtils.isAbstract((-1));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      boolean boolean0 = TypeUtils.isAbstract(2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      boolean boolean0 = TypeUtils.isPublic(3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      boolean boolean0 = TypeUtils.isPublic(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      boolean boolean0 = TypeUtils.isProtected(7);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      boolean boolean0 = TypeUtils.isProtected(185);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      boolean boolean0 = TypeUtils.isStatic(10);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      boolean boolean0 = TypeUtils.isStatic(3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      boolean boolean0 = TypeUtils.isFinal(1690);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      boolean boolean0 = TypeUtils.isFinal(9);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      String string0 = TypeUtils.getPackageName(type0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Type type0 = TypeUtils.parseType("Class[]");
      String string0 = TypeUtils.getPackageName(type0);
      assertEquals("java.lang", string0);
      assertEquals(9, type0.getSort());
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Type[] typeArray0 = new Type[0];
      Signature signature0 = TypeUtils.parseConstructor(typeArray0);
      MethodInfo methodInfo0 = mock(MethodInfo.class, new ViolatedAssumptionAnswer());
      doReturn(signature0).when(methodInfo0).getSignature();
      boolean boolean0 = TypeUtils.isConstructor(methodInfo0);
      assertTrue(boolean0);
      assertEquals("()V", signature0.getDescriptor());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Type[] typeArray0 = TypeUtils.parseTypes("c]|]G");
      Type[] typeArray1 = TypeUtils.add(typeArray0, typeArray0);
      assertEquals(2, typeArray1.length);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      Signature signature0 = TypeUtils.parseConstructor("BH.]%\" (,)mSiL|D");
      assertEquals("<init>", signature0.getName());
      assertEquals("(LBH/]%\" (;)V", signature0.getDescriptor());
  }
}

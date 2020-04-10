/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 20:35:50 GMT 2019
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Type;
import org.mockito.asm.tree.FieldInsnNode;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Type type0 = Type.getType("[B");
      Class<String> class0 = String.class;
      Type type1 = Type.getType(class0);
      Type type2 = Type.DOUBLE_TYPE;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("[B");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type2, type1, linkedList0, false);
      // Undeclared exception!
      try { 
        simpleVerifier0.isAssignableFrom(type0, type2);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.mockito.asm.Type
         //
         verifyException("org.mockito.asm.tree.analysis.SimpleVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Type type0 = Type.getType("[B");
      Class<String> class0 = String.class;
      Type type1 = Type.getType(class0);
      Type type2 = Type.VOID_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type2, type1, false);
      boolean boolean0 = simpleVerifier0.isAssignableFrom(type0, type2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Type type0 = Type.getType("[B");
      Class<String> class0 = String.class;
      Type type1 = Type.getType(class0);
      Type type2 = Type.DOUBLE_TYPE;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type2, type1, linkedList0, false);
      boolean boolean0 = simpleVerifier0.isAssignableFrom(type0, type2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Type type0 = Type.getType("[B");
      Type type1 = Type.DOUBLE_TYPE;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type1, type0, linkedList0, false);
      boolean boolean0 = simpleVerifier0.isAssignableFrom(type0, type1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      Type type1 = simpleVerifier0.getSuperClass(type0);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      Type type1 = Type.getObjectType("[B");
      boolean boolean0 = simpleVerifier0.isAssignableFrom(type0, type1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      Type type1 = Type.SHORT_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type1, true);
      // Undeclared exception!
      try { 
        simpleVerifier0.isInterface(type1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.ClassNotFoundException: Class 'short.class' should be in target project, but could not be found!
         //
         verifyException("org.mockito.asm.tree.analysis.SimpleVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      boolean boolean0 = simpleVerifier0.isInterface(type0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      BasicValue basicValue1 = new BasicValue(type0);
      Value value0 = simpleVerifier0.merge(basicValue1, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Type type0 = Type.getType("[B");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue1 = new BasicValue(type0);
      Value value0 = simpleVerifier0.merge(basicValue0, basicValue1);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getType("Lnull;");
      BasicValue basicValue1 = new BasicValue(type0);
      Value value0 = simpleVerifier0.merge(basicValue0, basicValue1);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Type type0 = Type.getReturnType("Lnull;");
      BasicValue basicValue1 = new BasicValue(type0);
      Value value0 = simpleVerifier0.getElementValue(basicValue1);
      assertSame(value0, basicValue1);
      
      Value value1 = simpleVerifier0.merge(value0, basicValue0);
      assertSame(value1, basicValue0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue1 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      BasicValue basicValue2 = (BasicValue)simpleVerifier0.merge(basicValue0, basicValue1);
      assertFalse(basicValue2.isReference());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      BasicValue basicValue1 = (BasicValue)BasicValue.DOUBLE_VALUE;
      Value value0 = simpleVerifier0.merge(basicValue0, basicValue1);
      assertNotSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue1 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      Value value0 = simpleVerifier0.merge(basicValue1, basicValue0);
      assertNotSame(value0, basicValue1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      Value value0 = simpleVerifier0.merge(basicValue0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      BasicValue basicValue1 = (BasicValue)BasicValue.REFERENCE_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getType("Lnull;");
      BasicValue basicValue0 = new BasicValue(type0);
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getType("Cr");
      BasicValue basicValue0 = new BasicValue(type0);
      // Undeclared exception!
      try { 
        simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error
         //
         verifyException("org.mockito.asm.tree.analysis.SimpleVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getType("[F");
      BasicValue basicValue0 = new BasicValue(type0);
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      BasicValue basicValue1 = (BasicValue)BasicValue.INT_VALUE;
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      // Undeclared exception!
      try { 
        simpleVerifier0.getElementValue(basicValue0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error
         //
         verifyException("org.mockito.asm.tree.analysis.SimpleVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      // Undeclared exception!
      try { 
        simpleVerifier0.getElementValue(basicValue0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error
         //
         verifyException("org.mockito.asm.tree.analysis.SimpleVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      boolean boolean0 = simpleVerifier0.isArrayValue(basicValue0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getReturnType("[F");
      BasicValue basicValue0 = new BasicValue(type0);
      boolean boolean0 = simpleVerifier0.isArrayValue(basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, (List) null, true);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(1, "L,Y;", "L,Y;", "");
      Value value0 = simpleVerifier0.newOperation(fieldInsnNode0);
      boolean boolean0 = simpleVerifier0.isArrayValue(value0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      boolean boolean0 = simpleVerifier0.isArrayValue(basicValue0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getType("[F");
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.newValue(type0);
      assertTrue(basicValue0.isReference());
      
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.getElementValue(basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getReturnType("[C");
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.newValue(type0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getReturnType("[Z");
      Value value0 = simpleVerifier0.newValue(type0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getObjectType("[B");
      Value value0 = simpleVerifier0.newValue(type0);
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.merge(value0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Type type0 = Type.getType("[B");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      Class<Integer> class0 = Integer.class;
      Type type1 = Type.getType(class0);
      BasicValue basicValue1 = new BasicValue(type1);
      BasicValue basicValue2 = (BasicValue)simpleVerifier0.merge(basicValue1, basicValue0);
      assertNotSame(basicValue2, basicValue0);
      assertFalse(basicValue2.equals((Object)basicValue0));
      assertTrue(basicValue2.isReference());
      assertNotSame(basicValue2, basicValue1);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue((Type) null);
      assertEquals(1, value0.getSize());
  }
}

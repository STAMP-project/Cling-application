/*
 * This file was automatically generated by EvoSuite
 * Sat Aug 17 08:07:34 GMT 2019
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Type;
import org.mockito.asm.tree.IntInsnNode;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Type type0 = Type.getType("[J");
      Type type1 = Type.LONG_TYPE;
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type1, type0, linkedList0, false);
      linkedList0.add(type0);
      Type type2 = Type.getObjectType("java/lang/Integer");
      boolean boolean0 = simpleVerifier0.isAssignableFrom(type2, type1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Type type0 = Type.getType("[J");
      Type type1 = Type.LONG_TYPE;
      Class<String> class0 = String.class;
      Type type2 = Type.getType(class0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type1, type0, linkedList0, false);
      linkedList0.add(type2);
      boolean boolean0 = simpleVerifier0.isAssignableFrom(type2, type1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Type type0 = Type.getType("[J");
      Type type1 = Type.BYTE_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type1, type0, true);
      boolean boolean0 = simpleVerifier0.isAssignableFrom(type0, type1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Type type0 = Type.getType("[J");
      Type type1 = Type.BYTE_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type1, type0, false);
      Class<Integer> class0 = Integer.class;
      Type type2 = Type.getType(class0);
      boolean boolean0 = simpleVerifier0.isAssignableFrom(type2, type1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Type type0 = Type.getType("[J");
      Type type1 = Type.BYTE_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type1, type1, false);
      boolean boolean0 = simpleVerifier0.isAssignableFrom(type1, type0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, false);
      Type type1 = simpleVerifier0.getSuperClass(type0);
      assertEquals(1, type1.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = Type.getReturnType("[C");
      Type type1 = Type.VOID_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type1, type0, false);
      boolean boolean0 = simpleVerifier0.isInterface(type0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = Type.getReturnType("[C");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, false);
      boolean boolean0 = simpleVerifier0.isInterface(type0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.getType(class0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      Type type1 = Type.getObjectType("org.mockito.asm.Opcodes");
      BasicValue basicValue1 = new BasicValue(type1);
      BasicValue basicValue2 = (BasicValue)simpleVerifier0.merge(basicValue1, basicValue0);
      assertTrue(basicValue2.isReference());
      assertNotSame(basicValue2, basicValue1);
      assertNotSame(basicValue2, basicValue0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getType("[J");
      BasicValue basicValue0 = new BasicValue(type0);
      BasicValue basicValue1 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value0 = simpleVerifier0.merge(basicValue0, basicValue1);
      assertSame(value0, basicValue1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Class<BasicValue> class0 = BasicValue.class;
      Type type0 = Type.getType(class0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      Type type1 = Type.getType("Lnull;");
      Value value0 = simpleVerifier0.newValue(type1);
      Value value1 = simpleVerifier0.merge(value0, basicValue0);
      assertSame(value1, basicValue0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.getType(class0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      Type type1 = Type.getType("Lnull;");
      Value value0 = simpleVerifier0.newValue(type1);
      Value value1 = simpleVerifier0.merge(basicValue0, value0);
      assertSame(value1, basicValue0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      BasicValue basicValue1 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      BasicValue basicValue2 = (BasicValue)simpleVerifier0.merge(basicValue0, basicValue1);
      assertFalse(basicValue2.isReference());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      BasicValue basicValue1 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value0 = simpleVerifier0.merge(basicValue0, basicValue1);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getType("[J");
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.newValue(type0);
      BasicValue basicValue1 = (BasicValue)BasicValue.FLOAT_VALUE;
      BasicValue basicValue2 = (BasicValue)simpleVerifier0.merge(basicValue0, basicValue1);
      assertFalse(basicValue2.isReference());
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      BasicValue basicValue1 = (BasicValue)BasicValue.FLOAT_VALUE;
      Value value0 = simpleVerifier0.merge(basicValue0, basicValue1);
      assertNotSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Type type0 = Type.getReturnType("[ZJ");
      Class<Integer> class0 = Integer.class;
      Type type1 = Type.getType(class0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue(type0);
      Value value1 = simpleVerifier0.newValue(type1);
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.merge(value1, value0);
      assertNotSame(basicValue0, value1);
      assertTrue(basicValue0.isReference());
      assertNotSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      Value value0 = simpleVerifier0.merge(basicValue0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getType("K)6;6h/x8!");
      Value value0 = simpleVerifier0.newValue(type0);
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, value0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Type type0 = Type.getReturnType("[ZJ");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, false);
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
  public void test21()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getType("Lnull;");
      Value value0 = simpleVerifier0.newValue(type0);
      boolean boolean0 = simpleVerifier0.isSubTypeOf(value0, value0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      BasicValue basicValue1 = (BasicValue)BasicValue.FLOAT_VALUE;
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(46, 46);
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      try { 
        simpleVerifier0.binaryOperation(intInsnNode0, basicValue0, basicValue0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // First argument: expected [I, but found R
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.BOOLEAN_TYPE;
      Value value0 = simpleVerifier0.newValue(type0);
      boolean boolean0 = simpleVerifier0.isSubTypeOf(value0, value0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getType("K)6;6h/x8!");
      Value value0 = simpleVerifier0.newValue(type0);
      // Undeclared exception!
      try { 
        simpleVerifier0.getElementValue(value0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error
         //
         verifyException("org.mockito.asm.tree.analysis.SimpleVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getType("Lnull;");
      Value value0 = simpleVerifier0.newValue(type0);
      Value value1 = simpleVerifier0.getElementValue(value0);
      assertSame(value1, value0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getType("[C");
      BasicValue basicValue0 = new BasicValue(type0);
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.getElementValue(basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      boolean boolean0 = simpleVerifier0.isArrayValue(basicValue0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Type type0 = Type.getType("Lnull;");
      BasicValue basicValue0 = new BasicValue(type0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      boolean boolean0 = simpleVerifier0.isArrayValue(basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getType("[J");
      BasicValue basicValue0 = new BasicValue(type0);
      boolean boolean0 = simpleVerifier0.isArrayValue(basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      boolean boolean0 = simpleVerifier0.isArrayValue(basicValue0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getReturnType("[S");
      Value value0 = simpleVerifier0.newValue(type0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getType("[B");
      Value value0 = simpleVerifier0.newValue(type0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Type type0 = Type.getReturnType("[C");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.newValue(type0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Type type0 = Type.getReturnType("[J");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue(type0);
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value1 = simpleVerifier0.merge(basicValue0, value0);
      assertSame(value1, basicValue0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue((Type) null);
      assertEquals(1, value0.getSize());
  }
}

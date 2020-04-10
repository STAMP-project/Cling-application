/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 20:40:43 GMT 2019
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
import org.mockito.asm.tree.InsnNode;
import org.mockito.asm.tree.LdcInsnNode;
import org.mockito.asm.tree.TypeInsnNode;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Type type0 = Type.getType("[C");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.add((Integer) 1);
      LdcInsnNode ldcInsnNode0 = new LdcInsnNode("[C");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      Value value0 = simpleVerifier0.newOperation(ldcInsnNode0);
      Class<Object> class0 = Object.class;
      Type type1 = Type.getType(class0);
      BasicValue basicValue0 = new BasicValue(type0);
      SimpleVerifier simpleVerifier1 = new SimpleVerifier(type0, type1, linkedList0, true);
      // Undeclared exception!
      try { 
        simpleVerifier1.merge(basicValue0, value0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to org.mockito.asm.Type
         //
         verifyException("org.mockito.asm.tree.analysis.SimpleVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Type type0 = Type.getType("[C");
      Class<Type> class0 = Type.class;
      Type type1 = Type.getType(class0);
      BasicValue basicValue0 = new BasicValue(type1);
      Class<BasicValue> class1 = BasicValue.class;
      Type type2 = Type.getType(class1);
      BasicValue basicValue1 = new BasicValue(type0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type2, true);
      BasicValue basicValue2 = (BasicValue)simpleVerifier0.merge(basicValue0, basicValue1);
      assertNotSame(basicValue2, basicValue0);
      assertNotSame(basicValue2, basicValue1);
      assertFalse(basicValue2.equals((Object)basicValue1));
      assertTrue(basicValue2.isReference());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      LinkedList<String> linkedList0 = new LinkedList<String>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, linkedList0, true);
      Type type1 = simpleVerifier0.getSuperClass(type0);
      assertSame(type0, type1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      BasicValue basicValue0 = new BasicValue(type0);
      Class<Integer> class1 = Integer.class;
      Type type1 = Type.getType(class1);
      BasicValue basicValue1 = new BasicValue(type1);
      BasicValue basicValue2 = (BasicValue)simpleVerifier0.merge(basicValue1, basicValue0);
      assertNotSame(basicValue2, basicValue0);
      assertFalse(basicValue2.equals((Object)basicValue0));
      assertTrue(basicValue2.isReference());
      assertNotSame(basicValue2, basicValue1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Type type0 = Type.getType("[C");
      Class<String> class0 = String.class;
      Type type1 = Type.getType(class0);
      BasicValue basicValue0 = new BasicValue(type0);
      Class<Integer> class1 = Integer.class;
      Type type2 = Type.getType(class1);
      BasicValue basicValue1 = new BasicValue(type1);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type1, type2, linkedList0, true);
      BasicValue basicValue2 = (BasicValue)simpleVerifier0.merge(basicValue0, basicValue1);
      assertNotSame(basicValue2, basicValue1);
      assertFalse(basicValue2.equals((Object)basicValue1));
      assertTrue(basicValue2.isReference());
      assertNotSame(basicValue2, basicValue0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Type type0 = Type.getType("[C");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      BasicValue basicValue1 = new BasicValue(type0);
      Value value0 = simpleVerifier0.merge(basicValue1, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = Type.getType("[C");
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.add((Integer) 1);
      LdcInsnNode ldcInsnNode0 = new LdcInsnNode("[C");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      Value value0 = simpleVerifier0.newOperation(ldcInsnNode0);
      Class<Object> class0 = Object.class;
      linkedList0.removeFirst();
      Type type1 = Type.getType(class0);
      BasicValue basicValue0 = new BasicValue(type0);
      SimpleVerifier simpleVerifier1 = new SimpleVerifier(type0, type1, linkedList0, true);
      BasicValue basicValue1 = (BasicValue)simpleVerifier1.merge(basicValue0, value0);
      assertTrue(basicValue1.isReference());
      assertNotSame(basicValue1, value0);
      assertNotSame(basicValue1, basicValue0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = Type.getObjectType("oyte");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      InsnNode insnNode0 = new InsnNode(1);
      Value value0 = simpleVerifier0.newOperation(insnNode0);
      Value value1 = simpleVerifier0.merge(basicValue0, value0);
      assertSame(value1, basicValue0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Type type0 = Type.getObjectType("oyte");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      InsnNode insnNode0 = new InsnNode(1);
      Value value0 = simpleVerifier0.newOperation(insnNode0);
      Value value1 = simpleVerifier0.merge(value0, basicValue0);
      assertSame(value1, basicValue0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue1 = (BasicValue)BasicValue.REFERENCE_VALUE;
      BasicValue basicValue2 = (BasicValue)simpleVerifier0.merge(basicValue1, basicValue0);
      assertFalse(basicValue2.isReference());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Type type0 = Type.getObjectType("ky[$");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      BasicValue basicValue1 = new BasicValue(type0);
      BasicValue basicValue2 = (BasicValue)simpleVerifier0.merge(basicValue1, basicValue0);
      assertFalse(basicValue2.isReference());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      BasicValue basicValue1 = (BasicValue)BasicValue.DOUBLE_VALUE;
      Value value0 = simpleVerifier0.merge(basicValue0, basicValue1);
      assertNotSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Type type0 = Type.getType("[C");
      Class<Type> class0 = Type.class;
      Type type1 = Type.getType(class0);
      BasicValue basicValue0 = new BasicValue(type1);
      BasicValue basicValue1 = new BasicValue(type0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type1, true);
      Value value0 = simpleVerifier0.merge(basicValue0, basicValue1);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      BasicValue basicValue1 = new BasicValue((Type) null);
      Value value0 = simpleVerifier0.merge(basicValue1, basicValue0);
      assertNotSame(value0, basicValue1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(1, "LS^fDF%");
      Value value0 = simpleVerifier0.newOperation(typeInsnNode0);
      Value value1 = simpleVerifier0.merge(value0, value0);
      assertEquals(1, value1.getSize());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Type type0 = Type.getObjectType(";C");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue(type0);
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, value0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue1 = (BasicValue)BasicValue.REFERENCE_VALUE;
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue1, basicValue0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.BYTE_TYPE;
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
      Type type0 = Type.getType("[C");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue(type0);
      boolean boolean0 = simpleVerifier0.isSubTypeOf(value0, value0);
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
      Type type0 = Type.FLOAT_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue(type0);
      boolean boolean0 = simpleVerifier0.isSubTypeOf(value0, value0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(1, "LS^fDF%");
      Value value0 = simpleVerifier0.newOperation(typeInsnNode0);
      boolean boolean0 = simpleVerifier0.isSubTypeOf(value0, value0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue(type0);
      boolean boolean0 = simpleVerifier0.isSubTypeOf(value0, value0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
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
  public void test25()  throws Throwable  {
      Type type0 = Type.getType("[C");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue(type0);
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.getElementValue(value0);
      assertFalse(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Type type0 = Type.getType("Lnull;");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue(type0);
      Value value1 = simpleVerifier0.getElementValue(value0);
      assertSame(value1, value0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
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
  public void test28()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      boolean boolean0 = simpleVerifier0.isArrayValue(basicValue0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Type type0 = Type.getType("[C");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue(type0);
      boolean boolean0 = simpleVerifier0.isArrayValue(value0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Type type0 = Type.getType("Lnull;");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue(type0);
      boolean boolean0 = simpleVerifier0.isArrayValue(value0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      boolean boolean0 = simpleVerifier0.isArrayValue(basicValue0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Type type0 = Type.getObjectType("[I");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.newValue(type0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getReturnType("[S");
      Value value0 = simpleVerifier0.newValue(type0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Type type0 = Type.getType("[Zg?OAi%.TP2&r");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue(type0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.newValue((Type) null);
      assertFalse(basicValue0.isReference());
  }
}

/*
 * This file was automatically generated by EvoSuite
 * Wed Jul 24 20:35:54 GMT 2019
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
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Type type0 = Type.getReturnType("[B");
      BasicValue basicValue0 = new BasicValue(type0);
      Type type1 = Type.getType("Lorg/mockito/asm/tree/analysis/BasicValue;");
      BasicValue basicValue1 = new BasicValue(type1);
      Class<Type> class0 = Type.class;
      Type type2 = Type.getType(class0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) type2);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type1, type2, linkedList0, true);
      BasicValue basicValue2 = (BasicValue)simpleVerifier0.merge(basicValue0, basicValue1);
      assertTrue(basicValue2.isReference());
      assertNotSame(basicValue2, basicValue0);
      assertNotSame(basicValue2, basicValue1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Type type0 = Type.getReturnType("[B");
      BasicValue basicValue0 = new BasicValue(type0);
      Type type1 = Type.getType("Lorg/mockito/asm/tree/analysis/BasicValue;");
      BasicValue basicValue1 = new BasicValue(type1);
      Class<Type> class0 = Type.class;
      Type type2 = Type.getType(class0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) type0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type1, type2, linkedList0, true);
      Value value0 = simpleVerifier0.merge(basicValue0, basicValue1);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getObjectType("[B");
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
  public void test03()  throws Throwable  {
      Type type0 = Type.getObjectType("[DHc|Bs^]B6|,'+D");
      BasicValue basicValue0 = new BasicValue(type0);
      Type type1 = Type.getType("[DHc|Bs^]B6|,'+D");
      BasicValue basicValue1 = new BasicValue(type1);
      Class<Integer> class0 = Integer.class;
      Type type2 = Type.getType(class0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type2, linkedList0, false);
      BasicValue basicValue2 = (BasicValue)simpleVerifier0.merge(basicValue0, basicValue1);
      assertTrue(basicValue2.isReference());
      assertNotSame(basicValue2, basicValue0);
      assertNotSame(basicValue2, basicValue1);
      assertFalse(basicValue2.equals((Object)basicValue1));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Type type0 = Type.getObjectType("[DH|Bs^]B6|,'+D");
      BasicValue basicValue0 = new BasicValue(type0);
      Type type1 = Type.getType("[DH|Bs^]B6|,'+D");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type1, true);
      Class<String> class0 = String.class;
      Type type2 = Type.getType(class0);
      BasicValue basicValue1 = new BasicValue(type2);
      BasicValue basicValue2 = (BasicValue)simpleVerifier0.merge(basicValue0, basicValue1);
      assertTrue(basicValue2.isReference());
      assertNotSame(basicValue2, basicValue1);
      assertNotSame(basicValue2, basicValue0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Type type0 = Type.getObjectType("[DHc|Bs^]B6|,'+D");
      BasicValue basicValue0 = new BasicValue(type0);
      Type type1 = Type.getType("[DHc|Bs^]B6|,'+D");
      BasicValue basicValue1 = new BasicValue(type1);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type1, linkedList0, true);
      Value value0 = simpleVerifier0.merge(basicValue0, basicValue1);
      assertSame(value0, basicValue1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = Type.getObjectType("null");
      BasicValue basicValue0 = new BasicValue(type0);
      BasicValue basicValue1 = (BasicValue)BasicValue.REFERENCE_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, false);
      Value value0 = simpleVerifier0.merge(basicValue1, basicValue0);
      assertSame(value0, basicValue1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      Type type1 = Type.getObjectType("null");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type1, true);
      BasicValue basicValue0 = new BasicValue(type1);
      BasicValue basicValue1 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value0 = simpleVerifier0.merge(basicValue0, basicValue1);
      assertSame(value0, basicValue1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Type type0 = Type.SHORT_TYPE;
      BasicValue basicValue1 = new BasicValue(type0);
      BasicValue basicValue2 = (BasicValue)simpleVerifier0.merge(basicValue0, basicValue1);
      assertFalse(basicValue2.isReference());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Class<BasicValue> class0 = BasicValue.class;
      Type type0 = Type.getType(class0);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      BasicValue basicValue1 = new BasicValue(type0);
      BasicValue basicValue2 = (BasicValue)simpleVerifier0.merge(basicValue1, basicValue0);
      assertFalse(basicValue2.isReference());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      BasicValue basicValue1 = (BasicValue)BasicValue.REFERENCE_VALUE;
      Value value0 = simpleVerifier0.merge(basicValue0, basicValue1);
      Value value1 = simpleVerifier0.merge(value0, basicValue0);
      assertEquals(1, value0.getSize());
      assertNotSame(basicValue0, value1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Type type0 = Type.getType("[DHc|Bs^]B6|,'+D");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.newValue(type0);
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.merge(value0, value0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      Type type0 = Type.getObjectType("Lul;");
      Value value0 = simpleVerifier0.newValue(type0);
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, value0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      BasicValue basicValue0 = new BasicValue(type0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
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
  public void test15()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getReturnType("Lnull;");
      BasicValue basicValue0 = new BasicValue(type0);
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      BasicValue basicValue1 = (BasicValue)BasicValue.LONG_VALUE;
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Type type0 = Type.getType("[DHc|Bs^]B6|,'+D");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.newValue(type0);
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
      assertTrue(basicValue0.isReference());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      BasicValue basicValue0 = new BasicValue(type0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      boolean boolean0 = simpleVerifier0.isSubTypeOf(basicValue0, basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
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
  public void test22()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getReturnType("Lnull;");
      BasicValue basicValue0 = new BasicValue(type0);
      Value value0 = simpleVerifier0.getElementValue(basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Type type0 = Type.getReturnType("[B");
      BasicValue basicValue0 = new BasicValue(type0);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.getElementValue(basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
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
  public void test25()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      boolean boolean0 = simpleVerifier0.isArrayValue(basicValue0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getReturnType("Lnull;");
      BasicValue basicValue0 = new BasicValue(type0);
      boolean boolean0 = simpleVerifier0.isArrayValue(basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Type type0 = Type.getType("[B");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      boolean boolean0 = simpleVerifier0.isArrayValue(basicValue0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      boolean boolean0 = simpleVerifier0.isArrayValue(basicValue0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Type type0 = Type.getReturnType("[SAB");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.newValue(type0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getType("[B");
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.newValue(type0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Type type0 = Type.getType("[C");
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.newValue(type0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = Type.getType("[Z");
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.newValue(type0);
      assertTrue(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.newValue((Type) null);
      assertFalse(basicValue0.isReference());
  }
}

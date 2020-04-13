/*

 * Tue Mar 03 14:01:57 GMT 2020
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
import org.mockito.asm.tree.InsnNode;
import org.mockito.asm.tree.IntInsnNode;
import org.mockito.asm.tree.MethodInsnNode;
import org.mockito.asm.tree.TypeInsnNode;
import org.mockito.asm.tree.VarInsnNode;
import org.mockito.asm.tree.analysis.AnalyzerException;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.BasicVerifier;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.SourceValue;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Type type0 = Type.VOID_TYPE;
      BasicVerifier basicVerifier0 = new BasicVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      InsnNode insnNode0 = new InsnNode(43);
      Value value0 = basicVerifier0.copyOperation(insnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(27);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(31, (String) null, (String) null, ")bA,}E5;i&^[");
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      VarInsnNode varInsnNode0 = new VarInsnNode(23, 2);
      try { 
        simpleVerifier0.copyOperation(varInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected F, but found J
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(29);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(48);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(33, "lBt_5>D*gdv=tEir9Y", "Lorg/mockito/asm/tree/analysis/SourceValue;", "lBt_5>D*gdv=tEir9Y");
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(40);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(46, "V", "m/Io4-\"N4ptKM@Q,$f]", "V");
      SourceValue sourceValue0 = new SourceValue(5, fieldInsnNode0);
      SourceValue sourceValue1 = (SourceValue)simpleVerifier0.copyOperation(fieldInsnNode0, sourceValue0);
      assertEquals(5, sourceValue1.size);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(26);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      BasicVerifier basicVerifier0 = new BasicVerifier();
      InsnNode insnNode0 = new InsnNode(44);
      Value value0 = basicVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      BasicValue basicValue0 = new BasicValue(type0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, linkedList0, true);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(35, "Ljava/lang/Number;", "lSyjm", "lSyjm");
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(41, (-2147483645));
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(25, (String) null, (String) null, ")bA,}E5;i&^[");
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      try { 
        simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected an object reference, but found I
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      BasicVerifier basicVerifier0 = new BasicVerifier();
      InsnNode insnNode0 = new InsnNode(36);
      BasicValue basicValue1 = (BasicValue)basicVerifier0.copyOperation(insnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(22);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      try { 
        simpleVerifier0.copyOperation(insnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected J, but found .
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(24);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      try { 
        simpleVerifier0.copyOperation(insnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected D, but found .
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(34);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, (List) null, true);
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(42, (String) null);
      Value value0 = simpleVerifier0.newValue(type0);
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.copyOperation(typeInsnNode0, value0);
      assertFalse(basicValue0.isReference());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(38);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BasicVerifier basicVerifier0 = new BasicVerifier();
      InsnNode insnNode0 = new InsnNode(1);
      BasicValue basicValue0 = (BasicValue)BasicValue.UNINITIALIZED_VALUE;
      // Undeclared exception!
      try { 
        basicVerifier0.unaryOperation(insnNode0, basicValue0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      VarInsnNode varInsnNode0 = new VarInsnNode(30, 2);
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(varInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }
}

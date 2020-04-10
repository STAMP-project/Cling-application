/*

 * Tue Mar 03 14:01:38 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.Type;
import org.mockito.asm.tree.FieldInsnNode;
import org.mockito.asm.tree.InsnNode;
import org.mockito.asm.tree.JumpInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.MethodInsnNode;
import org.mockito.asm.tree.TypeInsnNode;
import org.mockito.asm.tree.analysis.AnalyzerException;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(43, "<F-iQnpJ5<At#B1", "<F-iQnpJ5<At#B1", "<F-iQnpJ5<At#B1");
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(47, "an array reference");
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(typeInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(31, "an array reference");
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      Value value0 = simpleVerifier0.copyOperation(typeInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(23);
      try { 
        simpleVerifier0.copyOperation(insnNode0, (Value) null);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected F, but found null
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(29, "<hFMiQnpJ5<At#B1", "<hFMiQnpJ5<At#B1", "<hFMiQnpJ5<At#B1");
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(48, "n=h|RQS", "n=h|RQS", "WNe,Le!Q~fl@5'O");
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(37, "A^4^=,^1.~e6dGYJWHcv", "A^4^=,^1.~e6dGYJWHcv", "A^4^=,^1.~e6dGYJWHcv");
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(33, "6DfAgy]8I<-bd^", "6DfAgy]8I<-bd^", "6DfAgy]8I<-bd^");
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.REFERENCE_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(40, "&bZg");
      Value value0 = simpleVerifier0.copyOperation(typeInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(46, (LabelNode) null);
      Type type0 = Type.INT_TYPE;
      BasicValue basicValue0 = new BasicValue(type0);
      Value value0 = simpleVerifier0.copyOperation(jumpInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(35, "an array reference");
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      Value value0 = simpleVerifier0.copyOperation(typeInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(41, "<hF-iQnpJ5<At#B1", "<hF-iQnpJ5<At#B1", "<hF-iQnpJ5<At#B1");
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn("org.mockito.asm.Type").when(type0).getClassName();
      doReturn((-1789916856)).when(type0).getSort();
      Type type1 = simpleVerifier0.getSuperClass(type0);
      Value value0 = simpleVerifier0.newValue(type1);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(25, "LLorg/mockito/asm/tree/anxly5is/SimpleVerif?er;", "8Bmzo:~oQ6/", "org.mockito.asm.Type");
      Value value1 = simpleVerifier0.copyOperation(fieldInsnNode0, value0);
      assertSame(value1, value0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(24, "<hF-iQnpJ5<At#B1", "<hF-iQnpJ5<At#B1", "<hF-iQnpJ5<At#B1");
      try { 
        simpleVerifier0.copyOperation(methodInsnNode0, (Value) null);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected D, but found null
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(32);
      Value value0 = simpleVerifier0.copyOperation(insnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(38, "A^4^=,^1.~e6dGYJWHcv", "A^4^=,^1.~e6dGYJWHcv", "A^4^=,^1.~e6dGYJWHcv");
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(28, "6DfAgy]8I<-bd^", "6DfAgy]8I<-bd^", "6DfAgy]8I<-bd^");
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(46, (LabelNode) null);
      Type type0 = Type.INT_TYPE;
      BasicValue basicValue0 = new BasicValue(type0);
      // Undeclared exception!
      try { 
        simpleVerifier0.unaryOperation(jumpInsnNode0, basicValue0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn("org.mockito.asm.Type").when(type0).getClassName();
      doReturn((-1789916859)).when(type0).getSort();
      Type type1 = simpleVerifier0.getSuperClass(type0);
      Value value0 = simpleVerifier0.newValue(type1);
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(30, "Ljava/lang/Object;", "ConstantValue", "org.mockito.asm.Type");
      BasicValue basicValue0 = (BasicValue)simpleVerifier0.copyOperation(methodInsnNode0, value0);
      assertTrue(basicValue0.isReference());
  }
}

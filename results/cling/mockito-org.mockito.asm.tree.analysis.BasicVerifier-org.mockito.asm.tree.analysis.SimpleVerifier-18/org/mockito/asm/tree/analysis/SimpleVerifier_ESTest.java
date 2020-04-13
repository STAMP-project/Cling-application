/*

 * Tue Mar 03 14:01:44 GMT 2020
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
import org.mockito.asm.tree.FieldInsnNode;
import org.mockito.asm.tree.IntInsnNode;
import org.mockito.asm.tree.MethodInsnNode;
import org.mockito.asm.tree.VarInsnNode;
import org.mockito.asm.tree.analysis.AnalyzerException;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(47, "&K", "an object reference", "an object reference");
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(39, 39);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      IntInsnNode intInsnNode0 = new IntInsnNode(117, 10);
      try { 
        simpleVerifier0.unaryOperation(intInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected J, but found I
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(46, 46);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      LinkedList<MethodInsnNode> linkedList0 = new LinkedList<MethodInsnNode>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, linkedList0, false);
      Value value0 = simpleVerifier0.newValue(type0);
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(124, "L}E;", (String) null, (String) null);
      // Undeclared exception!
      try { 
        simpleVerifier0.unaryOperation(methodInsnNode0, value0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(41, "[I", "[I", "");
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(25, 25);
      try { 
        simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected an object reference, but found A
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, false);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(24, "org.mockito.asm.tree.analysis.SmallSet", "Ljava/lang/String;", "Ljava/lang/String;");
      try { 
        simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected D, but found J
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(32, (-1789916861));
      BasicValue basicValue0 = (BasicValue)BasicValue.INT_VALUE;
      Value value0 = simpleVerifier0.copyOperation(varInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(26, 26);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      LinkedList<MethodInsnNode> linkedList0 = new LinkedList<MethodInsnNode>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, linkedList0, true);
      Value value0 = simpleVerifier0.newValue(type0);
      IntInsnNode intInsnNode0 = new IntInsnNode(122, (-1986));
      // Undeclared exception!
      try { 
        simpleVerifier0.unaryOperation(intInsnNode0, value0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.RETURNADDRESS_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(38, 38);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }
}

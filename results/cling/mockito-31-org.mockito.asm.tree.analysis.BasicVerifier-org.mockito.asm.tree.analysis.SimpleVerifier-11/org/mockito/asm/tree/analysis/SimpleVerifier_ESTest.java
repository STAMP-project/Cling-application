/*

 * Tue Mar 03 14:01:23 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Type;
import org.mockito.asm.tree.FieldInsnNode;
import org.mockito.asm.tree.InsnNode;
import org.mockito.asm.tree.IntInsnNode;
import org.mockito.asm.tree.JumpInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.MethodInsnNode;
import org.mockito.asm.tree.analysis.AnalyzerException;
import org.mockito.asm.tree.analysis.BasicValue;
import org.mockito.asm.tree.analysis.SimpleVerifier;
import org.mockito.asm.tree.analysis.SourceValue;
import org.mockito.asm.tree.analysis.Value;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class SimpleVerifier_ESTest extends SimpleVerifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(30, "a ", "a ", "Ljava/lang/Sipn;");
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(43, "3c", "3c", "[J");
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      LabelNode labelNode0 = new LabelNode();
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(47, labelNode0);
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(jumpInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(39, "bU{b~+R#mUGX*", "bU{b~+R#mUGX*", "bU{b~+R#mUGX*");
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(23, "bU{b~R#mUGX*", "bU{b~R#mUGX*", "bU{b~R#mUGX*");
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      try { 
        simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected F, but found D
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(48, "V#AE%c~HT>DeZR", "V#AE%c~HT>DeZR", "V#AE%c~HT>DeZR");
      Value value0 = simpleVerifier0.copyOperation(methodInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(37);
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      SourceValue sourceValue0 = new SourceValue(14, linkedHashSet0);
      SourceValue sourceValue1 = (SourceValue)simpleVerifier0.copyOperation(insnNode0, sourceValue0);
      assertEquals(14, sourceValue1.size);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(33);
      Value value0 = simpleVerifier0.copyOperation(insnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      IntInsnNode intInsnNode0 = new IntInsnNode(46, 1982);
      Value value0 = simpleVerifier0.copyOperation(intInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(25, "3c", "3c", "[J");
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      try { 
        simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected an object reference, but found D
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      InsnNode insnNode0 = new InsnNode(24);
      try { 
        simpleVerifier0.copyOperation(insnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected D, but found F
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      IntInsnNode intInsnNode0 = new IntInsnNode(125, 195);
      // Undeclared exception!
      try { 
        simpleVerifier0.unaryOperation(intInsnNode0, basicValue0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, true);
      Value value0 = simpleVerifier0.newValue(type0);
      IntInsnNode intInsnNode0 = new IntInsnNode(124, 4);
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
  public void test13()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, linkedList0, true);
      Value value0 = simpleVerifier0.newValue(type0);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(40, (String) null, "9N:5K173Y=qP~ay", "KH_e6[O^o]}-xb.l");
      Value value1 = simpleVerifier0.copyOperation(fieldInsnNode0, value0);
      assertEquals(2, value1.getSize());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      MethodInsnNode methodInsnNode0 = new MethodInsnNode(21, "bU{b~R#mUGX*", "bU{b~R#mUGX*", "bU{b~R#mUGX*");
      BasicValue basicValue0 = (BasicValue)BasicValue.DOUBLE_VALUE;
      try { 
        simpleVerifier0.copyOperation(methodInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected I, but found D
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }
}

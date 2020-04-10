/*

 * Tue Mar 03 14:01:17 GMT 2020
 */

package org.mockito.asm.tree.analysis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedHashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.mockito.asm.Type;
import org.mockito.asm.tree.FieldInsnNode;
import org.mockito.asm.tree.JumpInsnNode;
import org.mockito.asm.tree.LabelNode;
import org.mockito.asm.tree.TypeInsnNode;
import org.mockito.asm.tree.VarInsnNode;
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
      LabelNode labelNode0 = new LabelNode();
      JumpInsnNode jumpInsnNode0 = new JumpInsnNode(47, labelNode0);
      Type type0 = Type.FLOAT_TYPE;
      BasicValue basicValue0 = new BasicValue(type0);
      Value value0 = simpleVerifier0.copyOperation(jumpInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(23, ">cloylD", ">cloylD", ">cloylD");
      Type type0 = Type.BYTE_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      try { 
        simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected F, but found B
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(29, 29);
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      Value value0 = simpleVerifier0.copyOperation(varInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(37, (String) null);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      SourceValue sourceValue0 = new SourceValue((-760), linkedHashSet0);
      Value value0 = simpleVerifier0.copyOperation(typeInsnNode0, sourceValue0);
      assertSame(value0, sourceValue0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(40, "");
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      Value value0 = simpleVerifier0.copyOperation(typeInsnNode0, basicValue0);
      assertSame(value0, basicValue0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(46, 2);
      Value value0 = simpleVerifier0.copyOperation(varInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(29, 29);
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      varInsnNode0.setOpcode(26);
      Value value0 = simpleVerifier0.copyOperation(varInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      VarInsnNode varInsnNode0 = new VarInsnNode(44, 44);
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      Value value0 = simpleVerifier0.copyOperation(varInsnNode0, (Value) null);
      assertNull(value0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(36, (String) null);
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      SourceValue sourceValue0 = new SourceValue((-725), linkedHashSet0);
      Value value0 = simpleVerifier0.copyOperation(typeInsnNode0, sourceValue0);
      assertSame(value0, sourceValue0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(24, "xclo7lD", "xclo7lD", "xclo7lD");
      Type type0 = Type.BYTE_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      try { 
        simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
        fail("Expecting exception: AnalyzerException");
      
      } catch(AnalyzerException e) {
         //
         // Expected D, but found B
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(32, "=m? E/G/x");
      BasicValue basicValue1 = (BasicValue)simpleVerifier0.copyOperation(typeInsnNode0, basicValue0);
      assertFalse(basicValue1.isReference());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = (BasicValue)BasicValue.FLOAT_VALUE;
      TypeInsnNode typeInsnNode0 = new TypeInsnNode(38, (String) null);
      Value value0 = simpleVerifier0.copyOperation(typeInsnNode0, basicValue0);
      assertSame(basicValue0, value0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(28, ">cloyl_D", ">cloyl_D", ">cloyl_D");
      Type type0 = Type.BYTE_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      BasicValue basicValue0 = new BasicValue(type0);
      Value value0 = simpleVerifier0.copyOperation(fieldInsnNode0, basicValue0);
      assertEquals(1, value0.getSize());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SimpleVerifier simpleVerifier0 = new SimpleVerifier();
      VarInsnNode varInsnNode0 = new VarInsnNode(29, 29);
      BasicValue basicValue0 = (BasicValue)BasicValue.LONG_VALUE;
      // Undeclared exception!
      try { 
        simpleVerifier0.unaryOperation(varInsnNode0, basicValue0);
        fail("Expecting exception: Error");
      
      } catch(Error e) {
         //
         // Internal error.
         //
         verifyException("org.mockito.asm.tree.analysis.BasicVerifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      SimpleVerifier simpleVerifier0 = new SimpleVerifier(type0, type0, false);
      FieldInsnNode fieldInsnNode0 = new FieldInsnNode(27, "LLnull;", "LLnull;", "LLnull;");
      Value value0 = simpleVerifier0.newValue(type0);
      Value value1 = simpleVerifier0.copyOperation(fieldInsnNode0, value0);
      assertSame(value1, value0);
  }
}

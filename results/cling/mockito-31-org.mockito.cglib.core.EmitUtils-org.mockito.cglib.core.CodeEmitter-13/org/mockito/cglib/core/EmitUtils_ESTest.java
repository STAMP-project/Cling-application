/*

 * Tue Mar 03 14:45:29 GMT 2020
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.SequenceInputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.Type;
import org.mockito.cglib.core.Block;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;
import org.mockito.cglib.core.Customizer;
import org.mockito.cglib.core.EmitUtils;
import org.mockito.cglib.core.MethodInfo;
import org.mockito.cglib.core.ObjectSwitchCallback;
import org.mockito.cglib.core.ProcessSwitchCallback;
import org.mockito.cglib.core.Signature;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EmitUtils_ESTest extends EmitUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.INT_TYPE;
      LinkedList<BigInteger> linkedList0 = new LinkedList<BigInteger>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      EmitUtils.hash_code(codeEmitter0, type0, (-1412), (Customizer) null);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      Type type0 = Type.SHORT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, (EmitUtils.ArrayDelimiters) null, customizer0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2375, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.DOUBLE_TYPE;
      codeEmitter0.load_args();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters((String) null, (String) null, "A(}VgbF(BEua");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[9];
      classEmitter0.visit(2375, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = codeEmitter0.getReturnType();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Type type1 = Type.DOUBLE_TYPE;
      EmitUtils.append_string(codeEmitter0, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type1;
      typeArray0[1] = type1;
      typeArray0[2] = type1;
      typeArray0[3] = type1;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = typeArray0[4];
      typeArray0[7] = type1;
      Signature signature0 = new Signature("D+f\"QP[1_", type1, typeArray0);
      // Undeclared exception!
      try { 
        EmitUtils.factory_method(classEmitter0, signature0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[3];
      classEmitter0.visit(2, 252, "/x>oC!:a|}t!", "/x>oC!:a|}t!", "/x>oC!:a|}t!", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.FLOAT_TYPE;
      codeEmitter0.unbox_or_zero(type0);
      Type[] typeArray0 = new Type[3];
      // Undeclared exception!
      try { 
        EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.INT_TYPE;
      EmitUtils.hash_code(codeEmitter0, type0, 2022, (Customizer) null);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = codeEmitter0.getReturnType();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 3, customizer0);
      EmitUtils.push_array(codeEmitter0, stringArray0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.newarray(type0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.push(true);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.push(false);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.FLOAT_TYPE;
      codeEmitter0.unbox_or_zero(type0);
      Type type1 = Type.CHAR_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2375, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.DOUBLE_TYPE;
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      EmitUtils.push_object(codeEmitter0, bigDecimal0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters((String) null, (String) null, "A(}VgbF(BEua");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.getObjectType("long longValue()");
      EmitUtils.hash_code(codeEmitter0, type0, 8, (Customizer) null);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter0, stringArray0, (-1632087581), objectSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style -1632087581
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = codeEmitter0.getReturnType();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 3, customizer0);
      LinkedList<BigInteger> linkedList0 = new LinkedList<BigInteger>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[9];
      stringArray0[1] = "D+f\"QP[1_";
      classEmitter0.visit(2375, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      EmitUtils.push_array(codeEmitter0, stringArray0);
      int[] intArray0 = new int[4];
      intArray0[0] = 156;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        codeEmitter0.process_switch(intArray0, processSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // keys to switch must be sorted ascending
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = codeEmitter0.getReturnType();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 3, customizer0);
      // Undeclared exception!
      try { 
        EmitUtils.add_property(classEmitter0, "7=Yv{rk", type0, "Oq0a/H3 ,;Y2");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field Oq0a/H3 ,;Y2 is not declared in D+f\"QP[1_
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2345, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.INT_TYPE;
      codeEmitter0.unbox(type0);
      EmitUtils.push_array(codeEmitter0, stringArray0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      EmitUtils.wrap_undeclared_throwable(codeEmitter0, block0, (Type[]) null, type0);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.INT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = typeArray0[0];
      typeArray0[6] = type0;
      Signature signature0 = new Signature("'b4{m#chf%Y~MRMv$C", type0, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      assertEquals("'b4{m#chf%Y~MRMv$C", signature0.getName());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Label label0 = codeEmitter0.mark();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter0, type0, label0, customizer0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("D+f\"QP[1_", type0, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      assertEquals("D+f\"QP[1_", signature0.getName());
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.FLOAT_TYPE;
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Label label0 = codeEmitter0.mark();
      EmitUtils.not_equals(codeEmitter0, type0, label0, (Customizer) null);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[8];
      classEmitter0.visit(93, 2433, "+\"Q[1C", "+\"Q[1C", "+\"Q[1C", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.getObjectType("+\"Q[1C");
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Type type1 = Type.DOUBLE_TYPE;
      codeEmitter0.unbox_or_zero(type1);
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.INT_TYPE;
      EmitUtils.hash_code(codeEmitter0, type0, 2022, (Customizer) null);
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = typeArray0[2];
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("'b4{m#chf%Y~MRMv$C", type0, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      assertEquals("'b4{m#chf%Y~MRMv$C", signature0.getName());
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(1, 113, "D+f\"QP[1_", "D+f\"QP[1_", "", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.BYTE_TYPE;
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(1, 113, "D+f\"QP[1_", "D+f\"QP[1_", "", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.BYTE_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      // Undeclared exception!
      try { 
        EmitUtils.add_property(classEmitter0, "D+f\"QP[1_", type0, "D+f\"QP[1_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field D+f\"QP[1_ is not declared in D+f\"QP[1_
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type1 = Type.CHAR_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters((String) null, (String) null, "Lu%{x#RPo{N;6G?K>");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type1, emitUtils_ArrayDelimiters0, customizer0);
      Type[] typeArray0 = new Type[9];
      typeArray0[0] = type0;
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2375, 2344, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      EmitUtils.append_string(codeEmitter0, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      int[] intArray0 = new int[4];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      Label label0 = new Label();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter0, type0, label0, customizer0);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.LONG_TYPE;
      codeEmitter0.box(type0);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(11, 2, "Oq0a/H3 ,;Y2", (String) null, "<init>", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.invoke_constructor_this();
      Type type0 = codeEmitter0.getReturnType();
      EmitUtils.hash_code(codeEmitter0, type0, 217, (Customizer) null);
      assertEquals(0, type0.getSort());
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[9];
      classEmitter0.visit(2375, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Type type0 = Type.DOUBLE_TYPE;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      int[] intArray0 = new int[4];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2375, 2344, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Type type0 = Type.BYTE_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 153, customizer0);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      EmitUtils.hash_code(codeEmitter0, type0, 16777229, (Customizer) null);
      int[] intArray0 = new int[3];
      intArray0[0] = 156;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        codeEmitter0.process_switch(intArray0, processSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // keys to switch must be sorted ascending
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.INT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 126, customizer0);
      int[] intArray0 = new int[5];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2375, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.BYTE_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 153, customizer0);
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      Signature signature0 = new Signature("J", type0, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      assertEquals("J", signature0.getName());
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[9];
      classEmitter0.visit(2375, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = codeEmitter0.getReturnType();
      codeEmitter0.unbox(type0);
      // Undeclared exception!
      try { 
        EmitUtils.load_class(codeEmitter0, type0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot load void type
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2375, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.BYTE_TYPE;
      Type type1 = Type.CHAR_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type1, 116, customizer0);
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type1;
      typeArray0[5] = type1;
      typeArray0[6] = type1;
      typeArray0[7] = type0;
      Signature signature0 = new Signature("J", type1, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      assertEquals("J", signature0.getName());
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[6];
      classEmitter0.visit(2375, 2324, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      EmitUtils.hash_code(codeEmitter0, type0, 158, (Customizer) null);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(1, 113, "D+f\"QP[1_", "D+f\"QP[1_", "", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.BYTE_TYPE;
      EmitUtils.hash_code(codeEmitter0, type0, 155, (Customizer) null);
      EmitUtils.null_constructor(classEmitter0);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.INT_TYPE;
      Block block0 = codeEmitter0.begin_block();
      Label label0 = block0.getStart();
      EmitUtils.not_equals(codeEmitter0, type0, label0, (Customizer) null);
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = typeArray0[1];
      typeArray0[4] = type0;
      typeArray0[5] = typeArray0[4];
      typeArray0[6] = type0;
      Signature signature0 = new Signature("'b4{m#chf%Y~MRMv$C", type0, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      assertEquals("'b4{m#chf%Y~MRMv$C", signature0.getName());
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[9];
      classEmitter0.visit(2375, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      int[] intArray0 = new int[4];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      Type type0 = Type.CHAR_TYPE;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2345, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.INT_TYPE;
      codeEmitter0.unbox(type0);
      EmitUtils.push_object(codeEmitter0, "D+f\"QP[1_");
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[6];
      classEmitter0.visit(2375, 2324, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      EmitUtils.hash_code(codeEmitter0, type0, 116, (Customizer) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      String[] stringArray0 = new String[6];
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter0, stringArray0, 0, objectSwitchCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils$1", e);
      }
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 6, customizer0);
      // Undeclared exception!
      try { 
        codeEmitter0.load_this();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no 'this' pointer within static method
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 6, customizer0);
      int[] intArray0 = new int[6];
      intArray0[0] = 149;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        codeEmitter0.process_switch(intArray0, processSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // keys to switch must be sorted ascending
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2375, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.FLOAT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 153, customizer0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = typeArray0[1];
      Signature signature0 = new Signature("Q!=)/s0g{dDT2+k", type0, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      assertEquals("Q!=)/s0g{dDT2+k", signature0.getName());
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("FE N", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-715827882), signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      LinkedList<BigInteger> linkedList0 = new LinkedList<BigInteger>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type1 = Type.LONG_TYPE;
      EmitUtils.hash_code(codeEmitter0, type1, 10, (Customizer) null);
      String[] stringArray1 = new String[3];
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      // Undeclared exception!
      try { 
        EmitUtils.add_properties(classEmitter0, stringArray1, typeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter$FieldInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      // Undeclared exception!
      try { 
        codeEmitter0.load_args(100, (-140));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 7, customizer0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "+\"Q,[1C", "+\"Q,[1C", "+\"Q,[1C", stringArray0);
      Type type0 = Type.getObjectType("+\"Q,[1C");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      EmitUtils.hash_code(codeEmitter0, type0, 2, (Customizer) null);
      EmitUtils.null_constructor(classEmitter0);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[6];
      classEmitter0.visit(2375, 2324, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      codeEmitter0.unbox_or_zero(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2375, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      Type type0 = Type.VOID_TYPE;
      EmitUtils.hash_code(codeEmitter0, type0, 1968, (Customizer) null);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "+\"Q,[1C", "+\"Q,[1C", "+\"Q,[1C", stringArray0);
      Type type0 = Type.getObjectType("+\"Q,[1C");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter0, stringArray0, 100, objectSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 100
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("FE N", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-715827882), signature0, typeArray0);
      codeEmitter1.end_method();
      LinkedList<BigInteger> linkedList0 = new LinkedList<BigInteger>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.getType("D+f\"QP[1_");
      codeEmitter0.unbox_or_zero(type0);
      EmitUtils.load_class_this(codeEmitter0);
      EmitUtils.load_class_this(codeEmitter0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.BYTE_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 6, customizer0);
      Type[] typeArray0 = new Type[9];
      typeArray0[0] = type0;
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[3];
      classEmitter0.visit(2, 252, "/x>oC!:a|}t!", "/x>oC!:a|}t!", "/x>oC!:a|}t!", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.FLOAT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 1, customizer0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      // Undeclared exception!
      try { 
        EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter$FieldInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 113, customizer0);
      // Undeclared exception!
      try { 
        EmitUtils.add_property(classEmitter0, "String", type0, "String");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field String is not declared in D+f\"QP[1_
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.LONG_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 7, customizer0);
      int[] intArray0 = new int[3];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type1 = Type.LONG_TYPE;
      EmitUtils.hash_code(codeEmitter0, type1, 130, (Customizer) null);
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type1;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      Signature signature0 = new Signature("D+f\"QP[1_", type0, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      assertEquals("(LD+f\"QP[1_;LD+f\"QP[1_;LD+f\"QP[1_;LD+f\"QP[1_;JLD+f\"QP[1_;LD+f\"QP[1_;LD+f\"QP[1_;)LD+f\"QP[1_;", signature0.getDescriptor());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      String[] stringArray1 = new String[3];
      stringArray1[0] = "D+f\"QP[1_";
      stringArray1[1] = "D+f\"QP[1_";
      stringArray1[2] = "D+f\"QP[1_";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter0, stringArray1, 2, objectSwitchCallback0);
      EmitUtils.push_object(codeEmitter0, "D+f\"QP[1_");
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[9];
      classEmitter0.visit(2375, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.SHORT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 157, customizer0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[9];
      classEmitter0.visit(2375, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.FLOAT_TYPE;
      codeEmitter0.unbox(type0);
      Type type1 = Type.SHORT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("StringBuffer append(double)", "D+f\"QP[1_", "D+f\"QP[1_");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.FLOAT_TYPE;
      Type type1 = Type.getType("D+f\"QP[1_");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 153, customizer0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type1 = Type.LONG_TYPE;
      EmitUtils.hash_code(codeEmitter0, type0, 16777222, (Customizer) null);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(2, type1.getSize());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.FLOAT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      codeEmitter0.push(153);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("FE N", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-715827882), signature0, typeArray0);
      Type type1 = Type.LONG_TYPE;
      codeEmitter1.unbox_or_zero(type1);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.unbox(type0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.push(0.75);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.FLOAT_TYPE;
      codeEmitter0.super_invoke_constructor();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2375, 2344, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      LinkedList<String> linkedList0 = new LinkedList<String>();
      Type type0 = Type.BYTE_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "+\"Q,[1C", "+\"Q,[1C", "+\"Q,[1C", stringArray0);
      Type type0 = Type.getObjectType("+\"Q,[1C");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Label label0 = codeEmitter0.mark();
      EmitUtils.not_equals(codeEmitter0, type0, label0, (Customizer) null);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("+\"Q,[1C", type0, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      assertEquals("(L+\"Q,[1C;L+\"Q,[1C;L+\"Q,[1C;)L+\"Q,[1C;", signature0.getDescriptor());
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.LONG_TYPE;
      codeEmitter0.create_arg_array();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "+\"Q,[1C", "+\"Q,[1C", "+\"Q,[1C", stringArray0);
      Type type0 = Type.getObjectType("+\"Q,[1C");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.unbox(type0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      EmitUtils.push_array(codeEmitter0, typeArray0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("FE N", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-715827882), signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.unbox(type0);
      EmitUtils.push_array(codeEmitter0, stringArray0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "+\"Q,[1C", "+\"Q,[1C", "+\"Q,[1C", stringArray0);
      Type type0 = Type.getObjectType("+\"Q,[1C");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Label label0 = codeEmitter0.mark();
      EmitUtils.not_equals(codeEmitter0, type0, label0, (Customizer) null);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "D+f\"QP[1_";
      stringArray1[1] = "D+f\"QP[1_";
      stringArray1[2] = "D+f\"QP[1_";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray1, 2, objectSwitchCallback0);
      EmitUtils.load_class_this(codeEmitter1);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.FLOAT_TYPE;
      Type type1 = Type.getType("D+f\"QP[1_");
      codeEmitter0.unbox_or_zero(type1);
      Block block0 = new Block(codeEmitter0);
      // Undeclared exception!
      try { 
        EmitUtils.wrap_undeclared_throwable(codeEmitter0, block0, (Type[]) null, type0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // end of block is unset
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Label label0 = codeEmitter0.mark();
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type0;
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter0, type0, label0, customizer0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.load_args();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(1, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      EmitUtils.append_string(codeEmitter0, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      Signature signature0 = new Signature("D+f\"QP[1_", type0, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      assertEquals("(LD+f\"QP[1_;LD+f\"QP[1_;LD+f\"QP[1_;LD+f\"QP[1_;LD+f\"QP[1_;LD+f\"QP[1_;LD+f\"QP[1_;LD+f\"QP[1_;)LD+f\"QP[1_;", signature0.getDescriptor());
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(1, 113, "D+f\"QP[1_", "D+f\"QP[1_", "", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.CHAR_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      EmitUtils.null_constructor(classEmitter0);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      Type type1 = Type.FLOAT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.CHAR_TYPE;
      codeEmitter0.unbox(type0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      EmitUtils.push_array(codeEmitter0, stringArray0);
      String[] stringArray1 = new String[3];
      stringArray1[0] = "D+f\"QP[1_";
      stringArray1[1] = "D+f\"QP[1_";
      stringArray1[2] = "D+f\"QP[1_";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter0, stringArray1, 2, objectSwitchCallback0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.FLOAT_TYPE;
      codeEmitter0.unbox_or_zero(type0);
      EmitUtils.load_class_this(codeEmitter0);
      EmitUtils.load_class_this(codeEmitter0);
      assertFalse(codeEmitter0.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[9];
      classEmitter0.visit(2375, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = codeEmitter0.getReturnType();
      codeEmitter0.unbox(type0);
      Type type1 = Type.FLOAT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.CHAR_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type0;
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, typeArray0[0], (EmitUtils.ArrayDelimiters) null, customizer0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.FLOAT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 153, customizer0);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Label label0 = codeEmitter0.mark();
      String[] stringArray1 = new String[3];
      stringArray1[0] = "D+f\"QP[1_";
      stringArray1[1] = "D+f\"QP[1_";
      stringArray1[2] = "D+f\"QP[1_";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter0, stringArray1, 2, objectSwitchCallback0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter0, type0, label0, customizer0);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[6];
      classEmitter0.visit(2375, 2324, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      EmitUtils.append_string(codeEmitter0, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "+\"Q,[1C", "+\"Q,[1C", "+\"Q,[1C", stringArray0);
      Type type0 = Type.getObjectType("+\"Q,[1C");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.unbox(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Type type1 = Type.BYTE_TYPE;
      EmitUtils.append_string(codeEmitter0, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2433, "+\"Q[1C", "+\"Q[1C", "+\"Q[1C", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.SHORT_TYPE;
      codeEmitter0.box(type0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[8];
      classEmitter0.visit(93, 2433, "+\"Q[1C", "+\"Q[1C", "+\"Q[1C", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.getObjectType("+\"Q[1C");
      codeEmitter0.box(type0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.FLOAT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 153, customizer0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.getType("D+f\"QP[1_");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 0, customizer0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2345, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.INT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      EmitUtils.null_constructor(classEmitter0);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.CHAR_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 76, customizer0);
      EmitUtils.null_constructor(classEmitter0);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "+\"Q,[1C", "+\"Q,[1C", "+\"Q,[1C", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.push((float) 6);
      Type type0 = Type.INT_TYPE;
      EmitUtils.append_string(codeEmitter0, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 6, customizer0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("D+f\"QP[1_", type0, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      assertEquals("D+f\"QP[1_", signature0.getName());
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[9];
      classEmitter0.visit(2375, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.FLOAT_TYPE;
      codeEmitter0.unbox(type0);
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter0, codeEmitter0.GT);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class java.lang.Integer
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2345, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.INT_TYPE;
      codeEmitter0.unbox(type0);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(pipedInputStream0, pipedInputStream0);
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter0, sequenceInputStream0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class java.io.SequenceInputStream
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Label label0 = codeEmitter0.mark();
      String[] stringArray1 = new String[3];
      stringArray1[0] = "D+f\"QP[1_";
      stringArray1[1] = "D+f\"QP[1_";
      stringArray1[2] = "D+f\"QP[1_";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter0, stringArray1, 2, objectSwitchCallback0);
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter0, label0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class org.mockito.asm.Label
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("D+f\"QP[1_", type0, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Type type1 = Type.BYTE_TYPE;
      EmitUtils.append_string(codeEmitter0, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = classEmitter0.getSuperType();
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Block block0 = codeEmitter0.begin_block();
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.zero_or_null(type1);
      // Undeclared exception!
      try { 
        EmitUtils.wrap_undeclared_throwable(codeEmitter0, block0, (Type[]) null, type0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // end of block is unset
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2375, 2344, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.BYTE_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 153, customizer0);
      int[] intArray0 = new int[8];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2345, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.INT_TYPE;
      EmitUtils.hash_code(codeEmitter0, type0, 93, (Customizer) null);
      codeEmitter0.unbox(type0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "N#$fJnf!BMQ#O {C", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = classEmitter0.getClassType();
      Label label0 = codeEmitter0.mark();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter0, type0, label0, customizer0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "+\"Q,[1C", "+\"Q,[1C", "+\"Q,[1C", stringArray0);
      Type type0 = Type.getObjectType("+\"Q,[1C");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Label label0 = codeEmitter0.mark();
      EmitUtils.not_equals(codeEmitter0, type0, label0, (Customizer) null);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type1 = Type.LONG_TYPE;
      codeEmitter0.unbox(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.SHORT_TYPE;
      EmitUtils.hash_code(codeEmitter0, type0, 142, (Customizer) null);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      MethodInfo methodInfo0 = codeEmitter0.getMethodInfo();
      codeEmitter0.unbox(type0);
      EmitUtils.load_method(codeEmitter0, methodInfo0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[3];
      classEmitter0.visit(2, 252, "/x>oC!:a|}t!", "/x>oC!:a|}t!", "/x>oC!:a|}t!", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.FLOAT_TYPE;
      MethodInfo methodInfo0 = codeEmitter0.getMethodInfo();
      codeEmitter0.unbox_or_zero(type0);
      EmitUtils.load_method(codeEmitter0, methodInfo0);
      assertFalse(codeEmitter0.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1294);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      classEmitter0.visit(1294, 2388, ")Xt#RK", ")Xt#RK", ")Xt#RK", (String[]) null);
      Type type0 = Type.getObjectType("Object");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.unbox(type0);
      BigInteger bigInteger0 = BigInteger.ONE;
      HashMap<BigDecimal, BigInteger> hashMap0 = new HashMap<BigDecimal, BigInteger>();
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      BiFunction<BigInteger, Object, BigInteger> biFunction0 = (BiFunction<BigInteger, Object, BigInteger>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      hashMap0.merge(bigDecimal0, bigInteger0, biFunction0);
      // Undeclared exception!
      try { 
        EmitUtils.getSwitchKeys(hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.math.BigDecimal cannot be cast to java.lang.Integer
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[9];
      classEmitter0.visit(2375, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.SHORT_TYPE;
      codeEmitter0.unbox(type0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type1 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("D+f\"QP[1_", type1, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.INT_TYPE;
      codeEmitter0.create_arg_array();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.create_arg_array();
      Type type0 = Type.DOUBLE_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getReturnType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.unbox(type0);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter0, stringArray0, 155, objectSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 155
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.FLOAT_TYPE;
      codeEmitter0.unbox_or_zero(type0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getReturnType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 6, customizer0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[9];
      stringArray0[1] = "D+f\"QP[1_";
      classEmitter0.visit(2375, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.SHORT_TYPE;
      codeEmitter0.unbox(type0);
      EmitUtils.push_array(codeEmitter0, stringArray0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[8];
      classEmitter0.visit(93, 2433, "+\"Q[1C", "+\"Q[1C", "+\"Q[1C", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.SHORT_TYPE;
      codeEmitter0.unbox(type0);
      Class<Integer> class0 = Integer.TYPE;
      EmitUtils.push_object(codeEmitter0, class0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.FLOAT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 153, customizer0);
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(1, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test133()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[9];
      classEmitter0.visit(2375, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.SHORT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 157, customizer0);
      codeEmitter0.unbox(type0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test134()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 7, customizer0);
      codeEmitter0.unbox(type0);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test135()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("*E`", "*E`", "TSk~`E|XeJ2@;Q");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      int[] intArray0 = new int[5];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test136()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 113, customizer0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      assertEquals("(ZZZ)Z", signature0.getDescriptor());
  }

  @Test(timeout = 4000)
  public void test137()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type1 = Type.SHORT_TYPE;
      EmitUtils.hash_code(codeEmitter0, type1, 156, (Customizer) null);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      assertEquals("(ZZZ)Z", signature0.getDescriptor());
  }

  @Test(timeout = 4000)
  public void test138()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Type type1 = Type.SHORT_TYPE;
      EmitUtils.append_string(codeEmitter0, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      assertEquals("(ZZS)Z", signature0.getDescriptor());
  }

  @Test(timeout = 4000)
  public void test139()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(57);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(57, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Signature signature0 = new Signature("Name '", type0, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test140()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "+\"Q,[1C", "+\"Q,[1C", "+\"Q,[1C", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.LONG_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("+\"Q,[1C", "+\"Q,[1C", "+\"Q,[1C");
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test141()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Type type0 = Type.SHORT_TYPE;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      // Undeclared exception!
      try { 
        EmitUtils.add_property(classEmitter0, "String", type0, "String");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field String is not declared in D+f\"QP[1_
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test142()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      int[] intArray0 = new int[3];
      intArray0[2] = 157;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test143()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 2381, "+\"Q,[1C", "+\"Q,[1C", "+\"Q,[1C", stringArray0);
      Type type0 = Type.getObjectType("+\"Q,[1C");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test144()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2375, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.DOUBLE_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 153, customizer0);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      EmitUtils.push_object(codeEmitter0, bigDecimal0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test145()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.FLOAT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test146()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.getType("D+f\"QP[1_");
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test147()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2375);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[9];
      classEmitter0.visit(2375, 1, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.SHORT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 157, customizer0);
      EmitUtils.null_constructor(classEmitter0);
  }

  @Test(timeout = 4000)
  public void test148()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(77);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(77, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getReturnType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      Type type1 = Type.INT_TYPE;
      EmitUtils.hash_code(codeEmitter0, type1, (-1775), (Customizer) null);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test149()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(93, 1, "=J}_#87M:9h>;", "=J}_#87M:9h>;", "=J}_#87M:9h>;", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      MethodInfo methodInfo0 = codeEmitter0.getMethodInfo();
      codeEmitter0.invoke(methodInfo0);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter0, stringArray0, 156, objectSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 156
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test150()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[8];
      classEmitter0.visit(93, 2433, "+\"Q[1C", "+\"Q[1C", "+\"Q[1C", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      Class<Integer> class0 = Integer.TYPE;
      EmitUtils.push_object(codeEmitter0, class0);
      assertFalse(class0.isAnnotation());
  }

  @Test(timeout = 4000)
  public void test151()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.getObjectType("D+f\"QP[1_");
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Block block0 = codeEmitter0.begin_block();
      codeEmitter0.unbox(type0);
      Type[] typeArray0 = new Type[3];
      // Undeclared exception!
      try { 
        EmitUtils.wrap_undeclared_throwable(codeEmitter0, block0, typeArray0, type0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // end of block is unset
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test152()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test153()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.getType("D+f\"QP[1_");
      codeEmitter0.unbox_or_zero(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test154()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(93);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[1];
      classEmitter0.visit(93, 2381, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      EmitUtils.push_array(codeEmitter0, typeArray0);
      int[] intArray0 = new int[6];
      intArray0[0] = 149;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        codeEmitter0.process_switch(intArray0, processSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // keys to switch must be sorted ascending
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test155()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      Type type0 = Type.FLOAT_TYPE;
      EmitUtils.wrap_undeclared_throwable(codeEmitter0, (Block) null, typeArray0, type0);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test156()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("FE N", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-715827882), signature0, typeArray0);
      codeEmitter1.unbox_or_zero(typeArray0[1]);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test157()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(2393);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[0];
      classEmitter0.visit(2393, 2334, "D+f\"QP[1_", "D+f\"QP[1_", "D+f\"QP[1_", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.FLOAT_TYPE;
      codeEmitter0.unbox_or_zero(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(10, Type.OBJECT);
  }
}

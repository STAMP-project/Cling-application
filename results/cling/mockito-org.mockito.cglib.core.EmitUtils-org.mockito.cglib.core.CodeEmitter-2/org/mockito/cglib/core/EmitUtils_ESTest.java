/*

 * Tue Mar 03 14:40:58 GMT 2020
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.LinkedList;
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
import org.mockito.cglib.core.ObjectSwitchCallback;
import org.mockito.cglib.core.ProcessSwitchCallback;
import org.mockito.cglib.core.Signature;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EmitUtils_ESTest extends EmitUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      Type type1 = Type.getObjectType("=");
      EmitUtils.push_array(codeEmitter1, typeArray0);
      EmitUtils.append_string(codeEmitter1, type1, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      Class<Integer> class0 = Integer.TYPE;
      Type type1 = Type.getType(class0);
      EmitUtils.hash_code(codeEmitter1, type1, 4, (Customizer) null);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      Type type1 = Type.DOUBLE_TYPE;
      codeEmitter1.unbox(type1);
      String[] stringArray0 = new String[6];
      Type[] typeArray1 = new Type[5];
      // Undeclared exception!
      try { 
        EmitUtils.add_properties(classEmitter0, stringArray0, typeArray1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      Type type1 = Type.LONG_TYPE;
      EmitUtils.hash_code(codeEmitter1, type1, 153, (Customizer) null);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertNotSame(type0, type1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type1 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("q", "booleanValue", ")HZ(qW`{@-#O");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertFalse(linkedList0.contains("q"));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("q", "q", "");
      Type type1 = Type.DOUBLE_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      EmitUtils.hash_code(codeEmitter1, type1, 153, (Customizer) null);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("H", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 153, (Customizer) null);
      Type type1 = Type.INT_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertNotSame(type0, type1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      codeEmitter1.push(true);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      codeEmitter1.push(false);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      Type type1 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type1 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      codeEmitter1.unbox(type1);
      // Undeclared exception!
      try { 
        EmitUtils.push_object((CodeEmitter) null, "2Npa^+Bem7mPk");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      BigInteger bigInteger0 = BigInteger.TEN;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      Label label0 = new Label();
      EmitUtils.not_equals(codeEmitter1, type0, label0, (Customizer) null);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("StackMapTable", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("!qXE@{IY;{W|q2", (String) null, "Throwable");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      LinkedList<BigDecimal> linkedList0 = new LinkedList<BigDecimal>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      Label label0 = new Label();
      EmitUtils.not_equals(codeEmitter1, type0, label0, (Customizer) null);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("H", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      codeEmitter1.unbox(type1);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 156, signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      EmitUtils.hash_code(codeEmitter1, type1, (-3904), (Customizer) null);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("F$~8`", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 10, (Customizer) null);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type1 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      EmitUtils.push_object(codeEmitter1, type0);
      codeEmitter1.unbox(type1);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      Type type1 = Type.CHAR_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type1, (-2713), customizer0);
      ClassWriter classWriter0 = new ClassWriter((-2713));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type[] typeArray0 = new Type[0];
      String[] stringArray0 = new String[5];
      classEmitter0.visit(16, 128, "2=_dDDC|m3Q!", "Short", "void setLength(int)", stringArray0);
      Signature signature0 = new Signature("FHv6!3|hnw}_>OUFBq", type0, typeArray0);
      EmitUtils.factory_method(classEmitter0, signature0);
      assertEquals("FHv6!3|hnw}_>OUFBq", signature0.getName());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      int[] intArray0 = new int[8];
      intArray0[0] = 108;
      // Undeclared exception!
      try { 
        codeEmitter1.process_switch(intArray0, (ProcessSwitchCallback) null, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // keys to switch must be sorted ascending
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      codeEmitter1.unbox(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      EmitUtils.push_object(codeEmitter0, bigDecimal0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      CodeEmitter codeEmitter2 = new CodeEmitter(codeEmitter1);
      // Undeclared exception!
      try { 
        codeEmitter2.unbox(type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(100);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("Object[]", type1, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-3324), signature0, typeArray0);
      codeEmitter1.push(0.0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.push_object(codeEmitter1, (Object) null);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      Type type1 = Type.getObjectType("=");
      codeEmitter1.unbox(type1);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter0, (String[]) null, 0, objectSwitchCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("no 'this' pointer within static method", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 5, customizer0);
      // Undeclared exception!
      try { 
        codeEmitter1.load_this();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no 'this' pointer within static method
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      EmitUtils.wrap_undeclared_throwable(codeEmitter0, (Block) null, (Type[]) null, type0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      Type type1 = Type.LONG_TYPE;
      EmitUtils.hash_code(codeEmitter1, type1, 153, (Customizer) null);
      BigDecimal bigDecimal0 = new BigDecimal(815);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type1 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type1, 112, (Customizer) null);
      Object[] objectArray0 = new Object[2];
      EmitUtils.push_array(codeEmitter1, objectArray0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters((String) null, (String) null, "5DbnZhH");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      LinkedList<BigDecimal> linkedList0 = new LinkedList<BigDecimal>();
      // Undeclared exception!
      try { 
        EmitUtils.method_switch(codeEmitter1, linkedList0, (ObjectSwitchCallback) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      int[] intArray0 = new int[8];
      // Undeclared exception!
      try { 
        codeEmitter1.process_switch(intArray0, (ProcessSwitchCallback) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type1 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("no 'this' pointer within static method", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type1, 5, customizer0);
      LinkedList<BigDecimal> linkedList0 = new LinkedList<BigDecimal>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type type1 = Type.SHORT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("H", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      codeEmitter1.unbox(type1);
      assertEquals(4, type1.getSort());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("H", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 153, (Customizer) null);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      // Undeclared exception!
      try { 
        codeEmitter1.push((double) 126);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 156, signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("H", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.push_object(codeEmitter1, type0);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type1 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      codeEmitter1.unbox(type1);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type type1 = Type.SHORT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("H", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      codeEmitter1.unbox(type1);
      EmitUtils.push_object(codeEmitter1, (Object) null);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      Type type1 = Type.VOID_TYPE;
      codeEmitter1.unbox(type0);
      // Undeclared exception!
      try { 
        EmitUtils.load_class(codeEmitter1, type1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot load void type
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      Type type1 = Type.VOID_TYPE;
      EmitUtils.hash_code(codeEmitter1, type1, 8, (Customizer) null);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("q", "q", "");
      Type type1 = Type.DOUBLE_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      BigInteger bigInteger0 = BigInteger.TEN;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      BigInteger bigInteger0 = BigInteger.TEN;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      codeEmitter1.unbox(type0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter1.unbox(type1);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter1, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class java.lang.Object
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("H", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      Type type1 = Type.INT_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      Type type1 = Type.CHAR_TYPE;
      codeEmitter1.unbox(type1);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassEmitter) null).when(codeEmitter0).getClassEmitter();
      doReturn(false).when(codeEmitter0).isStaticHook();
      Type type0 = Type.getObjectType("T)wby?~i82!V4A80");
      // Undeclared exception!
      try { 
        EmitUtils.load_class(codeEmitter0, type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      EmitUtils.getSwitchKeys(hashMap0);
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      // Undeclared exception!
      try { 
        codeEmitter1.unbox(type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      Type type1 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("no 'this' pointer within static method", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("DOrf4lvW%j2", "):@ckjo\fVu wS3&.xy", "n}AKB[(L4]!Zx");
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      LinkedList<BigDecimal> linkedList0 = new LinkedList<BigDecimal>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      codeEmitter1.unbox(type0);
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("q", "q", "");
      Type type1 = Type.DOUBLE_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      codeEmitter1.unbox(type1);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      Type type1 = Type.getObjectType("q");
      codeEmitter1.box(type1);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("H", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 153, (Customizer) null);
      LinkedList<BigDecimal> linkedList0 = new LinkedList<BigDecimal>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      Type type1 = Type.DOUBLE_TYPE;
      LinkedList<BigDecimal> linkedList0 = new LinkedList<BigDecimal>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      EmitUtils.hash_code(codeEmitter1, type1, 153, (Customizer) null);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("no 'this' pointer within static method", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      Type type1 = Type.FLOAT_TYPE;
      Label label0 = new Label();
      codeEmitter1.unbox(type1);
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter1, label0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class org.mockito.asm.Label
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("H", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.push_object(codeEmitter1, (Object) null);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      codeEmitter1.push((float) 124);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("!q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      Type type1 = Type.LONG_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      Object[] objectArray0 = new Object[3];
      objectArray0[0] = (Object) signature0;
      // Undeclared exception!
      try { 
        EmitUtils.push_array(codeEmitter1, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class org.mockito.cglib.core.Signature
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      EmitUtils.push_object(codeEmitter0, bigDecimal0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter2 = new CodeEmitter(codeEmitter1);
      // Undeclared exception!
      try { 
        codeEmitter2.unbox(type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 156, signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      EmitUtils.hash_code(codeEmitter1, type1, (-3904), (Customizer) null);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      Label label0 = codeEmitter1.mark();
      Type type1 = Type.getObjectType("=");
      EmitUtils.not_equals(codeEmitter1, type1, label0, (Customizer) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      Class<Integer> class0 = Integer.class;
      Type type1 = Type.getType(class0);
      Label label0 = new Label();
      EmitUtils.not_equals(codeEmitter1, type1, label0, (Customizer) null);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      EmitUtils.getSwitchKeys(hashMap0);
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      Type type0 = Type.SHORT_TYPE;
      // Undeclared exception!
      try { 
        codeEmitter1.unbox(type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      String[] stringArray0 = new String[8];
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, stringArray0, 10, objectSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 10
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      LinkedList<BigDecimal> linkedList0 = new LinkedList<BigDecimal>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      codeEmitter1.unbox(type0);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.push_object(codeEmitter1, "LqQtwgf6g>Ag0?%hq|KZ;");
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(2252, 2252, 2252).when(type0).getSort();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 49, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter2 = new CodeEmitter(codeEmitter1);
      Type type1 = Type.SHORT_TYPE;
      // Undeclared exception!
      try { 
        codeEmitter2.unbox(type1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      Type type1 = Type.getObjectType("Z");
      EmitUtils.hash_code(codeEmitter1, type1, 154, (Customizer) null);
      codeEmitter1.unbox(type0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      Class<Integer> class0 = Integer.class;
      Type type1 = Type.getType(class0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("x", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 100, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, (-4125), (Customizer) null);
      codeEmitter1.unbox(type0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("q", "q", "");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      BigInteger bigInteger0 = BigInteger.TEN;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      BigDecimal bigDecimal0 = new BigDecimal(815);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      Type type1 = Type.getObjectType("=");
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("x", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 100, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertEquals(116, CodeEmitter.NEG);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      Type type1 = Type.DOUBLE_TYPE;
      BigInteger bigInteger0 = BigInteger.TEN;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      EmitUtils.hash_code(codeEmitter1, type1, 2, (Customizer) null);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("H", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      LinkedList<BigDecimal> linkedList0 = new LinkedList<BigDecimal>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("q", "q", "");
      Type type1 = Type.DOUBLE_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      LinkedList<BigDecimal> linkedList0 = new LinkedList<BigDecimal>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      String[] stringArray0 = new String[0];
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      assertEquals(0, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type1 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 72, signature0, typeArray0);
      codeEmitter1.unbox(type1);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("H", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      codeEmitter1.unbox(type0);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type1 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      codeEmitter1.unbox(type1);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      EmitUtils.wrap_undeclared_throwable(codeEmitter0, block0, typeArray0, typeArray0[0]);
      assertEquals(1, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type1 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 93, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type1, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      Object[] objectArray0 = new Object[2];
      EmitUtils.push_array(codeEmitter1, objectArray0);
      assertEquals(126, CodeEmitter.AND);
  }
}

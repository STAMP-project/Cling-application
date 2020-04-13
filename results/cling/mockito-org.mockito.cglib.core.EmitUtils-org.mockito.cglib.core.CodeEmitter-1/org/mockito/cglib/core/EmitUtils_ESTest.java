/*

 * Tue Mar 03 14:39:44 GMT 2020
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
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
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Type type0 = Type.getObjectType("append");
      EmitUtils.hash_code(codeEmitter0, type0, 100, (Customizer) null);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 96, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      CodeEmitter codeEmitter2 = new CodeEmitter(codeEmitter1);
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter2, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      // Undeclared exception!
      try { 
        codeEmitter1.newarray(type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      // Undeclared exception!
      try { 
        codeEmitter1.invoke_constructor(type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 96, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter2 = new CodeEmitter(codeEmitter1);
      BigDecimal bigDecimal0 = new BigDecimal(116);
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter2, bigDecimal0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      EmitUtils.hash_code(codeEmitter0, type0, 7, (Customizer) null);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      LinkedList<BigInteger> linkedList0 = new LinkedList<BigInteger>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter0, linkedList0, objectSwitchCallback0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Type type0 = Type.FLOAT_TYPE;
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Type) null).when(classEmitter0).getClassType();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(classEmitter0, (ClassEmitter) null).when(codeEmitter0).getClassEmitter();
      doReturn(false).when(codeEmitter0).isStaticHook();
      // Undeclared exception!
      try { 
        EmitUtils.load_class_this(codeEmitter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 108, customizer0);
      assertEquals(1, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter0, (String[]) null, 1175, objectSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 1175
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(type0).getInternalName();
      doReturn((-1101), 0).when(type0).getSort();
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
  public void test12()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      String[] stringArray0 = new String[0];
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter0, stringArray0, 0, objectSwitchCallback0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
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
  public void test14()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      EmitUtils.wrap_undeclared_throwable(codeEmitter0, (Block) null, (Type[]) null, type0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 96, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter2 = new CodeEmitter(codeEmitter1);
      int[] intArray0 = new int[5];
      intArray0[0] = 8;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        codeEmitter2.process_switch(intArray0, processSwitchCallback0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // keys to switch must be sorted ascending
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      Object[] objectArray0 = new Object[7];
      // Undeclared exception!
      try { 
        EmitUtils.push_array(codeEmitter1, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(type0).getSort();
      EmitUtils.load_class(codeEmitter0, type0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 96, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter2 = new CodeEmitter(codeEmitter1);
      BigDecimal bigDecimal0 = new BigDecimal(116);
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter2, bigDecimal0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 6, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.FLOAT_TYPE;
      CodeEmitter codeEmitter2 = new CodeEmitter(codeEmitter1);
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
  public void test20()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      int[] intArray0 = new int[3];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        codeEmitter1.process_switch(intArray0, processSwitchCallback0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch((CodeEmitter) null, stringArray0, 2, objectSwitchCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(label0, label0, label0, label0).when(codeEmitter0).make_label();
      Type type0 = Type.getObjectType("append");
      EmitUtils.not_equals(codeEmitter0, type0, label0, (Customizer) null);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("cannot load void type", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 114, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, typeArray0[1], emitUtils_ArrayDelimiters0, customizer0);
      LinkedList<BigInteger> linkedList0 = new LinkedList<BigInteger>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Type type0 = Type.DOUBLE_TYPE;
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        EmitUtils.push_object((CodeEmitter) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 6, customizer0);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn((-1126)).when(type0).getSort();
      Label label0 = mock(Label.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter0, type0, label0, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter2 = new CodeEmitter(codeEmitter1);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer1 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter2, type1, emitUtils_ArrayDelimiters0, customizer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      // Undeclared exception!
      try { 
        codeEmitter1.box(type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 6, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("cannot load void type", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 114, signature0, typeArray0);
      LinkedList<BigInteger> linkedList0 = new LinkedList<BigInteger>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter2, linkedList0, objectSwitchCallback0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[3];
      EmitUtils.push_array(codeEmitter0, objectArray0);
      assertEquals(3, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 96, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter2 = new CodeEmitter(codeEmitter1);
      Customizer customizer1 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter2, type0, (EmitUtils.ArrayDelimiters) null, customizer1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        EmitUtils.push_array(codeEmitter1, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn((-1126)).when(type0).getSort();
      Label label0 = new Label();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter0, type0, label0, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter2 = new CodeEmitter(codeEmitter1);
      BigInteger bigInteger0 = BigInteger.TEN;
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter2, bigInteger0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("80pC/q.-", "J", "4W/]n!RMNUjPp@~");
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
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
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Type type0 = Type.getObjectType("<init>");
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 96, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
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
  public void test38()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 108, customizer0);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("cannot load void type", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 114, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Type type1 = Type.getObjectType("cannot load void type");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      LinkedList<BigInteger> linkedList0 = new LinkedList<BigInteger>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        EmitUtils.add_properties(classEmitter0, stringArray0, (Type[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      String[] stringArray0 = new String[0];
      EmitUtils.add_properties(classEmitter0, stringArray0, (Type[]) null);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(0).when(type0).getSort();
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("J", "J", "4W/]n!RMNUjPp@~");
      Type type1 = Type.FLOAT_TYPE;
      CodeEmitter codeEmitter2 = new CodeEmitter(codeEmitter1);
      codeEmitter2.unbox(type0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        EmitUtils.push_object((CodeEmitter) null, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class java.lang.Object
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
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
  public void test45()  throws Throwable  {
      Type[] typeArray0 = new Type[2];
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      EmitUtils.wrap_undeclared_throwable(codeEmitter0, block0, typeArray0, type0);
      assertEquals(2, typeArray0.length);
  }
}

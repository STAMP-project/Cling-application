/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 15:44:51 GMT 2019
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
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.Type;
import org.mockito.cglib.core.Block;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;
import org.mockito.cglib.core.Customizer;
import org.mockito.cglib.core.EmitUtils;
import org.mockito.cglib.core.MethodInfo;
import org.mockito.cglib.core.ObjectSwitchCallback;
import org.mockito.cglib.core.ProcessArrayCallback;
import org.mockito.cglib.core.Signature;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class EmitUtils_ESTest extends EmitUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      // Undeclared exception!
      try { 
        EmitUtils.wrap_undeclared_throwable((CodeEmitter) null, (Block) null, (Type[]) null, type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Type[] typeArray0 = new Type[6];
      // Undeclared exception!
      try { 
        EmitUtils.wrap_undeclared_throwable((CodeEmitter) null, (Block) null, typeArray0, typeArray0[2]);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      String[] stringArray0 = new String[1];
      Type[] typeArray0 = new Type[2];
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
  public void test03()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      String[] stringArray0 = new String[0];
      Type[] typeArray0 = new Type[6];
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      assertEquals(6, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 6, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
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
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("p3Number", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 0, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("p3Number", "p3Number", "p3Number");
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("hmoWbZpAuiFINy=9X", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 2, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("oo,s", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 2, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
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
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("p3Number", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 3, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("p3Nu<mber", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 9, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("oolea", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 5, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[5];
      Signature signature0 = new Signature(")", ")");
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 6, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
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
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("p3Number", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 0, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("p3Number", "p3Number", "p3Number");
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      // Undeclared exception!
      try { 
        EmitUtils.append_string((CodeEmitter) null, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      Label label0 = new Label();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.not_equals((CodeEmitter) null, type0, label0, customizer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.hash_code((CodeEmitter) null, type0, 10, customizer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        EmitUtils.push_object((CodeEmitter) null, linkedList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class java.util.LinkedList
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.TEN;
      // Undeclared exception!
      try { 
        EmitUtils.push_object((CodeEmitter) null, bigInteger0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      // Undeclared exception!
      try { 
        EmitUtils.push_object((CodeEmitter) null, bigDecimal0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      // Undeclared exception!
      try { 
        EmitUtils.push_object((CodeEmitter) null, "<init>");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      // Undeclared exception!
      try { 
        EmitUtils.push_object((CodeEmitter) null, (Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("hmoWbZpAuiFINy=9X", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      classEmitter0.setTarget(classEmitter0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 2, signature0, typeArray0);
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter0, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Type type0 = Type.VOID_TYPE;
      // Undeclared exception!
      try { 
        EmitUtils.push_object((CodeEmitter) null, type0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot load void type
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      // Undeclared exception!
      try { 
        EmitUtils.push_object((CodeEmitter) null, type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put(",KLYd", ",KLYd");
      // Undeclared exception!
      try { 
        EmitUtils.getSwitchKeys(hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.lang.Integer
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      int[] intArray0 = EmitUtils.getSwitchKeys(hashMap0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch((CodeEmitter) null, (String[]) null, 137, objectSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 137
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Type[] typeArray0 = new Type[4];
      Signature signature0 = new Signature(")", ")");
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 7, signature0, typeArray0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add((String) null);
      // Undeclared exception!
      try { 
        EmitUtils.constructor_switch(codeEmitter0, linkedList0, (ObjectSwitchCallback) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils$10", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Type type0 = Type.getObjectType("W");
      // Undeclared exception!
      try { 
        EmitUtils.wrap_throwable((Block) null, type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ProcessArrayCallback processArrayCallback0 = mock(ProcessArrayCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.process_arrays((CodeEmitter) null, (Type) null, processArrayCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(1);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Signature signature0 = new Signature("h2", "h2");
      // Undeclared exception!
      try { 
        EmitUtils.factory_method(classEmitter0, signature0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@6
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        EmitUtils.load_class_this((CodeEmitter) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch((CodeEmitter) null, (String[]) null, 0, objectSwitchCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        EmitUtils.begin_method((ClassEmitter) null, (MethodInfo) null, 2526);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        EmitUtils.begin_method(classEmitter0, (MethodInfo) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 494, signature0, typeArray0);
      MethodInfo methodInfo0 = codeEmitter0.getMethodInfo();
      // Undeclared exception!
      try { 
        EmitUtils.load_method((CodeEmitter) null, methodInfo0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        EmitUtils.add_property(classEmitter0, "K` ", type0, "K` ");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@1
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.method_switch((CodeEmitter) null, linkedList0, objectSwitchCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ProcessArrayCallback processArrayCallback0 = mock(ProcessArrayCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.process_array((CodeEmitter) null, (Type) null, processArrayCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        EmitUtils.null_constructor(classEmitter0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@1
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Class<BigDecimal> class0 = BigDecimal.class;
      Type type0 = Type.getType(class0);
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("p3Number", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 0, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Class<BigDecimal> class0 = BigDecimal.class;
      Type type0 = Type.getType(class0);
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("3Nuber", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 0, signature0, typeArray0);
      Label label0 = codeEmitter0.make_label();
      // Undeclared exception!
      try { 
        EmitUtils.not_equals(codeEmitter0, type0, label0, (Customizer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      String[] stringArray0 = new String[18];
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch((CodeEmitter) null, stringArray0, 1, objectSwitchCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
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
}

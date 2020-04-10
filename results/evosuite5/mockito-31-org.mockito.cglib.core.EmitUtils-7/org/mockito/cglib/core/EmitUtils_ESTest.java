/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 21:04:15 GMT 2019
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
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
      // Undeclared exception!
      try { 
        EmitUtils.wrap_undeclared_throwable((CodeEmitter) null, (Block) null, (Type[]) null, (Type) null);
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
      Type[] typeArray0 = new Type[0];
      // Undeclared exception!
      try { 
        EmitUtils.wrap_undeclared_throwable((CodeEmitter) null, (Block) null, typeArray0, (Type) null);
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
      String[] stringArray0 = new String[2];
      Type[] typeArray0 = new Type[2];
      // Undeclared exception!
      try { 
        EmitUtils.add_properties((ClassEmitter) null, stringArray0, typeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      String[] stringArray0 = new String[0];
      Type[] typeArray0 = new Type[8];
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 0, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter0, type0, (EmitUtils.ArrayDelimiters) null, customizer0);
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
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("Pd!o", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 6, signature0, typeArray0);
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
  public void test06()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 0, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter0, type0, (EmitUtils.ArrayDelimiters) null, customizer0);
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
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("F[", type0, typeArray0);
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
  public void test08()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("F[", type0, typeArray0);
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
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("{e", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 5, signature0, typeArray0);
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
      Signature signature0 = new Signature("set", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 6, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("set", "set", "set");
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
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("!JS", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 8, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("!JS", "!JS", "!JS");
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
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("!R=-", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 0, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.append_string(codeEmitter0, type0, (EmitUtils.ArrayDelimiters) null, customizer0);
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
        EmitUtils.not_equals((CodeEmitter) null, type0, (Label) null, (Customizer) null);
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
      Type type0 = Type.INT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.hash_code((CodeEmitter) null, type0, 1, customizer0);
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
  public void test16()  throws Throwable  {
      BigInteger bigInteger0 = BigInteger.ZERO;
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
  public void test17()  throws Throwable  {
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
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
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        EmitUtils.push_object((CodeEmitter) null, ",<dXvFMvg7Ec7*m{h");
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
  public void test20()  throws Throwable  {
      Type type0 = Type.getObjectType("W]");
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("W]", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      classEmitter0.setTarget(classEmitter0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 8, signature0, typeArray0);
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter0, type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
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
  public void test22()  throws Throwable  {
      Class<Integer> class0 = Integer.TYPE;
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
  public void test23()  throws Throwable  {
      HashMap<Type, BigInteger> hashMap0 = new HashMap<Type, BigInteger>();
      Type type0 = Type.FLOAT_TYPE;
      BigInteger bigInteger0 = BigInteger.ONE;
      hashMap0.put(type0, bigInteger0);
      // Undeclared exception!
      try { 
        EmitUtils.getSwitchKeys(hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.mockito.asm.Type cannot be cast to java.lang.Integer
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<Type, BigInteger> hashMap0 = new HashMap<Type, BigInteger>();
      int[] intArray0 = EmitUtils.getSwitchKeys(hashMap0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      // Undeclared exception!
      try { 
        EmitUtils.string_switch((CodeEmitter) null, (String[]) null, 4, (ObjectSwitchCallback) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 4
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        EmitUtils.string_switch((CodeEmitter) null, (String[]) null, 1, (ObjectSwitchCallback) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("!R,", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 0, signature0, typeArray0);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      linkedList0.add((InputStream) null);
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
      Type type0 = Type.BYTE_TYPE;
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
      Type type0 = Type.BYTE_TYPE;
      ProcessArrayCallback processArrayCallback0 = mock(ProcessArrayCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.process_arrays((CodeEmitter) null, type0, processArrayCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Type B is not an array
         //
         verifyException("org.mockito.cglib.core.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        EmitUtils.factory_method(classEmitter0, (Signature) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@1
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
      String[] stringArray0 = new String[0];
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch((CodeEmitter) null, stringArray0, 0, objectSwitchCallback0);
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
      ClassEmitter classEmitter0 = new ClassEmitter();
      // Undeclared exception!
      try { 
        EmitUtils.begin_method(classEmitter0, (MethodInfo) null, (-1602));
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
      // Undeclared exception!
      try { 
        EmitUtils.load_method((CodeEmitter) null, (MethodInfo) null);
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
      ClassWriter classWriter0 = new ClassWriter(1360);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      // Undeclared exception!
      try { 
        EmitUtils.add_property(classEmitter0, "", (Type) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.asm.Type", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
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
      Type type0 = Type.getObjectType("[{3");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.hash_code((CodeEmitter) null, type0, (-4567), customizer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      // Undeclared exception!
      try { 
        EmitUtils.process_array((CodeEmitter) null, type0, (ProcessArrayCallback) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Type D is not an array
         //
         verifyException("org.mockito.cglib.core.TypeUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
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
  public void test41()  throws Throwable  {
      Type type0 = Type.getObjectType("{e");
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("{e", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 5, signature0, typeArray0);
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
  public void test42()  throws Throwable  {
      Type type0 = Type.getObjectType("I");
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("I", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, 2, signature0, typeArray0);
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
  public void test43()  throws Throwable  {
      String[] stringArray0 = new String[1];
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

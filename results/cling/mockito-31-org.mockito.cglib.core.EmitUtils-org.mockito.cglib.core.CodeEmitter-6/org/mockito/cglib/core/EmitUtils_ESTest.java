/*

 * Tue Mar 03 14:42:18 GMT 2020
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.InputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.ClassAdapter;
import org.mockito.asm.ClassVisitor;
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
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("Hi.+[`pXH]<{#+E_", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      codeEmitter1.load_args();
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("<init>", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 351, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(typeArray0[1]);
      String[] stringArray0 = new String[0];
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      assertEquals(4, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Customizer customizer1 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L698516260", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, typeArray0[0], 153, customizer1);
      Type type1 = Type.DOUBLE_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null, (Label) null, (Label) null).when(codeEmitter0).make_label();
      Class<Type> class0 = Type.class;
      Type type0 = Type.getType(class0);
      EmitUtils.not_equals(codeEmitter0, type0, (Label) null, (Customizer) null);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("<generated>", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1177, signature0, typeArray0);
      codeEmitter1.push(true);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L417706979", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      codeEmitter1.push(false);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("<generated>", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1177, signature0, typeArray0);
      codeEmitter1.box(type0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L255441466", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L1839542978", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      Object[] objectArray0 = new Object[3];
      EmitUtils.push_array(codeEmitter1, objectArray0);
      assertEquals(116, CodeEmitter.NEG);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.getObjectType("org.mockito.cglib.core.EmitUtils");
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 130, signature0, typeArray0);
      Type type1 = Type.LONG_TYPE;
      codeEmitter1.unbox_or_zero(type1);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, customizer0);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.getObjectType("org.mockito.cglib.core.EmitUtils");
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 130, signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      codeEmitter1.unbox_or_zero(type1);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      Type type1 = Type.VOID_TYPE;
      typeArray0[1] = type1;
      Signature signature0 = new Signature("charValue", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      BigInteger bigInteger0 = BigInteger.ONE;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type1, 7, customizer0);
      assertNotSame(type0, type1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      Type type1 = Type.getObjectType("e'>\"9TH|)==C`c#D");
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.LONG_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type1, 2048, (Customizer) null);
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertNotSame(type0, type1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("`h%npXEO8a:{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 37, signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      EmitUtils.hash_code(codeEmitter1, type1, 4, customizer0);
      BigDecimal bigDecimal0 = new BigDecimal(32);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassEmitter) null).when(codeEmitter0).getClassEmitter();
      doReturn(false).when(codeEmitter0).isStaticHook();
      Type type0 = Type.getObjectType("null");
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
  public void test16()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter0, type0, label0, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 8, signature0, typeArray0);
      codeEmitter2.load_args();
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.getObjectType("org.mockito.cglib.core.EmitUtils");
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 130, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      BigInteger bigInteger0 = BigInteger.ONE;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.LONG_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      EmitUtils.hash_code(codeEmitter1, type1, 2048, (Customizer) null);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      String[] stringArray0 = new String[5];
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
  public void test20()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L698516260", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      String[] stringArray0 = new String[0];
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, stringArray0, 159, objectSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 159
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L1107634799", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter1, classAdapter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class org.mockito.asm.ClassAdapter
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("XIeOrTtJ", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 170, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 96, customizer0);
      int[] intArray0 = new int[3];
      intArray0[0] = 5;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        codeEmitter1.process_switch(intArray0, processSwitchCallback0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // keys to switch must be sorted ascending
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      codeEmitter1.box(type0);
      Type type1 = Type.FLOAT_TYPE;
      EmitUtils.hash_code(codeEmitter1, type1, 6, customizer0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[4];
      EmitUtils.wrap_undeclared_throwable(codeEmitter0, block0, typeArray0, typeArray0[3]);
      assertEquals(4, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      EmitUtils.wrap_undeclared_throwable(codeEmitter0, block0, (Type[]) null, type0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("Hi.+[`pXH]<{#+E_", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 164, signature0, typeArray0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      Type type1 = Type.FLOAT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type1, 100, customizer0);
      assertEquals(1, type1.getSize());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      Type type1 = Type.VOID_TYPE;
      typeArray0[1] = type1;
      Signature signature0 = new Signature("charValue", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      codeEmitter1.box(type1);
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("C", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2837), signature0, typeArray0);
      codeEmitter1.push((long) 1);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      codeEmitter1.visitMaxs((-444), 156);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      Type type1 = Type.FLOAT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Type type1 = Type.BYTE_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.getObjectType("org.mockito.cglib.core.EmitUtils");
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 130, signature0, typeArray0);
      Type type1 = Type.DOUBLE_TYPE;
      codeEmitter1.unbox_or_zero(type1);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type1, (EmitUtils.ArrayDelimiters) null, customizer0);
      assertNotSame(type0, type1);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      Type type1 = Type.BOOLEAN_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.LONG_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type1, 2048, (Customizer) null);
      codeEmitter1.load_args();
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("Hi.+[`pXH]<{#+E_", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      codeEmitter1.push((long) 157);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("L1010631110", "Hi.+[`pXH]<{#+E_", "L1010631110");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("Hi.+[`pXH]<{#+E_", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 164, signature0, typeArray0);
      codeEmitter1.push(1547L);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 2048, (Customizer) null);
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("XIeOrTtJ", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 1879048192, (Customizer) null);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 972, customizer0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, typeArray0[0], emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.LONG_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("<init>", type1, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 351, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(typeArray0[2]);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, customizer0);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      // Undeclared exception!
      try { 
        codeEmitter1.push((double) 124);
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
      Type type0 = Type.CHAR_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      codeEmitter1.box(type0);
      Type type1 = Type.FLOAT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("Hi.+[`pXH]<{#+E_", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Type type1 = Type.BYTE_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L540385436", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(type0).getSize();
      doReturn(104, 153, 158).when(type0).getSort();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.LONG_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type1;
      typeArray0[4] = type0;
      typeArray0[5] = type1;
      Signature signature0 = new Signature("x^,r+.", type1, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 999, signature0, typeArray0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      EmitUtils.hash_code(codeEmitter1, type0, (-2828), (Customizer) null);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("<generated>", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1177, signature0, typeArray0);
      codeEmitter1.box(type0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L1107634799", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      codeEmitter1.box(type0);
      EmitUtils.hash_code(codeEmitter1, type0, 0, customizer0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.LONG_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter0, type0, label0, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 8, signature0, typeArray0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter2, linkedList0, objectSwitchCallback0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L1681420968", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      Type type1 = Type.getObjectType("org.mockito.cglib.core.EmitUtils");
      EmitUtils.not_equals(codeEmitter1, type1, (Label) null, customizer0);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.getObjectType("org.mockito.cglib.core.EmitUtils");
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 130, signature0, typeArray0);
      codeEmitter1.box(type0);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("Hi.+[`pXH]<{#+E_", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 164, signature0, typeArray0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 8, customizer0);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("xt]l8m;V!}k<j", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 157, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.push_object(codeEmitter1, (Object) null);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.LONG_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      codeEmitter1.load_args();
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[9];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      typeArray0[8] = type0;
      Signature signature0 = new Signature("J]{RlWQPR>rOJI", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      String[] stringArray0 = new String[6];
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, stringArray0, 7, objectSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 7
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L2146241906", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Block block0 = new Block(codeEmitter1);
      // Undeclared exception!
      try { 
        EmitUtils.wrap_undeclared_throwable(codeEmitter1, block0, typeArray0, typeArray0[0]);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // end of block is unset
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("Hi.+[`pXH]<{#+E_", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      Type type1 = Type.BYTE_TYPE;
      EmitUtils.hash_code(codeEmitter1, type1, 2, (Customizer) null);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L885125255", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 126, customizer0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "L885125255";
      stringArray0[1] = "String[]";
      stringArray0[2] = "String[]";
      stringArray0[3] = "L885125255";
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, stringArray0, 2, (ObjectSwitchCallback) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils$6", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter0, type0, label0, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 155, signature0, typeArray0);
      codeEmitter2.box(type0);
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L885125255", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      String[] stringArray0 = new String[4];
      stringArray0[0] = "L885125255";
      stringArray0[1] = "String[]";
      stringArray0[2] = "String[]";
      stringArray0[3] = "L885125255";
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, stringArray0, 2, (ObjectSwitchCallback) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils$6", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L1087258324", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      codeEmitter1.box(type0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, customizer0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      Type type1 = Type.DOUBLE_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      codeEmitter1.create_arg_array();
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[9];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = typeArray0[0];
      typeArray0[7] = type0;
      typeArray0[8] = type0;
      Signature signature0 = new Signature("J]{RlWQPR>rOJI", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 70, customizer0);
      codeEmitter1.unbox_or_zero(type0);
      assertEquals(7, type0.getSort());
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L885125255", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.hash_code(codeEmitter1, type0, 126, customizer0);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.getObjectType("org.mockito.cglib.core.EmitUtils");
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 130, signature0, typeArray0);
      Type type1 = Type.CHAR_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 3137, customizer0);
      codeEmitter1.unbox_or_zero(type1);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L916828357", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 126, customizer0);
      codeEmitter1.box(type0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 2048, (Customizer) null);
      codeEmitter1.load_args();
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L1543521948", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      codeEmitter1.load_args();
      EmitUtils.hash_code(codeEmitter1, type0, 0, customizer0);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      codeEmitter1.box(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, typeArray0[0], emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassAdapter classAdapter0 = new ClassAdapter((ClassVisitor) null);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L1839542978", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      codeEmitter1.create_arg_array();
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      codeEmitter1.load_args();
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("<init>", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 351, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L586508294", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 126, customizer0);
      codeEmitter1.box(type0);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("Hi.+[`pXH]<{#+E_", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 164, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 112, (Customizer) null);
      BigInteger bigInteger0 = BigInteger.TEN;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("Hi.+[`pXH]<{#+E_", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 164, signature0, typeArray0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      String[] stringArray0 = new String[2];
      // Undeclared exception!
      try { 
        EmitUtils.add_properties((ClassEmitter) null, stringArray0, (Type[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("L698516260", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Type type1 = Type.DOUBLE_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("XIeOrTtJ", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 170, signature0, typeArray0);
      EmitUtils.push_object(codeEmitter1, type0);
      int[] intArray0 = new int[3];
      intArray0[0] = 5;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        codeEmitter1.process_switch(intArray0, processSwitchCallback0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // keys to switch must be sorted ascending
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[9];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = typeArray0[0];
      typeArray0[7] = type0;
      typeArray0[8] = type0;
      Signature signature0 = new Signature("J]{RlWQPR>rOJI", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, customizer0);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("<init>", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 351, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(typeArray0[0]);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, customizer0);
      assertEquals(1, type0.getSize());
  }
}

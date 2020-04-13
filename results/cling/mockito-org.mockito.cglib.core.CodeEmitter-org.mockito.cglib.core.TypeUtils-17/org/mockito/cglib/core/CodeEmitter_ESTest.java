/*

 * Tue Mar 03 14:44:09 GMT 2020
 */

package org.mockito.cglib.core;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import org.mockito.asm.Label;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.ClassInfo;
import org.mockito.cglib.core.CodeEmitter;
import org.mockito.cglib.core.ProcessSwitchCallback;
import org.mockito.cglib.core.Signature;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CodeEmitter_ESTest extends CodeEmitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      Signature signature0 = new Signature("L", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1255, signature0, typeArray0);
      codeEmitter0.push(true);
      codeEmitter0.push(1.0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.push(false);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v0$|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 8, signature0, typeArray0);
      codeEmitter0.zero_or_null(type0);
      codeEmitter0.push((-1));
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("=", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, (MethodVisitor) null, (-2146186416), signature0, typeArray0);
      Label label0 = new Label();
      // Undeclared exception!
      try { 
        codeEmitter0.if_cmp(type0, 402, label0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Class<String> class0 = String.class;
      Type type1 = Type.getType(class0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("vL$P|jq", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.cast_numeric(type1, type0);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.DOUBLE_TYPE;
      Signature signature0 = new Signature("\"v", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1065, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[2];
      intArray0[0] = 128;
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
  public void test006()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.DOUBLE_TYPE;
      Signature signature0 = new Signature("\"v", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1065, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[2];
      intArray0[1] = 128;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", typeArray0[1], typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      Label label0 = new Label();
      codeEmitter0.if_cmp(type0, 5, label0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("\"v", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1065, signature0, typeArray0);
      Label label0 = new Label();
      codeEmitter0.if_cmp(type0, 156, label0);
      assertEquals(116, CodeEmitter.NEG);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.DOUBLE_TYPE;
      Signature signature0 = new Signature("\"v", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1108, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      Type type1 = Type.CHAR_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type type1 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type1;
      Signature signature0 = new Signature("\"v", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 19, signature0, typeArray0);
      codeEmitter0.push((-0.019480519F));
      codeEmitter0.create_arg_array();
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2099), signature0, typeArray0);
      Type type1 = Type.CHAR_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[3];
      intArray0[0] = 590;
      // Undeclared exception!
      try { 
        codeEmitter0.process_switch(intArray0, (ProcessSwitchCallback) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // keys to switch must be sorted ascending
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2099), signature0, typeArray0);
      Type type1 = Type.CHAR_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[3];
      // Undeclared exception!
      try { 
        codeEmitter0.process_switch(intArray0, (ProcessSwitchCallback) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("\"v", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.push((float) 2);
      codeEmitter0.push((float) 0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("vL$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.zero_or_null(type0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      Type type1 = Type.FLOAT_TYPE;
      codeEmitter0.cast_numeric(type1, type0);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      Label label0 = new Label();
      codeEmitter0.if_icmp(112, label0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.DOUBLE_TYPE;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1065, signature0, typeArray0);
      Type type1 = Type.VOID_TYPE;
      codeEmitter0.unbox_or_zero(type0);
      codeEmitter0.newarray(type1);
      assertEquals(116, CodeEmitter.NEG);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      Type type1 = Type.INT_TYPE;
      typeArray0[1] = type1;
      typeArray0[2] = type1;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("=", typeArray0[5], typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3819, signature0, typeArray0);
      Label label0 = new Label();
      codeEmitter0.if_icmp(6, label0);
      codeEmitter0.create_arg_array();
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push(true);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push(false);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v0$|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 8, signature0, typeArray0);
      codeEmitter0.zero_or_null(type0);
      Type type1 = Type.LONG_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v0$|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((float) 100);
      codeEmitter0.newarray(type0);
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("java/lang/String", typeArray0[0], typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      Type type1 = Type.FLOAT_TYPE;
      codeEmitter0.cast_numeric(type0, type1);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Type type1 = Type.CHAR_TYPE;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      Class<Object> class0 = Object.class;
      Type type2 = Type.getType(class0);
      codeEmitter0.unbox_or_zero(type2);
      codeEmitter0.newarray(type1);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type1 = Type.SHORT_TYPE;
      Type[] typeArray1 = new Type[2];
      typeArray1[0] = type0;
      typeArray1[1] = type0;
      Signature signature0 = new Signature("\"v", type1, typeArray1);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3403, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.newarray(type1);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("n%ka8T^rmvAN:WOnz", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1108, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      codeEmitter0.push((double) 100);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2299), signature0, typeArray0);
      codeEmitter0.push((-1.0F));
      codeEmitter0.newarray(type0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.push(0.0F);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", typeArray0[0], typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      Class<Object> class0 = Object.class;
      Type type1 = Type.getType(class0);
      codeEmitter0.unbox_or_zero(type1);
      codeEmitter0.newarray(typeArray0[0]);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v0$|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 8, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.DOUBLE_TYPE;
      Signature signature0 = new Signature("\"v", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1065, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[2];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertArrayEquals(new int[] {0, 0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      int[] intArray0 = new int[7];
      intArray0[0] = 155;
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
  public void test033()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type type1 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type1;
      Signature signature0 = new Signature("\"v", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.cast_numeric(type1, type0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      Type type1 = Type.VOID_TYPE;
      typeArray0[1] = type1;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("java/lang/String", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Type type1 = Type.CHAR_TYPE;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.cast_numeric(type0, type1);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type type1 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type1;
      Signature signature0 = new Signature("\"v", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 19, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push((double) 6);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.create_arg_array();
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type1;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type1);
      assertNotSame(type1, type0);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("n%ka8T^rmvAN:WOnz", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1108, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      codeEmitter0.unbox_or_zero(type1);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Type type1 = Type.CHAR_TYPE;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.cast_numeric(typeArray0[0], type1);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      Type type1 = Type.FLOAT_TYPE;
      codeEmitter0.cast_numeric(typeArray0[1], type1);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      Type type1 = Type.CHAR_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("\"v", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1065, signature0, typeArray0);
      codeEmitter0.push((double) 100);
      Type type1 = Type.CHAR_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      Type type0 = Type.SHORT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("$?P4jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2299), signature0, typeArray0);
      codeEmitter0.push((-1.0F));
      codeEmitter0.newarray(type0);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", typeArray0[0], typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      Type type1 = Type.FLOAT_TYPE;
      codeEmitter0.cast_numeric(type0, type1);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type0);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("n%ka8T^rmvAN:WOnz", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1108, signature0, typeArray0);
      codeEmitter0.push((float) 1);
      codeEmitter0.create_arg_array();
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Type type1 = Type.CHAR_TYPE;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((-3056.0251F));
      codeEmitter0.newarray(type1);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1065, signature0, typeArray0);
      Type type1 = Type.VOID_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[13];
      intArray0[0] = 9;
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
  public void test050()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      Type type1 = Type.VOID_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[4];
      intArray0[3] = 153;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("vL$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.create_arg_array();
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.push(158.0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      Type type1 = Type.VOID_TYPE;
      codeEmitter0.newarray(type1);
      codeEmitter0.push((-226.95));
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("vL$P|jq", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.cast_numeric(type1, type0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.newarray(type0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      Type type1 = Type.LONG_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("n%ka8T^rmvAN:WOnz", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1108, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      codeEmitter0.create_arg_array();
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2193), signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.create_arg_array();
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      int[] intArray0 = new int[4];
      intArray0[3] = 153;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("\"v", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1065, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[4];
      intArray0[0] = 1065;
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
  public void test061()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.unbox_or_zero(typeArray0[0]);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", typeArray0[1], typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      int[] intArray0 = new int[2];
      intArray0[1] = 154;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      Type type1 = Type.VOID_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type1;
      typeArray0[1] = type1;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2193), signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      codeEmitter0.newarray(type1);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("end of block is unset", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 6, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.push((float) 2);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("vL$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.push((-1.0F));
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[5];
      Type type1 = Type.getObjectType("v$P|jq");
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2299), signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.cast_numeric(typeArray0[3], type1);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      Type type1 = Type.CHAR_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v0$|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 8, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("java.math.BigInteger", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 6, signature0, typeArray0);
      codeEmitter0.push((double) 2);
      codeEmitter0.newarray(type0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type1 = Type.DOUBLE_TYPE;
      Signature signature0 = new Signature("\"v", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1065, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type1);
      codeEmitter0.newarray(type0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.push((float) 6);
      Type type1 = Type.VOID_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("\"v", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.newarray(type0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("vL$P|jq", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1, signature0, typeArray0);
      codeEmitter0.cast_numeric(type1, type0);
      codeEmitter0.create_arg_array();
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      Type type1 = Type.LONG_TYPE;
      codeEmitter0.cast_numeric(type1, type0);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type0, typeArray0);
      ClassEmitter classEmitter1 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      String[] stringArray0 = new String[4];
      // Undeclared exception!
      try { 
        classEmitter1.visit(158, 10, "ET>&c2358/W/GzGOq", "ET>&c2358/W/GzGOq", "ET>&c2358/W/GzGOq", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("\"v", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1065, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        classEmitter0.visit(156, 124, "\"v", "<init>", "e1-vT:p4?q", stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("\"v", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1065, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("\"v", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 6, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[4];
      intArray0[3] = 153;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      int[] intArray0 = new int[7];
      intArray0[0] = 155;
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
  public void test083()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      int[] intArray0 = new int[4];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 725, signature0, typeArray0);
      codeEmitter0.push(100.0F);
      codeEmitter0.push((long) 1);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v0$|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 8, signature0, typeArray0);
      codeEmitter0.push((float) 0);
      codeEmitter0.push(1L);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v0$|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 8, signature0, typeArray0);
      codeEmitter0.push(2.0F);
      codeEmitter0.create_arg_array();
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v0$|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 8, signature0, typeArray0);
      codeEmitter0.push((float) 6);
      codeEmitter0.push((-1));
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v0$|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 8, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v0$|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 8, signature0, typeArray0);
      int[] intArray0 = new int[3];
      Type type1 = Type.LONG_TYPE;
      codeEmitter0.newarray(type1);
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", typeArray0[1], typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push((double) 1);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.zero_or_null(type0);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", typeArray0[0], typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      int[] intArray0 = new int[2];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("end of block is unset", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 6, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.cast_numeric(type1, type0);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.newarray(typeArray0[1]);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((-226.95));
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("ET>&c2358/W/GzGOq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2193), signature0, typeArray0);
      codeEmitter0.push((double) 8);
      codeEmitter0.newarray(type0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v0$|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 8, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      codeEmitter0.newarray(type0);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v0$|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 8, signature0, typeArray0);
      codeEmitter0.push(2.0F);
      codeEmitter0.newarray(type0);
      assertEquals(8, type0.getSort());
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("\"v", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.push((float) 2);
      Type type1 = Type.LONG_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.push((float) 6);
      codeEmitter0.newarray(typeArray0[0]);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("v$P|jq", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.push((float) 6);
      Type type1 = Type.LONG_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type1 = Type.DOUBLE_TYPE;
      Signature signature0 = new Signature("\"v", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1065, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      Type type2 = Type.FLOAT_TYPE;
      codeEmitter0.cast_numeric(type2, type1);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("$2E", type0, typeArray0);
      Type[] typeArray1 = new Type[5];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray1);
      codeEmitter0.create_arg_array();
      Type type1 = Type.FLOAT_TYPE;
      codeEmitter0.cast_numeric(type1, type0);
      assertEquals(0, Type.VOID);
  }
}

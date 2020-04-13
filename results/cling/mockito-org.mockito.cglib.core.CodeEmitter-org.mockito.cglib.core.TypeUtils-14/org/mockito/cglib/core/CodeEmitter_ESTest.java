/*

 * Tue Mar 03 14:44:48 GMT 2020
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
import org.mockito.asm.ClassVisitor;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodVisitor;
import org.mockito.asm.Type;
import org.mockito.cglib.core.ClassEmitter;
import org.mockito.cglib.core.CodeEmitter;
import org.mockito.cglib.core.ProcessSwitchCallback;
import org.mockito.cglib.core.Signature;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class CodeEmitter_ESTest extends CodeEmitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test000()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Class<Object> class0 = Object.class;
      Type type1 = Type.getType(class0);
      typeArray0[2] = type1;
      Signature signature0 = new Signature("LocalVariableTable", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type1);
      codeEmitter0.push((double) 1);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature(")92).o-HK", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.push(true);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.push(false);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("|28\"", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[4];
      intArray0[0] = 5;
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
  public void test004()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[3];
      intArray0[2] = 130;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(3, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.box(type0);
      codeEmitter0.push((float) 2);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[2];
      intArray0[0] = 6;
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
  public void test007()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((double) 9);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Label label0 = new Label();
      Type type1 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("N+]Jv[>;iCj::>Xv", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 87, signature0, typeArray0);
      codeEmitter0.if_icmp(4, label0);
      codeEmitter0.create_arg_array();
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/oidaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((float) 6);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[7];
      // Undeclared exception!
      try { 
        codeEmitter0.process_switch(intArray0, (ProcessSwitchCallback) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      Class<Object> class0 = Object.class;
      Type type1 = Type.getType(class0);
      codeEmitter0.unbox_or_zero(type1);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("y+pet5OU", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2134564121), signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type0);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("C1WS#VM\"9Z'", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      Type type1 = Type.DOUBLE_TYPE;
      codeEmitter0.newarray(type0);
      codeEmitter0.unbox_or_zero(type1);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push(2.0F);
      codeEmitter0.newarray(type0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((float) 96);
      codeEmitter0.newarray(type0);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[8];
      Type type1 = Type.CHAR_TYPE;
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      Signature signature0 = new Signature("tu", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1551, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[4];
      intArray0[0] = 7;
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
  public void test019()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      Type type1 = Type.CHAR_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[0];
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
  public void test020()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[2];
      intArray0[1] = 130;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 154);
      codeEmitter0.not();
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("%/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.push(0.0);
      codeEmitter0.push(1.0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Label label0 = new Label();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.if_cmp(type0, 95, label0);
      codeEmitter0.box(type0);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(4);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      int[] intArray0 = new int[2];
      intArray0[0] = 5;
      intArray0[1] = 7;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      codeEmitter0.push((double) 1);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((double) 0);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push(2774.71625);
      Type type1 = Type.DOUBLE_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(4);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.if_cmp(typeArray0[1], 156, (Label) null);
      assertFalse(codeEmitter0.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 154);
      codeEmitter0.box(type0);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push(1128.8372824359);
      codeEmitter0.box(type0);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = typeArray0[0];
      Signature signature0 = new Signature("LocalVariableTable", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push(true);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = typeArray0[0];
      Signature signature0 = new Signature("LocalVariableTable", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push(false);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      Type type1 = Type.FLOAT_TYPE;
      codeEmitter0.newarray(type1);
      assertFalse(codeEmitter0.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/oidaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      Type type1 = Type.DOUBLE_TYPE;
      codeEmitter0.unbox_or_zero(type1);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("S", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((float) 2);
      codeEmitter0.newarray(type0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[0];
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
  public void test036()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[5];
      intArray0[1] = 100;
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
  public void test037()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("C1WS#VM\"9Z'", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      Class<Object> class0 = Object.class;
      Type type1 = Type.getType(class0);
      codeEmitter0.unbox_or_zero(type1);
      codeEmitter0.newarray(type0);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertFalse(codeEmitter0.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[2];
      intArray0[1] = 104;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("SourceDebugExtension", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1798, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 154);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      Type type1 = Type.DOUBLE_TYPE;
      codeEmitter0.unbox_or_zero(type1);
      codeEmitter0.newarray(type0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push(2.0F);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push(0.6666667F);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/oidaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[4];
      intArray0[3] = 157;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("CGLIB$STATICHOOK", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 157, signature0, typeArray0);
      codeEmitter0.push((float) 154);
      codeEmitter0.create_arg_array();
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      Type type1 = Type.DOUBLE_TYPE;
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      codeEmitter0.newarray(type1);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[3];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      int[] intArray0 = new int[4];
      intArray0[0] = 7;
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
  public void test053()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type0;
      Type type1 = Type.INT_TYPE;
      typeArray0[1] = type1;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      Signature signature0 = new Signature("SourceDebugExtension", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 146, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.box(type0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BOOLEAN_TYPE;
      Type type1 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type1;
      typeArray0[2] = type1;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type1;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("/idaY-BNlsew|", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2624), signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push(0.0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type type1 = Type.getObjectType("|28\"");
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("|28\"", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push(1.0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("&", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 8, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type0);
      assertFalse(codeEmitter0.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("CGLIB$STATICHOOK", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 157, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.newarray(type0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 154);
      codeEmitter0.newarray(type0);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 154);
      codeEmitter0.create_arg_array();
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 8, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.newarray(type0);
      assertEquals(1, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push(0.0);
      codeEmitter0.newarray(type0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/iraY-BNsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push(2.0F);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("CGLIB$STATICHOOK", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 157, signature0, typeArray0);
      codeEmitter0.push((float) 154);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[6];
      intArray0[0] = 156;
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
  public void test067()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(4);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      int[] intArray0 = new int[2];
      intArray0[0] = 5;
      intArray0[1] = 7;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/oidaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      Class<Object> class0 = Object.class;
      Type type1 = Type.getType(class0);
      codeEmitter0.newarray(type0);
      codeEmitter0.unbox_or_zero(type1);
      assertEquals(1, type1.getSize());
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      Type type1 = Type.getObjectType(";9ly.JR");
      Type type2 = Type.SHORT_TYPE;
      codeEmitter0.unbox_or_zero(type2);
      codeEmitter0.cast_numeric(type2, type1);
      assertFalse(type1.equals((Object)type2));
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/iraY-BNsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      Type type1 = Type.BOOLEAN_TYPE;
      codeEmitter0.not();
      codeEmitter0.cast_numeric(type0, type1);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type type1 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("N+]Jv[>;iCj::>Xv", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 87, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type1);
      assertEquals(1, type1.getSize());
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push(2.0F);
      Type type1 = Type.CHAR_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/igHY-2Nlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((float) 96);
      Type type1 = Type.CHAR_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("%/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[2];
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
  public void test075()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("%/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.VOID_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[1];
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.box(type0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push(2774.716252);
      codeEmitter0.push(1.0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("%/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.newarray(type0);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 3);
      codeEmitter0.newarray(type0);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Class<Object> class0 = Object.class;
      Type type0 = Type.getType(class0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.Constants", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 6, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      // Undeclared exception!
      try { 
        classEmitter0.begin_class(8, 10, "y5b5(-;#,.ya_+aV&#\"", type0, typeArray0, "Ljava/lang/Object;");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push(1.0);
      Type type1 = Type.getObjectType(";9ly.JR");
      codeEmitter0.cast_numeric(type0, type1);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.newarray(type0);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 154);
      codeEmitter0.newarray(type0);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      Signature signature0 = new Signature("tu", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1551, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type0);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      int[] intArray0 = new int[3];
      intArray0[2] = 130;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[4];
      intArray0[1] = 156;
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
  public void test089()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      codeEmitter0.push(2.0F);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      int[] intArray0 = new int[2];
      intArray0[1] = 130;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("%/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      Type type1 = Type.getObjectType("SJ+$(k#Jm;^@upLW4}");
      codeEmitter0.newarray(type0);
      codeEmitter0.throw_exception(type1, "fyiN\"q;]h9`9M^QVI");
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("%/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      Type type1 = Type.DOUBLE_TYPE;
      codeEmitter0.unbox_or_zero(type1);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Type type1 = Type.getObjectType("|28\"");
      typeArray0[2] = type0;
      Signature signature0 = new Signature("|28\"", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.cast_numeric(type1, type0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.push((float) 2);
      codeEmitter0.push(1.0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.push((float) 5);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(1, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push(2.0F);
      Type type1 = Type.BOOLEAN_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((float) 158);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type0);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("CGLIB$STATICHOOK", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 157, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      codeEmitter0.create_arg_array();
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("|28\"", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.newarray(type0);
      assertEquals(2, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push(2.0F);
      Type type1 = Type.VOID_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("dUxGU* ksrm$kZ<]9Y", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.push((float) 8);
      codeEmitter0.newarray(type0);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[2];
      intArray0[1] = 157;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 154);
      Type type1 = Type.LONG_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(4);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[2];
      intArray0[0] = 5;
      intArray0[1] = 7;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(116, CodeEmitter.NEG);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[3];
      intArray0[0] = 5;
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
  public void test109()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(4);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      String[] stringArray0 = new String[6];
      classEmitter0.visit(1879048192, 1906, "J", "~6Xu-KUi:#j~T@o'o'F", "keys to switch must be sorted ascending", stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(4);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(typeArray0[0]);
      String[] stringArray0 = new String[6];
      classEmitter0.visit(1879048192, 1906, "J", "~6Xu-KUi:#j~T@o'o'F", "keys to switch must be sorted ascending", stringArray0);
      assertEquals(6, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      Signature signature0 = new Signature("tu", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1551, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      codeEmitter0.newarray(type0);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertArrayEquals(new int[] {0}, intArray0);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.box(type0);
      int[] intArray0 = new int[6];
      intArray0[0] = 156;
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
  public void test115()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("end of block is unset", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 8, signature0, typeArray0);
      codeEmitter0.push(2.0F);
      codeEmitter0.push((long) 1);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(4);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((float) 0);
      codeEmitter0.push(1L);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("S", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((-955.2156F));
      codeEmitter0.create_arg_array();
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      Class<Object> class0 = Object.class;
      Type type1 = Type.getType(class0);
      codeEmitter0.newarray(type0);
      codeEmitter0.unbox_or_zero(type1);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push((float) 2);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.unbox_or_zero(type1);
      codeEmitter0.cast_numeric(type1, type0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.newarray(type0);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 154);
      codeEmitter0.newarray(type0);
      assertFalse(codeEmitter0.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push(1.0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((double) 154);
      codeEmitter0.newarray(type0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("S", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/idaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      Type type1 = Type.DOUBLE_TYPE;
      codeEmitter0.unbox_or_zero(type1);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("keys to switch must be sorted ascending", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((float) 2);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/oidaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((float) 2);
      codeEmitter0.newarray(type0);
      assertEquals(2, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("S", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, typeArray0);
      codeEmitter0.push((-955.2156F));
      codeEmitter0.newarray(type0);
      assertEquals(2, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test132()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("/oidaY-BNlsew|", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.push((float) 100);
      codeEmitter0.newarray(type0);
      assertEquals(158, CodeEmitter.LE);
  }
}

/*

 * Tue Mar 03 14:44:21 GMT 2020
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
import org.mockito.asm.ClassAdapter;
import org.mockito.asm.ClassWriter;
import org.mockito.asm.Label;
import org.mockito.asm.MethodAdapter;
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
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.push(1.0);
      Class<Object> class0 = Object.class;
      Type type1 = Type.getType(class0);
      codeEmitter0.unbox_or_zero(type1);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("void", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, (Type[]) null);
      codeEmitter0.push(1.0);
      codeEmitter0.push(true);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("void", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, (Type[]) null);
      codeEmitter0.push(1.0);
      codeEmitter0.push(false);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 5, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[3];
      intArray0[0] = 2;
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
  public void test004()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.getReturnType("[]");
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        classEmitter0.visit((-198), 1612, "Q|#'89g%#pf:", "C&r#rEZ4c*p})~F8V", (String) null, stringArray0);
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
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rE<DZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[3];
      intArray0[2] = 96;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[6];
      intArray0[1] = 1;
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
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, (Type[]) null);
      codeEmitter0.push(1.0);
      Type type1 = Type.BYTE_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type type1 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("long", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      codeEmitter0.newarray(type1);
      codeEmitter0.push((-0.0037113403F));
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      Class<Object> class0 = Object.class;
      Type type2 = Type.getType(class0);
      codeEmitter0.unbox_or_zero(type2);
      codeEmitter0.newarray(type1);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$2", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push(1.0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[4];
      classEmitter0.visit(1, 1, "StackMapTable", "StackMapTable", "StackMapTable", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      Type type0 = Type.CHAR_TYPE;
      codeEmitter0.newarray(type0);
      Signature signature0 = new Signature("<init>", "");
      // Undeclared exception!
      try { 
        codeEmitter0.invoke_virtual(type0, signature0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Class<Object> class0 = Object.class;
      Type type1 = Type.getType(class0);
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, (Type[]) null);
      codeEmitter0.unbox_or_zero(type1);
      codeEmitter0.newarray(type0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$2", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      Type type1 = Type.getObjectType("[AYK9m(\"");
      codeEmitter0.checkcast(type1);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("m,0]", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, (Type[]) null);
      codeEmitter0.box(type0);
      codeEmitter0.push((float) 6);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.getType("C&r#rEZd4*p})~F8V");
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, (Type[]) null);
      codeEmitter0.unbox_or_zero(type1);
      codeEmitter0.create_arg_array();
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("&Ovn_Ca@3>NlI{>Z|?", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      Type type1 = Type.CHAR_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[9];
      intArray0[0] = 9;
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
  public void test017()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("long", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      Type type1 = Type.CHAR_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[2];
      intArray0[1] = 112;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, (Type[]) null);
      Label label0 = codeEmitter0.mark();
      codeEmitter0.if_cmp(type1, 4, label0);
      codeEmitter0.box(type1);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      Label label0 = codeEmitter0.mark();
      codeEmitter0.if_cmp(type1, 156, label0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("I9~1H+~3jBF", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 127, signature0, typeArray0);
      codeEmitter0.push((double) 0);
      codeEmitter0.newarray(type0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.push(0.0);
      Type type1 = Type.getReturnType("ZIX'$aB");
      codeEmitter0.newarray(type1);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rE<DZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.if_cmp(typeArray0[2], (-1212), (Label) null);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-9), signature0, typeArray0);
      Label label0 = codeEmitter0.mark();
      codeEmitter0.if_cmp(type0, (-2617), label0);
      codeEmitter0.create_arg_array();
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, (Type[]) null);
      codeEmitter0.create_arg_array();
      codeEmitter0.push((double) 6);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("char", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      codeEmitter0.push((double) 9);
      codeEmitter0.create_arg_array();
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 29, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push(true);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("float", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2879), signature0, typeArray0);
      codeEmitter0.push(false);
      codeEmitter0.create_arg_array();
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.push((double) 3);
      codeEmitter0.newarray(type1);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("long", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      codeEmitter0.push(0.0);
      codeEmitter0.newarray(type0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[6];
      intArray0[0] = (-1208);
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[6];
      intArray0[0] = 8;
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
  public void test032()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Class<Object> class0 = Object.class;
      Type type1 = Type.getType(class0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type1);
      Type type2 = Type.CHAR_TYPE;
      codeEmitter0.newarray(type2);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.push(1.0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("long", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      codeEmitter0.push((double) 4);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rE<DZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      Type type1 = Type.INT_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.newarray(type1);
      codeEmitter0.push((float) 130);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      int[] intArray0 = new int[2];
      intArray0[1] = 153;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      codeEmitter0.newarray(type0);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type1);
      codeEmitter0.push(1.0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.getReturnType("[]");
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push((-1067.289F));
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type1;
      typeArray0[5] = type1;
      typeArray0[6] = type1;
      typeArray0[7] = type1;
      Signature signature0 = new Signature("float", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-1997), signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type1);
      codeEmitter0.create_arg_array();
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("q,0]", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, (Type[]) null);
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      codeEmitter0.newarray(type0);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rE<DZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[3];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.push(1.0);
      int[] intArray0 = new int[6];
      intArray0[1] = 1;
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
  public void test044()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      Type type1 = Type.INT_TYPE;
      typeArray0[1] = type1;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.Constants", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      assertFalse(codeEmitter0.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rE<DZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      Type type1 = Type.INT_TYPE;
      codeEmitter0.newarray(type1);
      assertFalse(type1.equals((Object)type0));
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.getType("C&r#rEZd4*p})~F8V");
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, (Type[]) null);
      codeEmitter0.push(1.0);
      codeEmitter0.create_arg_array();
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      Type type1 = Type.CHAR_TYPE;
      typeArray0[1] = type1;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("I", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      codeEmitter0.create_arg_array();
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Class<Object> class0 = Object.class;
      Type type1 = Type.getType(class0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.create_arg_array();
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, (Type[]) null);
      codeEmitter0.create_arg_array();
      Type type1 = Type.getType("C&r#rEZd4*p})~F8V");
      codeEmitter0.newarray(type1);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.push(1.0);
      Type type1 = Type.CHAR_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, (Type[]) null);
      Type type1 = Type.getType("C&r#rEZd4*p})~F8V");
      codeEmitter0.newarray(type1);
      codeEmitter0.push((double) 6);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-9), signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      codeEmitter0.push((double) 3);
      codeEmitter0.newarray(type1);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-9), signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      codeEmitter0.push(0.0);
      codeEmitter0.newarray(type1);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("long", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      codeEmitter0.push((float) 9);
      assertEquals(116, CodeEmitter.NEG);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, (Type[]) null);
      Type type1 = Type.LONG_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[2];
      intArray0[0] = 157;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        codeEmitter0.process_switch(intArray0, processSwitchCallback0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // keys to switch must be sorted ascending
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      int[] intArray0 = new int[2];
      intArray0[1] = 130;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0, true);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Class<Object> class0 = Object.class;
      Type type1 = Type.getType(class0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, (Type[]) null);
      codeEmitter0.unbox_or_zero(type1);
      Type type2 = Type.LONG_TYPE;
      codeEmitter0.newarray(type2);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.push(2.0F);
      Type type1 = Type.CHAR_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, (Type[]) null);
      Type type1 = Type.getType("C&r#rEZd4*p})~F8V");
      codeEmitter0.newarray(type1);
      codeEmitter0.push((-1252.8F));
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.getReturnType("V");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("V", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(1355);
      ClassAdapter classAdapter0 = new ClassAdapter(classWriter0);
      ClassEmitter classEmitter0 = new ClassEmitter(classAdapter0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 6295, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[5];
      intArray0[0] = 6295;
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
  public void test062()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("Label offset position has not been resolved yet", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1518, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0, false);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      int[] intArray0 = new int[2];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0, true);
      Type type1 = Type.VOID_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.push((double) 3);
      assertFalse(codeEmitter0.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("m,0]", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, (Type[]) null);
      int[] intArray0 = new int[20];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      codeEmitter0.newarray(type0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$2", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push(1.0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$2", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.push(0.75);
      codeEmitter0.newarray(type0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(8);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[4];
      classEmitter0.visit(1, 1, "t41r2z*>;", "t41r2z*>;", "t41r2z*>;", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      codeEmitter0.checkcast_this();
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[4];
      classEmitter0.visit(1, 1, "t41r2z*>;", "t41r2z*>;", "t41r2z*>;", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Class<Object> class0 = Object.class;
      Type type0 = Type.getType(class0);
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("W2|FUlA[X", type0, typeArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodAdapter0, 5, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((-1.0));
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type1);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      codeEmitter0.newarray(type0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0, false);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[4];
      classEmitter0.visit(1, 1, "StackMplTable", "StackMplTable", "StackMplTable", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      int[] intArray0 = new int[6];
      intArray0[1] = 1;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      codeEmitter0.newarray(type0);
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
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      Type type1 = Type.FLOAT_TYPE;
      codeEmitter0.unbox_or_zero(type1);
      codeEmitter0.push(2.0F);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      codeEmitter0.push(1.0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.push(1.0);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0, false);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      Type type1 = Type.VOID_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      Type type1 = Type.VOID_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type0);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[4];
      classEmitter0.visit(1, 1, "t41r2z*>;", "t41r2z*>;", "t41r2z*>;", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.begin_static();
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("RuntimeVisibleParameterAnnotations", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      codeEmitter1.create_arg_array();
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.push((float) 130);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("long", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Class<Object> class0 = Object.class;
      Type type1 = Type.getType(class0);
      typeArray0[5] = type1;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      Type type2 = Type.INT_TYPE;
      codeEmitter0.newarray(type2);
      codeEmitter0.checkcast(type1);
      assertFalse(type1.equals((Object)type2));
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("W2|FUlA[X", type0, typeArray0);
      MethodAdapter methodAdapter0 = new MethodAdapter(methodVisitor0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodAdapter0, 5, signature0, typeArray0);
      codeEmitter0.push((-33.6864F));
      codeEmitter0.newarray(type0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, (Type[]) null);
      codeEmitter0.unbox_or_zero(type0);
      Type type1 = Type.getType("C&r#rEZd4*p})~F8V");
      codeEmitter0.newarray(type1);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-9), signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type1);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.getType("C&r#rEZd4*p})~F8V");
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, (Type[]) null);
      codeEmitter0.create_arg_array();
      Type type1 = Type.DOUBLE_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("long", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      Type type1 = Type.INT_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("long", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      codeEmitter0.push((double) 1);
      codeEmitter0.newarray(type0);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("?%1,c{mP<O]w%", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.push((double) 10);
      codeEmitter0.newarray(type0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("char", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      Type type1 = Type.INT_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[6];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertFalse(codeEmitter0.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("m,0]", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2, signature0, (Type[]) null);
      Type type1 = Type.INT_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[8];
      intArray0[0] = 153;
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
  public void test095()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertFalse(codeEmitter0.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      codeEmitter0.newarray(type1);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      String[] stringArray0 = new String[4];
      classEmitter0.visit(1, 1, "StackMplTable", "StackMplTable", "StackMplTable", stringArray0);
      CodeEmitter codeEmitter0 = classEmitter0.getStaticHook();
      int[] intArray0 = new int[6];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      codeEmitter0.newarray(type0);
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1422, signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0, false);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      int[] intArray0 = new int[6];
      intArray0[1] = 1;
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
  public void test100()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push((float) 2);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-9), signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      codeEmitter0.unbox_or_zero(type0);
      codeEmitter0.newarray(type1);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      codeEmitter0.newarray(type0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      int[] intArray0 = new int[2];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      codeEmitter0.newarray(type0);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push((float) 130);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.push(1.0);
      int[] intArray0 = new int[6];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Class<String> class0 = String.class;
      Type type1 = Type.getType(class0);
      Type[] typeArray0 = new Type[9];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type1;
      typeArray0[5] = type1;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      typeArray0[8] = type0;
      Signature signature0 = new Signature("long", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.cast_numeric(typeArray0[5], type0);
      codeEmitter0.create_arg_array();
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rE<DZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.push(1.0);
      Type type1 = Type.INT_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, (Type[]) null);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((double) 6);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("char", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      Type type1 = Type.INT_TYPE;
      codeEmitter0.newarray(type1);
      codeEmitter0.push((double) 9);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.newarray(type0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test111()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.newarray(type1);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rE<DZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      codeEmitter0.newarray(type0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.newarray(type1);
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(8, type0.getSort());
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      codeEmitter0.push(2.0F);
      codeEmitter0.newarray(type1);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("C&r#rEZd4*p})~F8V", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((float) 130);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$24", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 10, signature0, typeArray0);
      codeEmitter0.push((float) 4);
      codeEmitter0.newarray(type0);
      assertEquals(124, CodeEmitter.USHR);
  }
}

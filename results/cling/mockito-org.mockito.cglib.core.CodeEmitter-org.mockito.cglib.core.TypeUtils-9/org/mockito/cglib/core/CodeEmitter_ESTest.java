/*

 * Tue Mar 03 14:44:22 GMT 2020
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
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("nB)r", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 671, signature0, typeArray0);
      codeEmitter0.push(1.0);
      Class<Object> class0 = Object.class;
      Type type1 = Type.getType(class0);
      codeEmitter0.unbox(type1);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.push(true);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      ClassInfo classInfo0 = mock(ClassInfo.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(classInfo0).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn((Type[]) null).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, (Type[]) null);
      codeEmitter0.push(1.0);
      codeEmitter0.push(false);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      Type type0 = Type.FLOAT_TYPE;
      Label label0 = codeEmitter0.mark();
      codeEmitter0.if_cmp(type0, 5, label0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[7];
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(16777242, 8).when(type0).getSort();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[11];
      intArray0[0] = 100;
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
  public void test005()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[2];
      intArray0[1] = 100;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertArrayEquals(new int[] {0, 100}, intArray0);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.box(type0);
      codeEmitter0.push((-10.624233F));
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.FLOAT_TYPE;
      Signature signature0 = new Signature("Q<nJ![D", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 2410, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[4];
      intArray0[0] = 124;
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
  public void test008()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.push((double) 8);
      codeEmitter0.newarray(type0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      Label label0 = codeEmitter0.make_label();
      codeEmitter0.if_icmp(156, label0);
      codeEmitter0.create_arg_array();
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("Q<nJ![D", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.push((double) 0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
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
      Signature signature0 = new Signature("nB)r", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 295, signature0, typeArray0);
      Type type1 = Type.INT_TYPE;
      codeEmitter0.newarray(type1);
      codeEmitter0.push((float) 9);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type1;
      typeArray0[2] = type1;
      typeArray0[3] = type0;
      Signature signature0 = new Signature(";a:._AOx", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[2];
      intArray0[1] = 126;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
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
      Signature signature0 = new Signature("nB)r", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 295, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push((float) 9);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("nB)r", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 671, signature0, typeArray0);
      codeEmitter0.push(1.0);
      Type type1 = Type.VOID_TYPE;
      codeEmitter0.box(type1);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.newarray(type0);
      // Undeclared exception!
      try { 
        codeEmitter0.load_args(1220, 7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push(2.0F);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.SHORT_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.create_arg_array();
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.box(type0);
      codeEmitter0.push(2.0F);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.push(0.0F);
      codeEmitter0.box(type0);
      assertEquals(2, type0.getSort());
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2146250450), signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[3];
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
  public void test021()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[2];
      intArray0[1] = 112;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature(";a:._AOx", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push((double) 137);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.FLOAT_TYPE;
      Signature signature0 = new Signature("Q<nJ![D", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.push((double) 0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type1;
      typeArray0[2] = type1;
      typeArray0[3] = type0;
      Signature signature0 = new Signature(";a:._AOx", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      Label label0 = codeEmitter0.make_label();
      codeEmitter0.if_icmp(10, label0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.FLOAT_TYPE;
      Signature signature0 = new Signature("Q<nJ![D", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-761), signature0, typeArray0);
      Label label0 = codeEmitter0.make_label();
      codeEmitter0.if_icmp(156, label0);
      codeEmitter0.box(type0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      Type type0 = Type.BOOLEAN_TYPE;
      codeEmitter0.newarray(type0);
      codeEmitter0.push(0.0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.LONG_TYPE;
      Signature signature0 = new Signature("Q<nJ![D", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      Label label0 = codeEmitter0.make_label();
      codeEmitter0.if_icmp(600, label0);
      codeEmitter0.box(type0);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[7];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      Label label0 = codeEmitter0.make_label();
      codeEmitter0.if_icmp(156, label0);
      Type type0 = Type.LONG_TYPE;
      codeEmitter0.box(type0);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, typeArray0);
      codeEmitter0.box(type0);
      codeEmitter0.push((double) 6);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 143, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push(true);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push(false);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.FLOAT_TYPE;
      Signature signature0 = new Signature("Q<nJ![D", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.newarray(type0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.LONG_TYPE;
      Signature signature0 = new Signature("Q<nJ![D", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((double) 0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(2, 8).when(type0).getSort();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((-1452.74F));
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2545), signature0, typeArray0);
      Type type0 = Type.FLOAT_TYPE;
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.SHORT_TYPE;
      Signature signature0 = new Signature("^Sn?9$tsqbg^t[?_m", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 95, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[8];
      intArray0[0] = 158;
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
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.SHORT_TYPE;
      Signature signature0 = new Signature("^Sn?9$tsqbg^t[?_m", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 95, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type0);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      // Undeclared exception!
      try { 
        codeEmitter0.load_args(4, 8);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type1;
      typeArray0[2] = type1;
      typeArray0[3] = type0;
      Signature signature0 = new Signature(";a:._AOx", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      codeEmitter0.newarray(type1);
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.SHORT_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push(1.0);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("Q<nJ![D", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.push((double) 124);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.FLOAT_TYPE;
      Signature signature0 = new Signature("Q<nJ![D", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      Type type1 = Type.INT_TYPE;
      codeEmitter0.newarray(type1);
      codeEmitter0.push((double) 0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.FLOAT_TYPE;
      Signature signature0 = new Signature("Q<nJ![D", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((float) 2);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type1;
      typeArray0[2] = type1;
      typeArray0[3] = type0;
      Signature signature0 = new Signature(";a:._AOx", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      codeEmitter0.newarray(type1);
      codeEmitter0.push((float) 3);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      ClassInfo classInfo0 = mock(ClassInfo.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(classInfo0).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn((Type[]) null).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, (Type[]) null);
      Type type0 = Type.LONG_TYPE;
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[3];
      intArray0[2] = 96;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.push((float) 0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.push(0.0F);
      codeEmitter0.aaload(4);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(2, 8).when(type0).getSort();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
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
  public void test050()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[2];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.push(1.0);
      int[] intArray0 = new int[4];
      intArray0[0] = 157;
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
  public void test052()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("nB)r", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 671, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      Type type1 = Type.VOID_TYPE;
      codeEmitter0.box(type1);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
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
      Signature signature0 = new Signature("nB)r", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 295, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      Type type1 = Type.INT_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.box(type0);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      Class<Integer> class0 = Integer.class;
      Type type1 = Type.getType(class0);
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("nB)r", type1, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 671, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.create_arg_array();
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("boolean", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.SHORT_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 553, signature0, typeArray0);
      codeEmitter0.push((double) 553);
      codeEmitter0.newarray(type0);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("nB)r", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 671, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.newarray(type0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.push((double) 0);
      Type type0 = Type.BYTE_TYPE;
      codeEmitter0.newarray(type0);
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.SHORT_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((float) 2);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", type0, typeArray0);
      Type[] typeArray1 = new Type[1];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 6, signature0, typeArray1);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter0.newarray(type1);
      codeEmitter0.push((float) 3);
      assertFalse(codeEmitter0.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      Type type0 = Type.LONG_TYPE;
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[3];
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
  public void test065()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      int[] intArray0 = new int[3];
      intArray0[2] = 130;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0, true);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("nB)r", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 671, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push(2.0F);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[3];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 1, signature0, typeArray0);
      codeEmitter0.push((float) 5);
      codeEmitter0.newarray(type0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[6];
      intArray0[0] = 130;
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
  public void test070()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 143, signature0, typeArray0);
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
  public void test071()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("#B)I", "#B)I");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 143, signature0, (Type[]) null);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[2];
      intArray0[1] = 8;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      ClassInfo classInfo0 = mock(ClassInfo.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(classInfo0).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn((Type[]) null).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, (Type[]) null);
      codeEmitter0.push(1.0);
      codeEmitter0.box(type0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("nB)r", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 671, signature0, typeArray0);
      codeEmitter0.push((double) 124);
      codeEmitter0.push(1.0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(3, 10).when(type0).getSort();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.newarray(type0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(3, 10).when(type0).getSort();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      codeEmitter0.push((double) 6);
      codeEmitter0.newarray(type0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      ClassInfo classInfo0 = mock(ClassInfo.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(classInfo0).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn((Type[]) null).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, (Type[]) null);
      codeEmitter0.push(1.0);
      codeEmitter0.newarray(type0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.push((double) 158);
      Type type0 = Type.BOOLEAN_TYPE;
      codeEmitter0.newarray(type0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2545), signature0, typeArray0);
      Type type0 = Type.LONG_TYPE;
      codeEmitter0.unbox(type0);
      codeEmitter0.newarray(type0);
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      int[] intArray0 = new int[2];
      intArray0[1] = 100;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[6];
      intArray0[1] = 4;
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
  public void test082()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.push((float) 2);
      codeEmitter0.push(0.0F);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      ClassInfo classInfo0 = mock(ClassInfo.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(classInfo0).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn((Type[]) null).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, (Type[]) null);
      codeEmitter0.push(1.0);
      int[] intArray0 = new int[3];
      intArray0[2] = 96;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.SHORT_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type type1 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(3, 10).when(type1).getSort();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      codeEmitter0.newarray(type1);
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type1;
      typeArray0[2] = type1;
      typeArray0[3] = type0;
      Signature signature0 = new Signature(";a:._AOx", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type1);
      assertEquals(1, type1.getSize());
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.BYTE_TYPE;
      Signature signature0 = new Signature("Q<nJ![D", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.push(938.3F);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.push((float) 2);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.SHORT_TYPE;
      Signature signature0 = new Signature("^Sn?9$tsqbg^t[?_m", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 95, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[1];
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
  public void test091()  throws Throwable  {
      ClassInfo classInfo0 = mock(ClassInfo.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(classInfo0).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("booleanValue", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 64, signature0, (Type[]) null);
      codeEmitter0.push((-1582.85F));
      codeEmitter0.newarray(type0);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      Type type0 = Type.INT_TYPE;
      codeEmitter0.newarray(type0);
      codeEmitter0.unbox(type0);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.newarray(type0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.BYTE_TYPE;
      Signature signature0 = new Signature("Q<nJ![D", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      Type type1 = Type.INT_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(2, 8).when(type0).getSort();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.push((double) 8);
      codeEmitter0.newarray(type0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(3, 10).when(type0).getSort();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 9, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((float) 2);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.VOID_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 143, signature0, typeArray0);
      codeEmitter0.push(498.39F);
      codeEmitter0.newarray(type0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("nB)r", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 886, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[2];
      intArray0[1] = 938;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      ClassInfo classInfo0 = mock(ClassInfo.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(classInfo0).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn((Type[]) null).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, (Type[]) null);
      codeEmitter0.push(1.0);
      Type type0 = Type.LONG_TYPE;
      codeEmitter0.newarray(type0);
      assertEquals(2, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2545), signature0, typeArray0);
      codeEmitter0.push(98.392912);
      Type type0 = Type.LONG_TYPE;
      codeEmitter0.newarray(type0);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.FLOAT_TYPE;
      Signature signature0 = new Signature("Q<nJ![D", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      Type type1 = Type.INT_TYPE;
      codeEmitter0.newarray(type1);
      int[] intArray0 = new int[3];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      Type type0 = Type.INT_TYPE;
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[5];
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
  public void test104()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[2];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        classEmitter0.visit(155, 789, "nB)r", (String) null, (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[2];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.unbox_or_zero(type0);
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        classEmitter0.visit(155, 789, "nB)r", (String) null, (String) null, stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2545), signature0, typeArray0);
      Type type0 = Type.FLOAT_TYPE;
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      ClassInfo classInfo0 = mock(ClassInfo.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(classInfo0).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn((Type[]) null).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 3, signature0, (Type[]) null);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[1];
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
  public void test109()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[2];
      intArray0[1] = 100;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertArrayEquals(new int[] {0, 100}, intArray0);
  }

  @Test(timeout = 4000)
  public void test110()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[7];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      int[] intArray0 = new int[11];
      intArray0[0] = 100;
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
  public void test111()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("B)r", "B)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 137, signature0, typeArray0);
      codeEmitter0.push(1L);
      codeEmitter0.push(4424.7964F);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test112()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.LONG_TYPE;
      Signature signature0 = new Signature("Q<nJ![D", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.push(1L);
      codeEmitter0.push(0.0F);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test113()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.unbox(type0);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test114()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2545), signature0, typeArray0);
      Class<Object> class0 = Object.class;
      Type type0 = Type.getType(class0);
      codeEmitter0.unbox(type0);
      Type type1 = Type.BYTE_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test115()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2545), signature0, typeArray0);
      Type type0 = Type.LONG_TYPE;
      int[] intArray0 = new int[0];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.newarray(type0);
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test116()  throws Throwable  {
      ClassInfo classInfo0 = mock(ClassInfo.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(classInfo0).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn((Type[]) null).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, (Type[]) null);
      Type type0 = Type.LONG_TYPE;
      codeEmitter0.newarray(type0);
      int[] intArray0 = new int[3];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test117()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push(2.0F);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test118()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.push((float) 0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test119()  throws Throwable  {
      ClassInfo classInfo0 = mock(ClassInfo.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(classInfo0).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn((Type[]) null).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 4, signature0, (Type[]) null);
      codeEmitter0.push(1.0);
      int[] intArray0 = new int[3];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter0.process_switch(intArray0, processSwitchCallback0);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test120()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.cast_numeric(typeArray0[3], type0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test121()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BOOLEAN_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.create_arg_array();
      codeEmitter0.cast_numeric(typeArray0[3], type0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test122()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.FLOAT_TYPE;
      Signature signature0 = new Signature("Q<nJ![D", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.push(1.0);
      Type type1 = Type.INT_TYPE;
      codeEmitter0.newarray(type1);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test123()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.push(98.392912);
      Type type0 = Type.INT_TYPE;
      codeEmitter0.newarray(type0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test124()  throws Throwable  {
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("nB)r", "nB)r");
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 7, signature0, typeArray0);
      codeEmitter0.push(1.0);
      codeEmitter0.newarray(type0);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test125()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type1;
      typeArray0[2] = type1;
      typeArray0[3] = type0;
      Signature signature0 = new Signature(";a:._AOx", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      codeEmitter0.push((double) 137);
      codeEmitter0.newarray(type1);
      assertEquals(116, CodeEmitter.NEG);
  }

  @Test(timeout = 4000)
  public void test126()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.unbox_or_zero(type0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test127()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.FLOAT_TYPE;
      Signature signature0 = new Signature("Q<nJ![D", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((double) 0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test128()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.DOUBLE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Signature signature0 = new Signature("nB)r", "nB)r");
      Type[] typeArray0 = new Type[4];
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 148, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push(2.0F);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test129()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassInfo) null).when(classEmitter0).getClassInfo();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2561), signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push(2.0F);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test130()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature(";a:._AOx", type0, typeArray0);
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, 0, signature0, typeArray0);
      codeEmitter0.newarray(type0);
      codeEmitter0.push((float) 3);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test131()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      MethodVisitor methodVisitor0 = mock(MethodVisitor.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = mock(Signature.class, new ViolatedAssumptionAnswer());
      doReturn(typeArray0).when(signature0).getArgumentTypes();
      doReturn("nB)r").when(signature0).getDescriptor();
      CodeEmitter codeEmitter0 = new CodeEmitter(classEmitter0, methodVisitor0, (-2545), signature0, typeArray0);
      codeEmitter0.push((-1.0F));
      Type type0 = Type.LONG_TYPE;
      codeEmitter0.newarray(type0);
      assertEquals(1, Type.BOOLEAN);
  }
}

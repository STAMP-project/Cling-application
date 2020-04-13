/*

 * Tue Mar 03 14:42:22 GMT 2020
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
  public void test000()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("intValue", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      Class<Integer> class0 = Integer.TYPE;
      Type type1 = Type.getType(class0);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type1, 7, customizer0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test001()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      String[] stringArray0 = new String[7];
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
  public void test002()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("toString", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1406, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3, signature0, typeArray0);
      Class<Integer> class0 = Integer.TYPE;
      Type type1 = Type.getType(class0);
      EmitUtils.hash_code(codeEmitter1, type0, 4360, (Customizer) null);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      EmitUtils.hash_code(codeEmitter1, type0, 25165824, (Customizer) null);
      assertEquals(5, type0.getSort());
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      codeEmitter1.newarray(type0);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      codeEmitter1.push(true);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky.yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-1291), signature0, typeArray0);
      codeEmitter1.create_arg_array();
      EmitUtils.not_equals(codeEmitter1, type0, (Label) null, (Customizer) null);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky.yPPU%myqoM", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      Type type1 = Type.VOID_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type1, 116, customizer0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      EmitUtils.wrap_undeclared_throwable(codeEmitter0, block0, (Type[]) null, type0);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 4, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter1, type0, (Label) null, customizer0);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
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
  public void test011()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 4, signature0, typeArray0);
      Type type1 = Type.getObjectType("append");
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Class<Object> class0 = Object.class;
      Type type1 = Type.getType(class0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("intValue", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      Class<Integer> class0 = Integer.TYPE;
      Type type1 = Type.getType(class0);
      codeEmitter1.create_arg_array();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type1, 7, customizer0);
      assertNotSame(type1, type0);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 4, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.getType(class0);
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("CJ", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      String[] stringArray0 = new String[2];
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, stringArray0, 96, objectSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 96
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky.yPPU%myqoM", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      codeEmitter1.create_arg_array();
      Type type1 = Type.VOID_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type1, 116, customizer0);
      assertNotSame(type0, type1);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky.yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter1.unbox_or_zero(type1);
      EmitUtils.push_object(codeEmitter1, type0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("$ky+yPPU%myqo{", "$ky+yPPU%myqo{", "charValue");
      codeEmitter1.create_arg_array();
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 128, (Customizer) null);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(116, CodeEmitter.NEG);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky.yPPAU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      int[] intArray0 = new int[6];
      intArray0[0] = 100;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        codeEmitter1.process_switch(intArray0, processSwitchCallback0);
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
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("end of block is unset", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 5, (Customizer) null);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Object[] objectArray0 = new Object[6];
      objectArray0[0] = (Object) codeEmitter1;
      // Undeclared exception!
      try { 
        EmitUtils.push_array(codeEmitter1, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class org.mockito.cglib.core.CodeEmitter
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Object[] objectArray0 = new Object[6];
      EmitUtils.push_array(codeEmitter1, objectArray0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("m3wPVmjP-M22cR", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-178), signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.push_object(codeEmitter1, "m3wPVmjP-M22cR");
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.getType(class0);
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("CJ", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1, signature0, typeArray0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, customizer0);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky.yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("$ky.yPPU%myqo{", "kO3tI\"", "kO3tI\"");
      Type type1 = Type.FLOAT_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 128, (Customizer) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, (String[]) null, 0, objectSwitchCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 0, (Customizer) null);
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
  public void test031()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 4, signature0, typeArray0);
      Type type1 = Type.INT_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[7];
      EmitUtils.wrap_undeclared_throwable(codeEmitter0, block0, typeArray0, typeArray0[1]);
      assertEquals(7, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      Type type1 = Type.LONG_TYPE;
      BigDecimal bigDecimal0 = new BigDecimal((-882.6488212435904));
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      EmitUtils.hash_code(codeEmitter1, type1, 25165824, (Customizer) null);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Block block0 = codeEmitter1.begin_block();
      block0.end();
      // Undeclared exception!
      try { 
        EmitUtils.wrap_undeclared_throwable(codeEmitter1, block0, typeArray0, type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 156, signature0, typeArray0);
      codeEmitter1.end_method();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, (String[]) null, 156, objectSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 156
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("equals", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      codeEmitter1.create_arg_array();
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky.yPPAU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      int[] intArray0 = new int[6];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter1.process_switch(intArray0, processSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("floatValue", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 7, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 1406, customizer0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
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
  public void test039()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      String[] stringArray0 = new String[1];
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
  public void test040()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.hash_code(codeEmitter1, type0, 155, (Customizer) null);
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky.yPPU%myqoM", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      EmitUtils.hash_code(codeEmitter1, type0, 2147483645, (Customizer) null);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.getType(class0);
      Type type1 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type1;
      typeArray0[1] = type1;
      typeArray0[2] = type0;
      typeArray0[3] = type1;
      typeArray0[4] = type0;
      typeArray0[5] = type1;
      typeArray0[6] = type1;
      Signature signature0 = new Signature("", type1, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 535, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type1);
      EmitUtils.hash_code(codeEmitter1, type1, 124, (Customizer) null);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test043()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Class<Integer> class0 = Integer.TYPE;
      Type type1 = Type.getType(class0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3, signature0, typeArray0);
      codeEmitter1.push((double) 116);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("equals", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Type type1 = Type.DOUBLE_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 4, signature0, typeArray0);
      codeEmitter1.create_arg_array();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("0SJ", "append", "append");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Type type1 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type1, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type1);
      EmitUtils.push_object(codeEmitter1, type0);
      assertNotSame(type0, type1);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      String[] stringArray0 = new String[0];
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter0, stringArray0, 2, objectSwitchCallback0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 4, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Object[] objectArray0 = new Object[6];
      EmitUtils.push_array(codeEmitter1, objectArray0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Block block0 = codeEmitter1.begin_block();
      // Undeclared exception!
      try { 
        EmitUtils.wrap_undeclared_throwable(codeEmitter1, block0, (Type[]) null, type0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // end of block is unset
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Block block0 = codeEmitter1.begin_block();
      // Undeclared exception!
      try { 
        EmitUtils.wrap_undeclared_throwable(codeEmitter1, block0, typeArray0, type0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // end of block is unset
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      BigInteger bigInteger0 = BigInteger.ONE;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[4];
      objectArray0[1] = (Object) customizer0;
      // Undeclared exception!
      try { 
        EmitUtils.push_array(codeEmitter1, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class org.mockito.cglib.core.Customizer$MockitoMock$431585463
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky.yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertFalse(linkedList0.contains("$ky.yPPU%myqo{"));
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky.yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, (-3548), signature0, typeArray0);
      codeEmitter2.load_this();
      EmitUtils.not_equals(codeEmitter2, type0, (Label) null, (Customizer) null);
      assertFalse(codeEmitter2.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      ClassEmitter classEmitter1 = new ClassEmitter(classEmitter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter1, codeEmitter0, 4, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Type type1 = Type.getObjectType("append");
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter1, type1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("$ky+yPPU%myqo{", "$ky+yPPU%myqo{", "charValue");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 4, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 126, customizer0);
      BigDecimal bigDecimal0 = new BigDecimal(96);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.getType(class0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 157, signature0, typeArray0);
      Block block0 = codeEmitter1.begin_block();
      Label label0 = block0.getStart();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter1, type0, label0, customizer0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "hashCode";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 1, objectSwitchCallback0);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.getType(class0);
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("CSJ", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3941, signature0, typeArray0);
      codeEmitter1.create_arg_array();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter1, type0, label0, customizer0);
      assertEquals(1, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 4, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("0SJ", "append", "append");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 4, (Customizer) null);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky.yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, (-3548), signature0, typeArray0);
      codeEmitter2.load_this();
      Type type1 = Type.INT_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(116, CodeEmitter.NEG);
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Type type1 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type1, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type1);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      Type type1 = Type.LONG_TYPE;
      codeEmitter1.unbox_or_zero(type1);
      BigDecimal bigDecimal0 = new BigDecimal((-882.6488212435904));
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      BigDecimal bigDecimal0 = new BigDecimal((-882.6488212435904));
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 4, signature0, typeArray0);
      codeEmitter1.create_arg_array();
      Type type1 = Type.INT_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Block block0 = new Block(codeEmitter1);
      // Undeclared exception!
      try { 
        EmitUtils.wrap_undeclared_throwable(codeEmitter1, block0, typeArray0, type0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // end of block is unset
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("end of block is unset", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 5, (Customizer) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Type type1 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type1, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type1);
      EmitUtils.hash_code(codeEmitter1, type0, 128, (Customizer) null);
      assertNotSame(type1, type0);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.getType(class0);
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("CSJ", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3941, signature0, typeArray0);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter1, type0, label0, customizer0);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 4, signature0, typeArray0);
      Type type1 = Type.getObjectType("append");
      EmitUtils.not_equals(codeEmitter1, type1, (Label) null, (Customizer) null);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, (-1576), customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 157, signature0, typeArray0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "hashCode";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter2, stringArray0, 1, objectSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 4, signature0, typeArray0);
      codeEmitter1.create_arg_array();
      Type type1 = Type.getObjectType("append");
      EmitUtils.not_equals(codeEmitter1, type1, (Label) null, (Customizer) null);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 4, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
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
  public void test080()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 4, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, customizer0);
      BigDecimal bigDecimal0 = new BigDecimal(1);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      codeEmitter1.create_arg_array();
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, (String[]) null, 2870, objectSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 2870
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[0];
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Object[] objectArray0 = new Object[4];
      objectArray0[0] = (Object) "short";
      EmitUtils.push_array(codeEmitter1, objectArray0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("floatValue", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter((ClassVisitor) null);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 7, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 1406, customizer0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Class<String> class0 = String.class;
      Type type1 = Type.getType(class0);
      typeArray0[4] = type1;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.hash_code(codeEmitter1, type1, 157, (Customizer) null);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 4, signature0, typeArray0);
      Type type1 = Type.getObjectType("append");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.hash_code(codeEmitter1, type1, 9, customizer0);
      assertEquals(1, type1.getSize());
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("intValue", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Class<Integer> class0 = Integer.TYPE;
      Type type1 = Type.getType(class0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type1, 7, customizer0);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 183, signature0, typeArray0);
      BigDecimal bigDecimal0 = new BigDecimal((-882.6488212435904));
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky.yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, (-3548), signature0, typeArray0);
      codeEmitter2.load_this();
      EmitUtils.append_string(codeEmitter1, typeArray0[0], (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Class<Integer> class0 = Integer.class;
      Type type0 = Type.getType(class0);
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("CSJ", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3941, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      EmitUtils.push_object(codeEmitter1, type0);
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
  public void test093()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 4, (Customizer) null);
      codeEmitter1.create_arg_array();
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      Type[] typeArray0 = new Type[5];
      String[] stringArray0 = new String[0];
      EmitUtils.add_properties((ClassEmitter) null, stringArray0, typeArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("intValue", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      String[] stringArray0 = new String[0];
      EmitUtils.add_properties((ClassEmitter) null, stringArray0, typeArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("$ky+yPPU%myqo{", "Ln!:KPyZFJ", "Ln!:KPyZFJ");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky+yPPU%myqo{", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 157, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "hashCode";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 1, objectSwitchCallback0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("$ky.yPPU%myqoM", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      codeEmitter1.create_arg_array();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("toString", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1406, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      codeEmitter1.create_arg_array();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertFalse(codeEmitter1.isStaticHook());
  }
}

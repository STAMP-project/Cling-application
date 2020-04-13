/*

 * Tue Mar 03 14:43:47 GMT 2020
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
import java.util.Random;
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
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("lksRdx3:i", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-104));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 157, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 157, customizer0);
      int[] intArray0 = new int[6];
      intArray0[5] = 155;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter1.process_switch(intArray0, processSwitchCallback0);
      assertEquals(6, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      Label label0 = codeEmitter1.make_label();
      Type type1 = Type.getObjectType("$cglib_prop_");
      EmitUtils.not_equals(codeEmitter1, type1, label0, customizer0);
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
  public void test02()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Type type0 = Type.DOUBLE_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = mock(EmitUtils.ArrayDelimiters.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("lksRdx3:i", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-104));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 157, signature0, typeArray0);
      Customizer customizer1 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter2, type0, 157, customizer1);
      assertEquals(116, CodeEmitter.NEG);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", "l): HQRRD3q!tNhH1C%");
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      codeEmitter1.push(true);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      codeEmitter1.push(false);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Type type0 = Type.DOUBLE_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = mock(EmitUtils.ArrayDelimiters.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("a/kS-ptOl>=", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(852);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 5, signature0, typeArray0);
      codeEmitter2.box(type0);
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("%~ 1", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1002, signature0, typeArray0);
      EmitUtils.not_equals(codeEmitter1, type0, (Label) null, customizer0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter1.process_switch(intArray0, processSwitchCallback0);
      HashMap<Type, Type> hashMap0 = new HashMap<Type, Type>();
      hashMap0.put(type0, type0);
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
  public void test08()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      Type type1 = Type.VOID_TYPE;
      codeEmitter1.box(type0);
      EmitUtils.hash_code(codeEmitter1, type1, 3568, (Customizer) null);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("%~ 1", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 987, signature0, typeArray0);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      EmitUtils.hash_code(codeEmitter1, type0, (-5118), (Customizer) null);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(label0, label0).when(codeEmitter0).make_label();
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter0, type0, 3, customizer0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("append", type0, typeArray0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 3, signature0, typeArray0);
      int[] intArray0 = new int[6];
      intArray0[1] = 158;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        codeEmitter2.process_switch(intArray0, processSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // keys to switch must be sorted ascending
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("lksRdx3:i", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-104));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 157, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 157, customizer0);
      int[] intArray0 = new int[6];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter1.process_switch(intArray0, processSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      // Undeclared exception!
      try { 
        codeEmitter1.push(1.0F);
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
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("[y>", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 5, signature0, typeArray0);
      codeEmitter1.box(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("%~ 1", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-732), signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      Customizer customizer1 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 2130964543, customizer1);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("tjg;9Z^lw/#j", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8192, signature0, typeArray0);
      codeEmitter1.box(type0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 154, customizer0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("%~ 1", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 987, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", "l): HQRRD3q!tNhH1C%");
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      codeEmitter1.push((double) 0);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("lksRdx3:i", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-104));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 157, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 157, customizer0);
      int[] intArray0 = new int[6];
      intArray0[0] = 1;
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
  public void test19()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("get", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 145, signature0, typeArray0);
      BigDecimal bigDecimal0 = new BigDecimal((long) 116);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      Type type1 = Type.FLOAT_TYPE;
      EmitUtils.hash_code(codeEmitter1, type1, 100, customizer0);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      // Undeclared exception!
      try { 
        codeEmitter1.load_args(2925, 158);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      EmitUtils.wrap_undeclared_throwable(codeEmitter0, block0, (Type[]) null, type0);
      assertEquals(1, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("a/kS-ptOl>=", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(852);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 5, signature0, typeArray0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 5, customizer0);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Type type1 = Type.FLOAT_TYPE;
      EmitUtils.hash_code(codeEmitter1, type1, 156, (Customizer) null);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("6", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 112, signature0, typeArray0);
      Type type1 = Type.VOID_TYPE;
      codeEmitter1.box(type1);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("lksRdx3:i", type1, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-104));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 157, signature0, typeArray0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type1, 157, customizer0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("6", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 112, signature0, typeArray0);
      Type type1 = Type.INT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      Customizer customizer1 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type1, 189, customizer1);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Type type0 = Type.FLOAT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = mock(EmitUtils.ArrayDelimiters.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("lksRdx3:i", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-104));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 157, signature0, typeArray0);
      int[] intArray0 = new int[6];
      intArray0[0] = 96;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        codeEmitter2.process_switch(intArray0, processSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // keys to switch must be sorted ascending
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      Type type1 = Type.SHORT_TYPE;
      EmitUtils.hash_code(codeEmitter1, type1, (-1202), customizer0);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      ClassWriter classWriter0 = new ClassWriter(8);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("%~ 1", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3114, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Type type0 = Type.DOUBLE_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = mock(EmitUtils.ArrayDelimiters.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      Type type1 = Type.FLOAT_TYPE;
      typeArray0[0] = type1;
      Signature signature0 = new Signature("lksRdx3:i", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 4, signature0, typeArray0);
      codeEmitter2.unbox(type1);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("%~ 1", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1002, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      Customizer customizer1 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 1108, customizer1);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      EmitUtils.hash_code(codeEmitter1, typeArray0[0], 2108688053, (Customizer) null);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Type type0 = Type.FLOAT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = mock(EmitUtils.ArrayDelimiters.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("lksRdx3:i", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-104));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 157, signature0, typeArray0);
      Customizer customizer1 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter2, type0, 157, customizer1);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 16777216, customizer0);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter1.process_switch(intArray0, processSwitchCallback0);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Type type0 = Type.INT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", "l): HQRRD3q!tNhH1C%");
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      Type type1 = Type.VOID_TYPE;
      codeEmitter1.unbox(type1);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 145, signature0, typeArray0);
      codeEmitter1.push((-389.736));
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("%~ 1", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1002, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Type type1 = Type.FLOAT_TYPE;
      codeEmitter1.box(type0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(1, type1.getSize());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("%~ 1", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 987, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(116, CodeEmitter.NEG);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Type type0 = Type.DOUBLE_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = mock(EmitUtils.ArrayDelimiters.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("lksRdx3:i", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 4, signature0, typeArray0);
      codeEmitter2.unbox(type0);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 145, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      Type type1 = Type.VOID_TYPE;
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
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", "l): HQRRD3q!tNhH1C%");
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      Type type0 = Type.VOID_TYPE;
      EmitUtils.hash_code(codeEmitter1, type0, (-1237), (Customizer) null);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(label0, label0).when(codeEmitter0).make_label();
      Type type0 = Type.BOOLEAN_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, (EmitUtils.ArrayDelimiters) null, customizer0);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("Z", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 130, signature0, typeArray0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      EmitUtils.constructor_switch(codeEmitter2, linkedList0, objectSwitchCallback0);
      assertFalse(linkedList0.contains("Z"));
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Type type1 = Type.INT_TYPE;
      typeArray0[2] = type1;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 107, signature0, typeArray0);
      codeEmitter1.box(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", "l): HQRRD3q!tNhH1C%");
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter1, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Type type1 = Type.INT_TYPE;
      typeArray0[2] = type1;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 107, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("[y>", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 5, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("get", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 145, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      BigDecimal bigDecimal0 = new BigDecimal((long) 116);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Type type0 = Type.FLOAT_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("lksRdx3:i", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-104));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 157, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 157, customizer0);
      int[] intArray0 = new int[6];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter1.process_switch(intArray0, processSwitchCallback0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", "l): HQRRD3q!tNhH1C%");
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      Class<String> class0 = String.class;
      Type type0 = Type.getType(class0);
      Label label0 = codeEmitter1.mark();
      EmitUtils.not_equals(codeEmitter1, type0, label0, customizer0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "l): HQRRD3q!tNhH1C%";
      EmitUtils.push_array(codeEmitter1, stringArray0);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter1.process_switch(intArray0, processSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("%~ 1", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1002, signature0, typeArray0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 1108, customizer0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("a/kS-ptOl>=", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(852);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 5, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 5, customizer0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      ClassWriter classWriter0 = new ClassWriter(8);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("%~ 1", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3114, signature0, typeArray0);
      codeEmitter1.push((float) 108);
      Type type1 = Type.BYTE_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Type type0 = Type.FLOAT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = mock(EmitUtils.ArrayDelimiters.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter2 = new CodeEmitter(codeEmitter1);
      // Undeclared exception!
      try { 
        codeEmitter2.push((float) 7);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 145, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      BigInteger bigInteger0 = BigInteger.ONE;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("6", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 112, signature0, typeArray0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Type type1 = Type.getObjectType("6");
      EmitUtils.not_equals(codeEmitter1, type1, label0, (Customizer) null);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("%~ 1", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1002, signature0, typeArray0);
      EmitUtils.not_equals(codeEmitter1, type0, (Label) null, customizer0);
      codeEmitter1.box(type0);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null, (Label) null, (Label) null).when(codeEmitter1).make_label();
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type1 = Type.getObjectType("String[]");
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("String[]", type0, typeArray0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.not_equals(codeEmitter1, type1, (Label) null, (Customizer) null);
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      EmitUtils.push_object(codeEmitter2, bigDecimal0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Type type0 = Type.FLOAT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = mock(EmitUtils.ArrayDelimiters.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("lksRdx3:i", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-104));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 157, signature0, typeArray0);
      int[] intArray0 = new int[6];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter2.process_switch(intArray0, processSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("get", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 145, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      HashMap<BigInteger, Object> hashMap0 = new HashMap<BigInteger, Object>();
      Random random0 = new Random(2637L);
      BigInteger bigInteger0 = new BigInteger(183, 190, random0);
      hashMap0.put(bigInteger0, random0);
      // Undeclared exception!
      try { 
        EmitUtils.getSwitchKeys(hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.math.BigInteger cannot be cast to java.lang.Integer
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      codeEmitter1.box(type0);
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", "l): HQRRD3q!tNhH1C%");
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      Type type0 = Type.VOID_TYPE;
      codeEmitter1.create_arg_array();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", "l): HQRRD3q!tNhH1C%");
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      codeEmitter1.create_arg_array();
      Type type0 = Type.DOUBLE_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 145, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(116, CodeEmitter.NEG);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 145, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.hash_code(codeEmitter1, type0, 109, customizer0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Class<Object> class0 = Object.class;
      Type type0 = Type.getType(class0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(1, type0.getDimensions());
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Type type0 = Type.getObjectType("-->");
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("lksRdx3:i", type1, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-104));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 157, signature0, typeArray0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type1, 157, customizer0);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("lksRdx3:i", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-104));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 157, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 157, customizer0);
      // Undeclared exception!
      try { 
        codeEmitter1.load_args((-287), 116);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -287
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Type type0 = Type.DOUBLE_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = mock(EmitUtils.ArrayDelimiters.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("lksRdx3:i", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-104));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 157, signature0, typeArray0);
      // Undeclared exception!
      try { 
        codeEmitter2.load_args((-287), 116);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -287
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 184, signature0, typeArray0);
      int[] intArray0 = new int[1];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter1.process_switch(intArray0, processSwitchCallback0, false);
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter1, signature0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class org.mockito.cglib.core.Signature
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("lksRdx3:i", type1, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-104));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 157, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type1, 157, customizer0);
      // Undeclared exception!
      try { 
        codeEmitter1.load_args((-287), 116);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -287
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 145, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("%~ 1", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1002, signature0, typeArray0);
      codeEmitter1.box(type0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 1108, customizer0);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("%~ 1", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1002, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Type type0 = Type.DOUBLE_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = mock(EmitUtils.ArrayDelimiters.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("a/kS-ptOl>=", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(852);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 5, signature0, typeArray0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter2, linkedList0, objectSwitchCallback0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
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
  public void test80()  throws Throwable  {
      ClassEmitter classEmitter0 = mock(ClassEmitter.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[0];
      Type[] typeArray0 = new Type[0];
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("get", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 145, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 145, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      String[] stringArray0 = new String[0];
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, stringArray0, 5, objectSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 5
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      Type type0 = Type.DOUBLE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("lksRdx3:i", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-104));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 157, signature0, typeArray0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      int[] intArray0 = new int[6];
      intArray0[0] = 1;
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
  public void test84()  throws Throwable  {
      Type type0 = Type.BYTE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("l): HQRRD3q!tNhH1C%", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      Block block0 = codeEmitter1.begin_block();
      EmitUtils.wrap_undeclared_throwable(codeEmitter0, block0, typeArray0, type0);
      assertEquals(1, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Type type0 = Type.DOUBLE_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = mock(EmitUtils.ArrayDelimiters.class, new ViolatedAssumptionAnswer());
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("lksRdx3:i", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-104));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 157, signature0, typeArray0);
      int[] intArray0 = new int[6];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter2.process_switch(intArray0, processSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("%~ 1", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1002, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      codeEmitter1.box(type0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(124, CodeEmitter.USHR);
  }
}

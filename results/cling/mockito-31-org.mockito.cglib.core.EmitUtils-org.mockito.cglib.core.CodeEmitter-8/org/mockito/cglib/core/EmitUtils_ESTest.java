/*

 * Tue Mar 03 14:42:01 GMT 2020
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
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters(".Om)o2", "-rJpfcSU>?)${pb6-=", "-rJpfcSU>?)${pb6-=");
      Class<Type> class0 = Type.class;
      Type type1 = Type.getType(class0);
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(10, type1.getSort());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 8, (Customizer) null);
      LinkedList<BigDecimal> linkedList0 = new LinkedList<BigDecimal>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      String[] stringArray0 = new String[4];
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
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      String[] stringArray0 = new String[0];
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      assertEquals(2, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      Customizer customizer1 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 2142, customizer1);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(label0, label0).when(codeEmitter0).make_label();
      Type type0 = Type.INT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = mock(EmitUtils.ArrayDelimiters.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 2, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter2, type0, 1151, (Customizer) null);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      codeEmitter1.newarray(type0);
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      Type type1 = Type.FLOAT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("Unknown lxcal variable6", "-rJpfcSU>?)${pb6-=", "'");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      codeEmitter1.unbox(type1);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Type type0 = Type.VOID_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 568, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 6, (Customizer) null);
      LinkedList<BigInteger> linkedList0 = new LinkedList<BigInteger>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Object[] objectArray0 = new Object[5];
      EmitUtils.push_array(codeEmitter0, objectArray0);
      assertEquals(5, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      Label label0 = codeEmitter1.mark();
      EmitUtils.not_equals(codeEmitter1, type0, label0, (Customizer) null);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.BYTE_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("nz\"L.SEAFm=4N;#E6", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 152, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn(0, 0).when(type0).getSize();
      doReturn((-3125), 1832, 153).when(type0).getSort();
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("toString", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 100, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 157, (Customizer) null);
      BigInteger bigInteger0 = BigInteger.ONE;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("Unknown lxcal variable6", "-rJpfcSU>?)${pb6-=", "'");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      EmitUtils.hash_code(codeEmitter1, type0, 124, (Customizer) null);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(label0, label0).when(codeEmitter0).make_label();
      Type type0 = Type.BOOLEAN_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(label0, label0).when(codeEmitter0).make_label();
      Type type0 = Type.CHAR_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = mock(EmitUtils.ArrayDelimiters.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      BigInteger bigInteger0 = BigInteger.ONE;
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 2, signature0, typeArray0);
      EmitUtils.push_object(codeEmitter2, bigInteger0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 2114, (Customizer) null);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 1530, (Customizer) null);
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type1;
      Type[] typeArray1 = new Type[5];
      typeArray1[0] = type1;
      typeArray1[1] = type0;
      typeArray1[2] = type1;
      typeArray1[3] = type1;
      typeArray1[4] = typeArray0[0];
      Signature signature0 = new Signature("VN", type1, typeArray1);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-3443), signature0, typeArray0);
      codeEmitter1.push((double) 0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Type type0 = Type.BOOLEAN_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type1;
      typeArray0[2] = type1;
      typeArray0[3] = type1;
      typeArray0[4] = type1;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("StackMapTable", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 124, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type1, 1, (Customizer) null);
      LinkedList<BigDecimal> linkedList0 = new LinkedList<BigDecimal>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter0, (String[]) null, 0, objectSwitchCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 1530, (Customizer) null);
      int[] intArray0 = new int[7];
      intArray0[0] = 157;
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
  public void test22()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      Type type1 = Type.FLOAT_TYPE;
      BigInteger bigInteger0 = BigInteger.ZERO;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      EmitUtils.hash_code(codeEmitter1, type1, 707, (Customizer) null);
      assertEquals(1, type1.getSize());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("N^Z/3<=NS1j/6]$}", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("<init>", "X'Rd`6mga6l].+", "X'Rd`6mga6l].+");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type1 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type1;
      typeArray0[2] = type0;
      typeArray0[3] = type1;
      typeArray0[4] = type0;
      typeArray0[5] = type1;
      typeArray0[6] = type1;
      Signature signature0 = new Signature("", type1, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      // Undeclared exception!
      try { 
        codeEmitter1.load_args(4, 5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 7
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Class<Type> class0 = Type.class;
      Type type0 = Type.getType(class0);
      Type[] typeArray0 = new Type[3];
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray1 = new Type[5];
      typeArray1[0] = type0;
      typeArray1[1] = type0;
      typeArray1[2] = type0;
      typeArray1[3] = type0;
      typeArray1[4] = type0;
      Signature signature0 = new Signature("tT]tT]", type0, typeArray1);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      Label label0 = codeEmitter1.mark();
      EmitUtils.not_equals(codeEmitter1, type0, label0, (Customizer) null);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      Class<Object> class0 = Object.class;
      Type type0 = Type.getType(class0);
      EmitUtils.wrap_undeclared_throwable(codeEmitter0, block0, (Type[]) null, type0);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("double", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 0, (Customizer) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      EmitUtils.hash_code(codeEmitter1, type0, 2114, (Customizer) null);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      LinkedList<BigInteger> linkedList0 = new LinkedList<BigInteger>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      codeEmitter1.end_method();
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 1653, signature0, typeArray0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter2, linkedList0, objectSwitchCallback0);
      codeEmitter2.end_method();
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 124, (Customizer) null);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 1530, (Customizer) null);
      Type type1 = Type.FLOAT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      Type type1 = Type.FLOAT_TYPE;
      Type type2 = Type.getObjectType("-rJpfcSU>?)${pb6-=");
      codeEmitter1.unbox(type1);
      EmitUtils.hash_code(codeEmitter1, type2, 1, (Customizer) null);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(type0).getInternalName();
      doReturn(124, 0).when(type0).getSort();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[1];
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("nz\"L.SEAFm=4N;#E6", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 152, signature0, typeArray0);
      codeEmitter1.unbox(type0);
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
  public void test35()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      Type type1 = Type.getType("nz\"L.SEAFm=4N;#E6");
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1, signature0, typeArray0);
      codeEmitter1.unbox(type1);
      String[] stringArray0 = new String[0];
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      assertEquals(2, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("Unknown lxcal variable6", "-rJpfcSU>?)${pb6-=", "'");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      codeEmitter1.unbox(typeArray0[2]);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[6];
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter0, stringArray0, 2, objectSwitchCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils$5", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("Unknown lxcal variable6", "-rJpfcSU>?)${pb6-=", "'");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      Type type1 = Type.VOID_TYPE;
      EmitUtils.hash_code(codeEmitter1, type1, 116, (Customizer) null);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      Block block0 = new Block(codeEmitter1);
      // Undeclared exception!
      try { 
        EmitUtils.wrap_undeclared_throwable(codeEmitter1, block0, typeArray0, typeArray0[1]);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // end of block is unset
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(label0, label0).when(codeEmitter0).make_label();
      Type type0 = Type.FLOAT_TYPE;
      EmitUtils.append_string(codeEmitter0, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 2, signature0, typeArray0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter2, linkedList0, objectSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(label0, label0).when(codeEmitter0).make_label();
      Type type0 = Type.INT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = mock(EmitUtils.ArrayDelimiters.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      BigInteger bigInteger0 = BigInteger.ONE;
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 2, signature0, typeArray0);
      EmitUtils.push_object(codeEmitter2, bigInteger0);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((ClassEmitter) null).when(codeEmitter0).getClassEmitter();
      doReturn(false).when(codeEmitter0).isStaticHook();
      Type type0 = Type.getObjectType("<init>");
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter0, type0);
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
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("N^Z/3<=NS1j/6]$}", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("<init>", "X'Rd`6mga6l].+", "X'Rd`6mga6l].+");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      EmitUtils.hash_code(codeEmitter1, type0, 2, (Customizer) null);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Type type0 = Type.VOID_TYPE;
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[5];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 130, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter1, typeArray0[3]);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot load void type
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(label0, label0).when(codeEmitter0).make_label();
      Type type0 = Type.CHAR_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = mock(EmitUtils.ArrayDelimiters.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 2, signature0, typeArray0);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      EmitUtils.method_switch(codeEmitter2, linkedList0, objectSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("Unknown lxcal variable6", "-rJpfcSU>?)${pb6-=", "'");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      BigInteger bigInteger0 = BigInteger.ZERO;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.push_object(codeEmitter1, (Object) null);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("<init>", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-1199), signature0, (Type[]) null);
      Type type1 = Type.DOUBLE_TYPE;
      codeEmitter1.unbox(type1);
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter1, classEmitter0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class org.mockito.cglib.core.ClassEmitter
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type type1 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type1;
      typeArray0[1] = type1;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type1;
      typeArray0[5] = type1;
      typeArray0[6] = type1;
      typeArray0[7] = type0;
      Signature signature0 = new Signature(".,cQz1w.7K7!#%9", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      codeEmitter1.unbox(type1);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type type1 = Type.INT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type1;
      typeArray0[1] = type1;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type1;
      typeArray0[5] = type1;
      typeArray0[6] = type1;
      typeArray0[7] = type0;
      Signature signature0 = new Signature(".,cQz1w.7K7!#%9", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      codeEmitter1.unbox(type1);
      String[] stringArray0 = new String[1];
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, stringArray0, 416, objectSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 416
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 1530, (Customizer) null);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn("doubleToLongBits").when(type0).getInternalName();
      doReturn(124, 100, 156, 96).when(type0).getSort();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("nz\"L.SEAFm=4N;#E6", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 152, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 1530, (Customizer) null);
      int[] intArray0 = new int[7];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter1.process_switch(intArray0, processSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      Label label0 = codeEmitter1.mark();
      EmitUtils.not_equals(codeEmitter1, type0, label0, (Customizer) null);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      Type type1 = Type.getObjectType("e#H'iJ 7J%iEhk6k");
      EmitUtils.push_array(codeEmitter1, typeArray0);
      Label label0 = codeEmitter1.make_label();
      // Undeclared exception!
      try { 
        EmitUtils.not_equals((CodeEmitter) null, type1, label0, (Customizer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      Type type1 = Type.FLOAT_TYPE;
      codeEmitter1.unbox(type1);
      EmitUtils.load_class(codeEmitter1, type0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      Type type1 = Type.FLOAT_TYPE;
      codeEmitter1.unbox(type1);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[8];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      typeArray0[7] = type0;
      Signature signature0 = new Signature(".,cQz1w.7K7!#%9", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      String[] stringArray0 = new String[1];
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, stringArray0, 416, objectSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 416
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn("S$AZ#@B").when(type0).getInternalName();
      doReturn(124, (-2165)).when(type0).getSort();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("nz\"L.SEAFm=4N;#E6", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 152, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.push_object(codeEmitter1, "nz\"L.SEAFm=4N;#E6(VV)V");
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 2142, customizer0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      Type type1 = Type.getObjectType("-rJpfcSU>?)${pb6-=");
      codeEmitter1.unbox(typeArray0[2]);
      EmitUtils.hash_code(codeEmitter1, type1, 6, (Customizer) null);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn((Label) null, (Label) null).when(codeEmitter0).make_label();
      Type type0 = Type.getObjectType("<init>");
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter0, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[4];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      Signature signature0 = new Signature("N^Z/3<=NS1j/6]$}", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 126, signature0, typeArray0);
      codeEmitter1.box(type0);
      EmitUtils.hash_code(codeEmitter1, type0, 2, (Customizer) null);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 1530, (Customizer) null);
      // Undeclared exception!
      try { 
        codeEmitter1.load_args((-3), 19);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -3
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("append", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      EmitUtils.hash_code(codeEmitter1, type0, 124, (Customizer) null);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("I:!bQbY>\"n", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 1530, (Customizer) null);
      BigInteger bigInteger0 = BigInteger.ZERO;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals((short)0, bigInteger0.shortValue());
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("Unknown lxcal variable6", "-rJpfcSU>?)${pb6-=", "'");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("Unknown lxcal variable6", "-rJpfcSU>?)${pb6-=", "'");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      Type type1 = Type.FLOAT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("Unknown lxcal variable6", "-rJpfcSU>?)${pb6-=", "'");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      codeEmitter1.unbox(type1);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test73()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn("toString").when(type0).getInternalName();
      doReturn(124, 157).when(type0).getSort();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("nz\"L.SEAFm=4N;#E6", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 152, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Type type1 = Type.FLOAT_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type0 = mock(Type.class, new ViolatedAssumptionAnswer());
      doReturn("doubleToLongBits", "doubleToLongBits", "TNrDiql", (String) null, (String) null).when(type0).getInternalName();
      doReturn(124, 100, 0).when(type0).getSort();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("nz\"L.SEAFm=4N;#E6", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 152, signature0, typeArray0);
      Block block0 = new Block(codeEmitter1);
      block0.end();
      codeEmitter1.unbox(type0);
      EmitUtils.wrap_undeclared_throwable(codeEmitter1, block0, typeArray0, typeArray0[1]);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[7];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      typeArray0[6] = type0;
      Signature signature0 = new Signature("sfb'zua6k94hT", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1769, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      BigDecimal bigDecimal0 = new BigDecimal(262L);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
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
  public void test77()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      doReturn(label0, label0).when(codeEmitter0).make_label();
      Type type0 = Type.FLOAT_TYPE;
      EmitUtils.append_string(codeEmitter0, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      BigInteger bigInteger0 = BigInteger.ONE;
      CodeEmitter codeEmitter1 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter2 = new CodeEmitter(classEmitter0, codeEmitter1, 2, signature0, typeArray0);
      EmitUtils.push_object(codeEmitter2, bigInteger0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Unknown lxcal variable6", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("Unknown lxcal variable6", "-rJpfcSU>?)${pb6-=", "'");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      BigInteger bigInteger0 = BigInteger.ZERO;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(158, CodeEmitter.LE);
  }
}

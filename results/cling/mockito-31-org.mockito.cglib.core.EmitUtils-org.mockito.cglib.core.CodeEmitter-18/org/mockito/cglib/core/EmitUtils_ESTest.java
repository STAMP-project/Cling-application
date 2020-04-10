/*

 * Tue Mar 03 14:45:22 GMT 2020
 */

package org.mockito.cglib.core;

import org.junit.Test;
import org.junit.Ignore;
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
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      String[] stringArray0 = new String[2];
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
  public void test001()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.load_args();
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      Class<Integer> class0 = Integer.class;
      Type type1 = Type.getType(class0);
      EmitUtils.not_equals(codeEmitter1, type1, (Label) null, customizer0);
      BigDecimal bigDecimal0 = new BigDecimal((long) 96);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      String[] stringArray0 = new String[8];
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
  public void test005()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("|8@)t-WB?c%6q", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      String[] stringArray0 = new String[0];
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 492, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, typeArray0[0], emitUtils_ArrayDelimiters0, customizer0);
      codeEmitter1.push(1.0F);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      EmitUtils.hash_code(codeEmitter1, typeArray0[0], 128, (Customizer) null);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type type1 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type1;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type1, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type1, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      EmitUtils.hash_code(codeEmitter1, type0, 1879048192, (Customizer) null);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      ObjectSwitchCallback objectSwitchCallback1 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, stringArray0, 792, objectSwitchCallback1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 792
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.newarray(type0);
      assertEquals(7, Type.LONG);
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      codeEmitter1.push(true);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("axat&kU<v", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      codeEmitter1.push(false);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type type1 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type1;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 104, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      codeEmitter1.create_arg_array();
      Type type2 = Type.INT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type2, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters((String) null, "j", (String) null);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("j", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 112, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, typeArray0[0], emitUtils_ArrayDelimiters0, customizer0);
      int[] intArray0 = new int[3];
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      codeEmitter1.process_switch(intArray0, processSwitchCallback0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      Type type1 = Type.getObjectType("org.mockito.cglib.core.EmitUtils");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type1, 154, customizer0);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      BigInteger bigInteger0 = BigInteger.ONE;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      EmitUtils.not_equals(codeEmitter1, type0, (Label) null, customizer0);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      BigInteger bigInteger0 = bigDecimal0.toBigIntegerExact();
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      EmitUtils.push_object(codeEmitter1, "org.mockito.cglib.core.EmitUtils");
      int[] intArray0 = new int[7];
      intArray0[0] = 4;
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
  public void test019()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("{[", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter1.box(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 156, signature0, typeArray0);
      BigDecimal bigDecimal0 = new BigDecimal((long) 5);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      Type type1 = Type.INT_TYPE;
      EmitUtils.hash_code(codeEmitter1, type1, 157, (Customizer) null);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.push_object(codeEmitter1, typeArray0[0]);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-4587), signature0, typeArray0);
      codeEmitter1.push(1855.405F);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      Type type1 = Type.SHORT_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      codeEmitter1.push((float) 124);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test026()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      EmitUtils.hash_code(codeEmitter1, type1, (-1954041725), (Customizer) null);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("{[", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      EmitUtils.hash_code(codeEmitter1, type0, 163, (Customizer) null);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      BigDecimal bigDecimal0 = new BigDecimal((double) 158);
      EmitUtils.hash_code(codeEmitter1, type1, 9, (Customizer) null);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      EmitUtils.not_equals(codeEmitter1, type0, (Label) null, customizer0);
      codeEmitter1.load_args();
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      Class<BigDecimal> class0 = BigDecimal.class;
      Type type1 = Type.getType(class0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      BigDecimal bigDecimal0 = new BigDecimal((long) 108);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 2, (Customizer) null);
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
  public void test033()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter1, type0, (Label) null, customizer0);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("YM-[g.&uVID!nR", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 94, signature0, typeArray0);
      BigDecimal bigDecimal0 = new BigDecimal((double) 130);
      BigInteger bigInteger0 = bigDecimal0.toBigIntegerExact();
      EmitUtils.hash_code(codeEmitter1, type0, 50, (Customizer) null);
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(116, CodeEmitter.NEG);
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      EmitUtils.wrap_undeclared_throwable(codeEmitter0, (Block) null, (Type[]) null, (Type) null);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      BigInteger bigInteger0 = bigDecimal0.toBigIntegerExact();
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test037()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3735, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Type type1 = Type.LONG_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 3003, customizer0);
      BigInteger bigInteger0 = BigInteger.ONE;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      Type type1 = Type.getObjectType("org.mockito.cglib.core.EmitUtils");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.push((long) 1);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 628, signature0, typeArray0);
      Type type1 = Type.INT_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      EmitUtils.hash_code(codeEmitter1, type1, 2587, (Customizer) null);
      assertFalse(type1.equals((Object)type0));
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type1 = Type.FLOAT_TYPE;
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters(">Fg7Y?c)W/g|> )i5", "u,Z?t>%%L$))", "Bad comparison for type ");
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
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
  public void test043()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      codeEmitter1.create_arg_array();
      Type type1 = Type.BYTE_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      Type type1 = Type.LONG_TYPE;
      EmitUtils.hash_code(codeEmitter1, type1, 1, (Customizer) null);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters((String) null, "j", (String) null);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("j", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 112, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, typeArray0[0], emitUtils_ArrayDelimiters0, customizer0);
      LinkedList<BigDecimal> linkedList0 = new LinkedList<BigDecimal>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(153, CodeEmitter.EQ);
  }

  @Test(timeout = 4000)
  public void test046()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      String[] stringArray0 = new String[8];
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, stringArray0, 126, objectSwitchCallback0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 126
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "hashCode";
      stringArray0[1] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      Object[] objectArray0 = new Object[5];
      objectArray0[2] = (Object) customizer0;
      // Undeclared exception!
      try { 
        EmitUtils.push_array(codeEmitter1, objectArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class org.mockito.cglib.core.Customizer$MockitoMock$854515939
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test048()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      EmitUtils.hash_code(codeEmitter1, type1, 128, (Customizer) null);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("YM-[g.&uVID!nR", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 94, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      codeEmitter1.unbox(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      EmitUtils.hash_code(codeEmitter1, typeArray0[0], 1879048192, (Customizer) null);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("YM-[g.&uVID!nR", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 94, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      EmitUtils.hash_code(codeEmitter1, type0, 154, (Customizer) null);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("YM-[g.&uVID!nR", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 94, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      EmitUtils.hash_code(codeEmitter1, type0, 2147483645, (Customizer) null);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("cannot load void type", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 156, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.hash_code(codeEmitter1, type0, 89, (Customizer) null);
      assertEquals(3, Type.BYTE);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      Type type1 = Type.FLOAT_TYPE;
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.push((double) 6);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      Type type1 = Type.BYTE_TYPE;
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      EmitUtils.append_string(codeEmitter1, type1, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 469, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      codeEmitter1.create_arg_array();
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Object[] objectArray0 = new Object[3];
      EmitUtils.push_array(codeEmitter1, objectArray0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type type1 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type1;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type1, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type1);
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter1, type0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot load void type
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("axat&kU<v", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      String[] stringArray0 = new String[9];
      stringArray0[0] = "axat&kU<v";
      stringArray0[1] = "System";
      stringArray0[2] = "System";
      stringArray0[3] = "axat&kU<v";
      stringArray0[4] = "axat&kU<v";
      stringArray0[5] = "axat&kU<v";
      stringArray0[6] = "System";
      stringArray0[7] = "System";
      stringArray0[8] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 0, objectSwitchCallback0);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      codeEmitter1.unbox(type0);
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
  public void test062()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters((String) null, "j", (String) null);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("j", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 112, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      codeEmitter1.create_arg_array();
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.load_args();
      EmitUtils.hash_code(codeEmitter1, type0, 3, (Customizer) null);
      assertEquals(5, Type.INT);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("YM-[g.&uVID!nR", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 94, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      String[] stringArray0 = new String[9];
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
  public void test065()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 3735, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
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
  public void test066()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      EmitUtils.push_array(codeEmitter1, stringArray0);
      assertEquals(116, CodeEmitter.NEG);
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("cannot load void type", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 156, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(typeArray0[0]);
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
  public void test068()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      HashMap<Type, Type> hashMap0 = new HashMap<Type, Type>();
      int[] intArray0 = EmitUtils.getSwitchKeys(hashMap0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      Type type1 = Type.VOID_TYPE;
      codeEmitter1.unbox(type1);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      Type type1 = Type.SHORT_TYPE;
      BigDecimal bigDecimal0 = new BigDecimal((double) 158);
      EmitUtils.hash_code(codeEmitter1, type1, 1879048192, (Customizer) null);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.getObjectType("append");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 112, signature0, typeArray0);
      codeEmitter1.create_arg_array();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter1, type0, label0, customizer0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "org.mockito.cglib.core.EmitUtils";
      stringArray0[1] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      EmitUtils.hash_code(codeEmitter1, type0, 128, (Customizer) null);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("cannot load void type", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 156, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(typeArray0[0]);
      BigInteger bigInteger0 = BigInteger.TEN;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Type type1 = Type.FLOAT_TYPE;
      codeEmitter1.push((float) 6);
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test077()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      BigDecimal bigDecimal0 = new BigDecimal((long) 130);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter1, codeEmitter1.LE);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class java.lang.Integer
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      BigInteger bigInteger0 = BigInteger.ONE;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      BigDecimal bigDecimal0 = new BigDecimal((long) 130);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test081()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      String[] stringArray0 = new String[4];
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils$5", e);
      }
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type type1 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type1;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type1, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type1);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, (-3688), customizer0);
      assertEquals(1, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test083()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      Class<Integer> class0 = Integer.class;
      Type type1 = Type.getType(class0);
      EmitUtils.not_equals(codeEmitter1, type1, (Label) null, customizer0);
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
  public void test084()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      EmitUtils.hash_code(codeEmitter1, type0, (-1394), customizer0);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("axat&kU<v", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      codeEmitter1.create_arg_array();
      Class<String> class0 = String.class;
      Type type1 = Type.getType(class0);
      EmitUtils.not_equals(codeEmitter1, type1, (Label) null, (Customizer) null);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("YM-[g.&uVID!nR", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 94, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      // Undeclared exception!
      try { 
        EmitUtils.load_class((CodeEmitter) null, type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Class<Type> class0 = Type.class;
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
  public void test088()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "";
      stringArray0[1] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("YM-[g.&uVID!nR", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 100, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      codeEmitter1.create_arg_array();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("axat&kU<v", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      codeEmitter1.create_arg_array();
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      LinkedList<BigInteger> linkedList0 = new LinkedList<BigInteger>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.push_object(codeEmitter1, "org.mockito.cglib.core.EmitUtils");
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "hashCode";
      stringArray0[1] = "org.mockito.cglib.core.EmitUtils";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, (-1394), customizer0);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      Type type1 = Type.getObjectType("org.mockito.cglib.core.EmitUtils");
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.hash_code(codeEmitter1, type1, (-122), (Customizer) null);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.load_args();
      EmitUtils.hash_code(codeEmitter1, type0, 3, (Customizer) null);
      assertEquals(1, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      BigDecimal bigDecimal0 = new BigDecimal((double) 158);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.load_args();
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 8, signature0, typeArray0);
      EmitUtils.push_object(codeEmitter1, "org.mockito.cglib.core.EmitUtils");
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
  public void test101()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      BigDecimal bigDecimal0 = new BigDecimal((double) 158);
      EmitUtils.hash_code(codeEmitter1, type0, 9, (Customizer) null);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, (-1394), customizer0);
      BigDecimal bigDecimal0 = new BigDecimal((long) 130);
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      codeEmitter1.zero_or_null(type0);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      int[] intArray0 = new int[5];
      intArray0[1] = 116;
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
  public void test105()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Block block0 = mock(Block.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[6];
      EmitUtils.wrap_undeclared_throwable(codeEmitter0, block0, typeArray0, typeArray0[4]);
      assertEquals(6, typeArray0.length);
  }

  @Test(timeout = 4000)
  public void test106()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("cannot load void type", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 156, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      codeEmitter1.unbox_or_zero(typeArray0[0]);
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.unbox_or_zero(type0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, customizer0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 128, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test109()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      ClassEmitter classEmitter0 = new ClassEmitter();
      Signature signature0 = new Signature("org.mockito.cglib.core.EmitUtils", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 1276, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(1, type0.getSize());
  }
}

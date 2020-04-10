/*

 * Tue Mar 03 14:42:47 GMT 2020
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
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(228);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      codeEmitter1.zero_or_null(type0);
      Block block0 = new Block(codeEmitter1);
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
  public void test001()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(727);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 7, signature0, typeArray0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, (-3416), customizer0);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test002()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 157, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@345ea569
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test003()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type type1 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfo is null! ", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(727);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("\" has been declared differently", "\"", "dwL=1U#vk3 L&TFhN");
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test004()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(1118);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 15, signature0, typeArray0);
      codeEmitter1.zero_or_null(type0);
      String[] stringArray0 = new String[9];
      // Undeclared exception!
      try { 
        EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // classInfo is null! org.mockito.cglib.core.ClassEmitter@15f70141
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test005()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type1, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(183);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("classInfoy is null! ", "classInfoy is null! ", "classInfoy is null! ");
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      EmitUtils.hash_code(codeEmitter1, type0, 2130165231, (Customizer) null);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test006()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 157, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("47~$;QHp(", "g;b6@p_Rru6e;Gi", "g;b6@p_Rru6e;Gi");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      Customizer customizer1 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 128, customizer1);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test007()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212677);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 285212677, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("d", "CGLIB$STATICHOOK1", "d");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 157, customizer0);
      Customizer customizer1 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer1);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test008()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      Type type1 = Type.VOID_TYPE;
      codeEmitter1.newarray(type1);
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test009()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(228);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      codeEmitter1.push(false);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test010()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type type1 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type1, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("classInfoy is null! ", "classInfoy is null! ", "classInfoy is null! ");
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      codeEmitter1.unbox(type0);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test011()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("classInfoy is null! ", "classInfoy is null! ", "classInfoy is null! ");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      BigInteger bigInteger0 = BigInteger.TEN;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test012()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 1, objectSwitchCallback0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 124, customizer0);
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test013()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(1922);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      codeEmitter1.box(type0);
      EmitUtils.not_equals(codeEmitter1, type0, (Label) null, (Customizer) null);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test014()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 1, objectSwitchCallback0);
      ObjectSwitchCallback objectSwitchCallback1 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, stringArray0, 96, objectSwitchCallback1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 96
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test015()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      Type type1 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type1;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type1;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(228);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      EmitUtils.hash_code(codeEmitter1, type1, 128, (Customizer) null);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test016()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-1052));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 10, signature0, typeArray0);
      codeEmitter1.create_arg_array();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("y[CV,%Q", "d", "haXshCode");
      Type type1 = Type.SHORT_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test017()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2, signature0, typeArray0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      EmitUtils.not_equals(codeEmitter1, type0, (Label) null, (Customizer) null);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test018()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-792), signature0, typeArray0);
      Type type1 = Type.VOID_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("toString", "O7Nc", "toString");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      codeEmitter1.zero_or_null(type1);
      assertEquals(6, Type.FLOAT);
  }

  @Test(timeout = 4000)
  public void test019()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 285212676, signature0, typeArray0);
      codeEmitter1.create_arg_array();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 157, customizer0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test020()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(4);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 5, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("t3?", "t3?", "%G@Re");
      codeEmitter1.push(100L);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test021()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(1);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2538, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("append", "append", "koC\"d?4g;et\"ylViZ");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      codeEmitter1.create_arg_array();
      assertEquals(155, CodeEmitter.LT);
  }

  @Test(timeout = 4000)
  public void test022()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 0, (Customizer) null);
      BigDecimal bigDecimal0 = BigDecimal.ONE;
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals((byte)1, bigDecimal0.byteValue());
  }

  @Test(timeout = 4000)
  public void test023()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(6);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      EmitUtils.hash_code(codeEmitter1, type0, 124, customizer0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test024()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type type1 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfo is null! ", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(727);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 108, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      codeEmitter1.zero_or_null(type1);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test025()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("", "", "U");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
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
  public void test026()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      CodeEmitter codeEmitter1 = new CodeEmitter(codeEmitter0);
      // Undeclared exception!
      try { 
        codeEmitter1.unbox(type0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test027()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 5, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      codeEmitter1.zero_or_null(type0);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test028()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 4434, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("koC\"d?4g;et\"ylViZ", "", "4\"XY'}");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      codeEmitter1.create_arg_array();
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test029()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(1922);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[1];
      Type type1 = Type.LONG_TYPE;
      typeArray0[0] = type1;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 6, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type1, 128, customizer0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("-Vcdntds04#n", "-Vcdntds04#n", "");
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertNotSame(type0, type1);
  }

  @Test(timeout = 4000)
  public void test030()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 285212676, signature0, typeArray0);
      int[] intArray0 = new int[3];
      intArray0[0] = 130;
      ProcessSwitchCallback processSwitchCallback0 = mock(ProcessSwitchCallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        codeEmitter1.process_switch(intArray0, processSwitchCallback0, false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // keys to switch must be sorted ascending
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test031()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 285212676, signature0, typeArray0);
      codeEmitter1.create_arg_array();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 157, customizer0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test032()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      String[] stringArray0 = new String[1];
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("equals", "", "");
      Type type1 = Type.BYTE_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      EmitUtils.push_array(codeEmitter1, stringArray0);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test033()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      codeEmitter1.zero_or_null(type0);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test034()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 285212676, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("d", "CGLIB$STATICHOOK1", "d");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      Block block0 = codeEmitter1.begin_block();
      block0.end();
      EmitUtils.wrap_undeclared_throwable(codeEmitter1, block0, typeArray0, type0);
      assertEquals(1, type0.getDimensions());
  }

  @Test(timeout = 4000)
  public void test035()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      ClassWriter classWriter0 = new ClassWriter((-3523));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = typeArray0[1];
      Signature signature0 = new Signature("Synthetic", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      EmitUtils.hash_code(codeEmitter1, type0, 1, (Customizer) null);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test036()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(1);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2538, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, (-2025), customizer0);
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
  public void test037()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      ClassWriter classWriter0 = new ClassWriter((-3523));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = typeArray0[1];
      Signature signature0 = new Signature("Synthetic", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      codeEmitter1.box(type0);
      EmitUtils.hash_code(codeEmitter1, typeArray0[2], 7, (Customizer) null);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test038()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(727);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 7, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, customizer0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test039()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.getObjectType("boolean");
      EmitUtils.wrap_undeclared_throwable(codeEmitter0, (Block) null, (Type[]) null, type0);
      assertEquals(10, type0.getSort());
  }

  @Test(timeout = 4000)
  public void test040()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 285212676, signature0, typeArray0);
      Block block0 = codeEmitter1.begin_block();
      Label label0 = block0.getStart();
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.not_equals(codeEmitter1, type0, label0, customizer0);
      BigInteger bigInteger0 = BigInteger.ZERO;
      EmitUtils.push_object(codeEmitter1, bigInteger0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test041()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2538, signature0, typeArray0);
      Type type1 = Type.LONG_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("t3?", "z1fq0U4`#;3*C", "<init>");
      codeEmitter1.zero_or_null(type1);
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(9, Type.ARRAY);
  }

  @Test(timeout = 4000)
  public void test042()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      ClassWriter classWriter0 = new ClassWriter((-3523));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      Signature signature0 = new Signature("Synthetic", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      Type type1 = Type.FLOAT_TYPE;
      EmitUtils.hash_code(codeEmitter1, type1, 7, (Customizer) null);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
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
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 1, objectSwitchCallback0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test044()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 285212676, signature0, typeArray0);
      codeEmitter1.push(1L);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test045()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(727);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 7, signature0, typeArray0);
      codeEmitter1.zero_or_null(type0);
      Block block0 = new Block(codeEmitter1);
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
  public void test046()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 157, signature0, typeArray0);
      codeEmitter1.end_method();
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, (String[]) null, 139, (ObjectSwitchCallback) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 139
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test047()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(1);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2538, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("StringBuffer append(long)", "append", "koC\"d?4g;et\"ylViZ");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
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
  public void test048()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(727);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 7, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, customizer0);
      codeEmitter1.push((long) 124);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test049()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("clasInfo is nul! ", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(1);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 7, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, (-889275715), customizer0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test050()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(727);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 7, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("classInfoy is null! ", "classInfoy is null! ", "classInfoy is null! ");
      Type type1 = Type.DOUBLE_TYPE;
      codeEmitter1.push((long) 124);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test051()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(183);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("classInfoy is null! ", "classInfoy is null! ", "classInfoy is null! ");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      EmitUtils.hash_code(codeEmitter1, type0, 2130165231, (Customizer) null);
      assertEquals(124, CodeEmitter.USHR);
  }

  @Test(timeout = 4000)
  public void test052()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(1);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-422), signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 155, customizer0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("t3?", "t3?", "t3?");
      Customizer customizer1 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer1);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test053()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2538, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 1, customizer0);
      codeEmitter1.unbox(type0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test054()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2538, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      Type type1 = Type.getObjectType("long");
      EmitUtils.hash_code(codeEmitter1, type1, 4, (Customizer) null);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test055()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2538, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      int[] intArray0 = EmitUtils.getSwitchKeys(hashMap0);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test056()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(6);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.constructor_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test057()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2538, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Type type1 = Type.LONG_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("", "h:`_g<:fI[v:Ht", "juYSpQF}");
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      codeEmitter1.create_arg_array();
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test058()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      Object[] objectArray0 = linkedList0.toArray();
      codeEmitter1.unbox(type0);
      EmitUtils.push_array(codeEmitter1, objectArray0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test059()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "4LHFrr|E?Q";
      classEmitter0.visit(2, 116, "haXshCode", "4LHFrr|E?Q", "i_\"3O0h", stringArray0);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 1, objectSwitchCallback0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test060()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Type type1 = Type.SHORT_TYPE;
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("z1fq0U4`#;3*C", "W*:V:bp7t", "z1fq0U4`#;3*C");
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      // Undeclared exception!
      try { 
        codeEmitter1.load_args((-942), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -942
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test061()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      codeEmitter1.unbox(type0);
      assertEquals(4, Type.SHORT);
  }

  @Test(timeout = 4000)
  public void test062()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 1, objectSwitchCallback0);
      EmitUtils.push_array(codeEmitter1, stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test063()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.VOID_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test064()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.CHAR_TYPE;
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(228);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test065()  throws Throwable  {
      Label label0 = new Label();
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2538, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter1, label0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class org.mockito.asm.Label
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test066()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      ClassWriter classWriter0 = new ClassWriter(10);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = typeArray0[1];
      Signature signature0 = new Signature("Synthetic", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      codeEmitter1.box(typeArray0[0]);
      Type type1 = Type.getReturnType("Synthetic");
      EmitUtils.hash_code(codeEmitter1, type1, 126, (Customizer) null);
      assertEquals(4, type1.getSort());
  }

  @Test(timeout = 4000)
  public void test067()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 1, objectSwitchCallback0);
      Label label0 = new Label();
      EmitUtils.not_equals(codeEmitter1, type0, label0, customizer0);
      assertEquals(8, Type.DOUBLE);
  }

  @Test(timeout = 4000)
  public void test068()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 285212676, signature0, typeArray0);
      codeEmitter1.create_arg_array();
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test069()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfo is null! ", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(727);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2165), signature0, typeArray0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "classInfo is null! ";
      stringArray0[1] = "classInfo is null! ";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 2, objectSwitchCallback0);
      assertEquals(158, CodeEmitter.LE);
  }

  @Test(timeout = 4000)
  public void test070()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(1118);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 15, signature0, typeArray0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      Type type1 = Type.DOUBLE_TYPE;
      EmitUtils.hash_code(codeEmitter1, type1, 10, (Customizer) null);
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(130, CodeEmitter.XOR);
  }

  @Test(timeout = 4000)
  public void test071()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter((-1052));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2538, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.push_object(codeEmitter1, "<init>");
      assertEquals(100, CodeEmitter.SUB);
  }

  @Test(timeout = 4000)
  public void test072()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2538, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      codeEmitter1.unbox(type0);
      Type type1 = Type.LONG_TYPE;
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("", "h:`_g<:fI[v:Ht", "juYSpQF}");
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, customizer0);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test073()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212668);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      Class<Integer> class0 = Integer.TYPE;
      EmitUtils.push_object(codeEmitter1, class0);
      codeEmitter1.unbox(type0);
      assertEquals(0, Type.VOID);
  }

  @Test(timeout = 4000)
  public void test074()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(183);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 7, signature0, typeArray0);
      BigDecimal bigDecimal0 = BigDecimal.ZERO;
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      codeEmitter1.unbox(type0);
      assertEquals(2, type0.getSize());
  }

  @Test(timeout = 4000)
  public void test075()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212677);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 285212677, signature0, typeArray0);
      codeEmitter1.create_arg_array();
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("d", "CGLIB$STATICHOOK1", "d");
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, customizer0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test076()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.SHORT_TYPE;
      Type[] typeArray0 = new Type[2];
      Type[] typeArray1 = new Type[1];
      typeArray1[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray1);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray1);
      codeEmitter1.zero_or_null(type0);
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
  public void test077()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212668);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 262144, customizer0);
      codeEmitter1.unbox(type0);
      assertEquals(1, Type.BOOLEAN);
  }

  @Test(timeout = 4000)
  public void test078()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      Label label0 = new Label();
      EmitUtils.not_equals(codeEmitter1, type0, label0, customizer0);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(128, CodeEmitter.OR);
  }

  @Test(timeout = 4000)
  public void test079()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 285212676, signature0, typeArray0);
      Label label0 = new Label();
      EmitUtils.not_equals(codeEmitter1, type0, label0, (Customizer) null);
      LinkedList<InputStream> linkedList0 = new LinkedList<InputStream>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test080()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(1118);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 15, signature0, typeArray0);
      codeEmitter1.zero_or_null(type0);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test081()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 1, objectSwitchCallback0);
      Type type1 = Type.BYTE_TYPE;
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type1, 157, customizer0);
      assertEquals(126, CodeEmitter.AND);
  }

  @Test(timeout = 4000)
  public void test082()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-792), signature0, typeArray0);
      Block block0 = codeEmitter1.begin_block();
      Label label0 = block0.getStart();
      EmitUtils.not_equals(codeEmitter1, type0, label0, (Customizer) null);
      // Undeclared exception!
      try { 
        EmitUtils.push_array(codeEmitter1, typeArray0);
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
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("StackMapTable", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "StackMapTable";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 1, objectSwitchCallback0);
      BigDecimal bigDecimal0 = BigDecimal.TEN;
      EmitUtils.push_object(codeEmitter1, bigDecimal0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test084()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      Class<Integer> class0 = Integer.TYPE;
      EmitUtils.push_object(codeEmitter1, class0);
      codeEmitter1.unbox(type0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test085()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2538, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertEquals(104, CodeEmitter.MUL);
  }

  @Test(timeout = 4000)
  public void test086()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("classInfoy is null! ", "classInfoy is null! ", "classInfoy is null! ");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      codeEmitter1.create_arg_array();
      assertEquals(108, CodeEmitter.DIV);
  }

  @Test(timeout = 4000)
  public void test087()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(4);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 5, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      // Undeclared exception!
      try { 
        EmitUtils.string_switch(codeEmitter1, (String[]) null, 104, (ObjectSwitchCallback) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown switch style 104
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test088()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      codeEmitter1.unbox(type0);
      LinkedList<BigDecimal> linkedList0 = new LinkedList<BigDecimal>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test089()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(1118);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 15, signature0, typeArray0);
      EmitUtils.push_object(codeEmitter1, ",z'$gDz\"C}GexVEF");
      codeEmitter1.unbox(typeArray0[0]);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test090()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      EmitUtils.hash_code(codeEmitter1, type0, 2, (Customizer) null);
      codeEmitter1.unbox(type0);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test091()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.hash_code(codeEmitter1, type0, 153, customizer0);
      codeEmitter1.unbox(type0);
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test092()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-792), signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("koC\"d?4g;et\"ylViZ", "", (String) null);
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test093()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(1118);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 15, signature0, typeArray0);
      Customizer customizer0 = mock(Customizer.class, new ViolatedAssumptionAnswer());
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, customizer0);
      codeEmitter1.create_arg_array();
      assertEquals(156, CodeEmitter.GE);
  }

  @Test(timeout = 4000)
  public void test094()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(2);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 155, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("z1fq0U4`#;3*C", "W*:V:bp7t", "z1fq0U4`#;3*C");
      EmitUtils.append_string(codeEmitter1, typeArray0[0], emitUtils_ArrayDelimiters0, (Customizer) null);
      // Undeclared exception!
      try { 
        codeEmitter1.load_args((-942), 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -942
         //
         verifyException("org.mockito.cglib.core.CodeEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test095()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BYTE_TYPE;
      Type[] typeArray0 = new Type[6];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = type0;
      typeArray0[3] = type0;
      typeArray0[4] = type0;
      typeArray0[5] = type0;
      Signature signature0 = new Signature("hashCode", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(251);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      classEmitter0.visit(0, 107, "toString", "*XvdrR[*%$ZYDtZAdM", "hashCode", (String[]) null);
      // Undeclared exception!
      try { 
        EmitUtils.add_property(classEmitter0, "toString", type0, "hashCode");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Field hashCode is not declared in toString
         //
         verifyException("org.mockito.cglib.core.ClassEmitter", e);
      }
  }

  @Test(timeout = 4000)
  public void test096()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.INT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 285212676, signature0, typeArray0);
      String[] stringArray0 = new String[2];
      stringArray0[0] = "floatValue";
      stringArray0[1] = "CGLIB$STATICHOOK1";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 0, objectSwitchCallback0);
      assertEquals(112, CodeEmitter.REM);
  }

  @Test(timeout = 4000)
  public void test097()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      codeEmitter1.unbox(type0);
      classEmitter0.begin_class((-203), 156, "DK8.+", type0, typeArray0, "floatToIntBits");
      EmitUtils.push_array(codeEmitter1, typeArray0);
      assertFalse(codeEmitter1.isStaticHook());
  }

  @Test(timeout = 4000)
  public void test098()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      ClassWriter classWriter0 = new ClassWriter((-3523));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      typeArray0[2] = typeArray0[0];
      Signature signature0 = new Signature("Synthetic", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      codeEmitter1.box(type0);
      EmitUtils.hash_code(codeEmitter1, type0, 1, (Customizer) null);
      assertEquals(154, CodeEmitter.NE);
  }

  @Test(timeout = 4000)
  public void test099()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.LONG_TYPE;
      ClassWriter classWriter0 = new ClassWriter((-3523));
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type[] typeArray0 = new Type[3];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Type type1 = Type.DOUBLE_TYPE;
      typeArray0[2] = type1;
      Signature signature0 = new Signature("Synthetic", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 9, signature0, typeArray0);
      codeEmitter1.box(type0);
      EmitUtils.hash_code(codeEmitter1, type1, 7, (Customizer) null);
      assertEquals(2, Type.CHAR);
  }

  @Test(timeout = 4000)
  public void test100()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.BOOLEAN_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(1118);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 15, signature0, typeArray0);
      EmitUtils.append_string(codeEmitter1, type0, (EmitUtils.ArrayDelimiters) null, (Customizer) null);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(96, CodeEmitter.ADD);
  }

  @Test(timeout = 4000)
  public void test101()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("classInfoy is null! ", "classInfoy is null! ", "classInfoy is null! ");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      LinkedList<Type> linkedList0 = new LinkedList<Type>();
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.method_switch(codeEmitter1, linkedList0, objectSwitchCallback0);
      assertEquals(157, CodeEmitter.GT);
  }

  @Test(timeout = 4000)
  public void test102()  throws Throwable  {
      ClassEmitter classEmitter0 = new ClassEmitter();
      String[] stringArray0 = new String[0];
      Type[] typeArray0 = new Type[1];
      EmitUtils.add_properties(classEmitter0, stringArray0, typeArray0);
      assertEquals(0, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test103()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[0];
      Signature signature0 = new Signature("classInfoy is null! ", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter();
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 0, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("classInfoy is null! ", "classInfoy is null! ", "classInfoy is null! ");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      codeEmitter1.unbox(type0);
      assertEquals(10, Type.OBJECT);
  }

  @Test(timeout = 4000)
  public void test104()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      Type type0 = Type.FLOAT_TYPE;
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("t3?", type0, typeArray0);
      ClassWriter classWriter0 = new ClassWriter(0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 2538, signature0, typeArray0);
      codeEmitter1.unbox(type0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("t3?", "z1fq0U4`#;3*C", "<init>");
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test105()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
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
  public void test106()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      codeEmitter1.unbox(type0);
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        EmitUtils.push_object(codeEmitter1, object0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unknown type: class java.lang.Object
         //
         verifyException("org.mockito.cglib.core.EmitUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test107()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      Type type0 = Type.DOUBLE_TYPE;
      Type[] typeArray0 = new Type[1];
      typeArray0[0] = type0;
      Signature signature0 = new Signature("floatToIntBits", type0, typeArray0);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, 157, signature0, typeArray0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = EmitUtils.DEFAULT_DELIMITERS;
      EmitUtils.append_string(codeEmitter1, type0, emitUtils_ArrayDelimiters0, (Customizer) null);
      codeEmitter1.zero_or_null(type0);
      assertFalse(codeEmitter1.equals((Object)codeEmitter0));
  }

  @Test(timeout = 4000)
  public void test108()  throws Throwable  {
      CodeEmitter codeEmitter0 = mock(CodeEmitter.class, new ViolatedAssumptionAnswer());
      ClassWriter classWriter0 = new ClassWriter(285212676);
      ClassEmitter classEmitter0 = new ClassEmitter(classWriter0);
      Type type0 = Type.getObjectType("haXshCode");
      Type[] typeArray0 = new Type[2];
      typeArray0[0] = type0;
      typeArray0[1] = type0;
      Signature signature0 = new Signature("", type0, typeArray0);
      CodeEmitter codeEmitter1 = new CodeEmitter(classEmitter0, codeEmitter0, (-2565), signature0, typeArray0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      ObjectSwitchCallback objectSwitchCallback0 = mock(ObjectSwitchCallback.class, new ViolatedAssumptionAnswer());
      EmitUtils.string_switch(codeEmitter1, stringArray0, 1, objectSwitchCallback0);
      EmitUtils.ArrayDelimiters emitUtils_ArrayDelimiters0 = new EmitUtils.ArrayDelimiters("equals", "", "");
      Type type1 = Type.BYTE_TYPE;
      EmitUtils.append_string(codeEmitter1, type1, emitUtils_ArrayDelimiters0, (Customizer) null);
      assertEquals(128, CodeEmitter.OR);
  }
}

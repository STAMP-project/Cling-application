/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 22:18:17 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Arguments;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.Interpreter;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.UniqueTag;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1678L);
      nativeArray0.findPrototypeId("u`U?^4O");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1744L);
      nativeArray0.findPrototypeId("ritable");
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      nativeArray0.findPrototypeId("every");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = null;
      try {
        nativeArray0 = new NativeArray(context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.findPrototypeId("cdCO^vnk5Um6|");
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-886L));
      nativeArray0.findPrototypeId("initScript");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-922L));
      nativeArray0.findPrototypeId(" !@bDZJ5Z");
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) nativeArray0, true);
      // Undeclared exception!
      try { 
        nativeArray0.exportAsJSClass(180, scriptableObject0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot modify a property of a sealed object: Array.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.findPrototypeId("sort");
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      nativeArray0.findPrototypeId("map");
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      UnaryOperator<ImporterTopLevel> unaryOperator0 = UnaryOperator.identity();
      NativeArray nativeArray0 = new NativeArray((-2353L));
      // Undeclared exception!
      try { 
        nativeArray0.replaceAll(unaryOperator0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.listIterator((-1159));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -1159
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9218868437227405312L);
      // Undeclared exception!
      try { 
        nativeArray0.listIterator((-17));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(5L);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) nativeArray0;
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      nativeArray1.lastIndexOf(objectArray0[0]);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1868L);
      nativeArray0.lastIndexOf("isXMLName");
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-18014398509481984L));
      nativeArray0.lastIndexOf((Object) null);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      // Undeclared exception!
      nativeArray0.lastIndexOf("every");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483666L);
      // Undeclared exception!
      try { 
        nativeArray0.lastIndexOf((Object) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Interpreter interpreter0 = new Interpreter();
      Object[] objectArray0 = new Object[9];
      objectArray0[0] = (Object) interpreter0;
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.containsAll(nativeArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9218868437227405312L);
      Double double0 = new Double(0);
      // Undeclared exception!
      try { 
        nativeArray0.indexOf(double0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4995L);
      // Undeclared exception!
      try { 
        nativeArray0.get(4995L);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1447234817));
      // Undeclared exception!
      try { 
        nativeArray0.get((-4568956265895094861L));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9218868437227405312L);
      // Undeclared exception!
      try { 
        nativeArray0.size();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.size();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeArray nativeArray1 = new NativeArray((-2084L));
      nativeArray1.containsAll(nativeArray0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      nativeArray0.toArray();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9218868437227405312L);
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        nativeArray0.toArray(context0.emptyArgs);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber((-741.6365856));
      NativeArray nativeArray0 = new NativeArray(8);
      nativeArray0.contains(nativeNumber0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9218868437227405312L);
      nativeArray0.exportAsJSClass(7, (Scriptable) null, false);
      Class<Short> class0 = Short.class;
      // Undeclared exception!
      nativeArray0.getDefaultValue(class0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.exportAsJSClass(3, nativeArray0, false);
      nativeArray0.getOwnPropertyDescriptor((Context) null, nativeArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      Interpreter interpreter0 = new Interpreter();
      NativeArray nativeArray0 = new NativeArray(13145L);
      // Undeclared exception!
      try { 
        nativeArray0.setInstanceIdValue(1, interpreter0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // RangeError: Inappropriate array length.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test31()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1868L);
      nativeArray0.setDenseOnly(true);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9218868437227405312L);
      // Undeclared exception!
      try { 
        nativeArray0.setDenseOnly(true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1690L);
      nativeArray0.setDenseOnly(false);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test34()  throws Throwable  {
      Object[] objectArray0 = new Object[20];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getContext();
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = nativeArray1.exportAsJSClass(1431655764, nativeArray0, true);
      nativeArray0.execIdCall(idFunctionObject0, context0, (Scriptable) null, (Scriptable) null, objectArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test35()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9218868437227405312L);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(8, (Scriptable) null, false);
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, (Scriptable) null, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      NativeArray nativeArray0 = new NativeArray(120);
      NativeString nativeString0 = new NativeString("language version");
      Long long0 = new Long(1067L);
      nativeArray0.defineOwnProperty(context0, (Object) long0, (ScriptableObject) nativeString0, true);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test37()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray0 = new NativeArray(482L);
      Double double0 = new Double(11);
      nativeArray0.getOwnPropertyDescriptor(context0, double0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test38()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Property 2 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test39()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(27L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(40);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Property 40 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test40()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(482L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-1389));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Property -1389 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Object[] objectArray0 = new Object[15];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.getAttributes(9);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test42()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9218868437227405312L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(2);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Property 2 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test43()  throws Throwable  {
      Object[] objectArray0 = new Object[14];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        Context.toNumber(nativeArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Class<Arguments> class0 = Arguments.class;
      nativeArray0.defineProperty("W", class0, 13);
      nativeArray0.getIndexIds();
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      UniqueTag uniqueTag0 = (UniqueTag)Scriptable.NOT_FOUND;
      objectArray0[0] = (Object) uniqueTag0;
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.getIndexIds();
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      nativeArray0.getIds();
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1431655764L);
      nativeArray0.getIndexIds();
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.put(137, (Scriptable) nativeArray0, (Object) nativeArray0);
      ScriptableObject.deleteProperty((Scriptable) nativeArray0, 1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test49()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      nativeArray1.exportAsJSClass(13, nativeArray0, true);
      // Undeclared exception!
      try { 
        ScriptableObject.deleteProperty((Scriptable) nativeArray1, 4);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Cannot modify a property of a sealed object: 4.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.delete(100);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Object[] objectArray0 = new Object[20];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.delete((-1640531527));
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9218868437227405312L);
      nativeArray0.delete(70);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4985L);
      nativeArray0.put(4079, (Scriptable) nativeArray0, (Object) null);
      nativeArray0.setInstanceIdAttributes(1, (-2871));
      Context context0 = Context.enter();
      nativeArray0.defineOwnProperty(context0, (Object) null, (ScriptableObject) nativeArray0, true);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.put(137, (Scriptable) nativeArray0, (Object) nativeArray0);
      nativeArray0.put(1, (Scriptable) nativeArray0, (Object) nativeArray0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483669L);
      NativeArray nativeArray1 = new NativeArray(0);
      nativeArray0.put(2, (Scriptable) nativeArray1, (Object) nativeArray0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.put((-1240), (Scriptable) nativeArray0, (Object) nativeArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test57()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getContext();
      NativeArray nativeArray1 = null;
      try {
        nativeArray1 = new NativeArray(context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483669L);
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray1 = new NativeArray(objectArray0);
      nativeArray0.put(2, (Scriptable) nativeArray1, objectArray0[1]);
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4096L);
      NativeArray nativeArray1 = new NativeArray(2);
      nativeArray1.put("RangeError", (Scriptable) nativeArray0, (Object) nativeArray0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Double double0 = new Double(2);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      nativeArray0.getOwnPropertyDescriptor(context0, double0);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        ScriptableObject.defineProperty((Scriptable) nativeArray0, "8", (Object) "VB", (-1886));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1886
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9218868437227405312L);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      Float float0 = new Float((double) 13);
      nativeArray0.defineOwnProperty(context0, (Object) float0, (ScriptableObject) nativeArray0, true);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1690L);
      Context context0 = Context.getCurrentContext();
      nativeArray0.getOwnPropertyDescriptor(context0, "isArray");
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.deleteProperty((Scriptable) nativeArray0, 2);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.deleteProperty((Scriptable) nativeArray0, (-21));
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      ScriptableObject.deleteProperty((Scriptable) nativeArray0, 1);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.deleteProperty((Scriptable) nativeArray0, 4);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.put(137, (Scriptable) nativeArray0, (Object) nativeArray0);
      nativeArray0.lastIndexOf((Object) null);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(1868L);
      nativeArray0.get((-1540), (Scriptable) nativeArray0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test70()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeArray0.exportAsJSClass(841, nativeIterator_StopIteration0, true);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0);
      // Undeclared exception!
      nativeArray0.getOwnPropertyDescriptor(context0, synchronizer0);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(858L);
      Short short0 = new Short((short)18142);
      nativeArray0.setInstanceIdValue(1, short0);
      assertEquals(18142L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      // Undeclared exception!
      try { 
        nativeArray0.setInstanceIdValue(0, nativeArray0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test73()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Context context0 = Context.getCurrentContext();
      NativeArray nativeArray1 = null;
      try {
        nativeArray1 = new NativeArray(context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test74()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getInstanceIdValue(13);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 13
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test75()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.getInstanceIdName(2145068030);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 2145068030
         //
         verifyException("com.google.javascript.rhino.head.IdScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test76()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9218868437227405312L);
      nativeArray0.setInstanceIdAttributes(7, (-1196));
      assertEquals(9218868437227405312L, nativeArray0.jsGet_length());
  }

  @Test(timeout = 4000)
  public void test77()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Synchronizer synchronizer0 = new Synchronizer(nativeArray0, nativeArray0);
      Predicate<Integer> predicate0 = Predicate.isEqual((Object) synchronizer0);
      Predicate<Integer> predicate1 = predicate0.negate();
      // Undeclared exception!
      try { 
        nativeArray0.removeIf(predicate1);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray$3", e);
      }
  }

  @Test(timeout = 4000)
  public void test78()  throws Throwable  {
      Object[] objectArray0 = new Object[15];
      UnaryOperator<ImporterTopLevel> unaryOperator0 = UnaryOperator.identity();
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.replaceAll(unaryOperator0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray$3", e);
      }
  }

  @Test(timeout = 4000)
  public void test79()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483669L);
      // Undeclared exception!
      try { 
        nativeArray0.add((Object) nativeArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test80()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      // Undeclared exception!
      try { 
        nativeArray0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test81()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.remove(23);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test82()  throws Throwable  {
      Object[] objectArray0 = new Object[12];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      LinkedHashSet<BaseFunction> linkedHashSet0 = new LinkedHashSet<BaseFunction>();
      // Undeclared exception!
      try { 
        nativeArray0.addAll((-1879048191), (Collection) linkedHashSet0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test83()  throws Throwable  {
      int int0 = NativeArray.getMaximumInitialCapacity();
      assertEquals(10000, int0);
  }

  @Test(timeout = 4000)
  public void test84()  throws Throwable  {
      Object[] objectArray0 = new Object[13];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.subList((-1297), (-1297));
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test85()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.retainAll(nativeArray0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test86()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object[] objectArray1 = nativeArray0.getAllIds();
      assertEquals(3, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test87()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      long long0 = nativeArray0.jsGet_length();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test88()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      // Undeclared exception!
      try { 
        nativeArray0.set((-6), (Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test89()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2147483647L);
      TreeSet<BaseFunction> treeSet0 = new TreeSet<BaseFunction>();
      // Undeclared exception!
      try { 
        nativeArray0.addAll((Collection) treeSet0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test90()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeArray0, nativeArray0, 4, 4);
      Context context0 = Context.enter();
      // Undeclared exception!
      try { 
        nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, integerArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=4 MASTER=com.google.javascript.rhino.head.NativeArray@1
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test91()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      Object[] objectArray1 = nativeArray0.toArray();
      assertEquals(1, objectArray1.length);
  }

  @Test(timeout = 4000)
  public void test92()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(9218868437227405312L);
      // Undeclared exception!
      try { 
        nativeArray0.add(1431655765, (Object) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test93()  throws Throwable  {
      Object[] objectArray0 = new Object[14];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        nativeArray0.remove((Object) baseFunction0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test94()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      LinkedHashSet<NativeJavaTopPackage> linkedHashSet0 = new LinkedHashSet<NativeJavaTopPackage>();
      // Undeclared exception!
      try { 
        nativeArray0.removeAll(linkedHashSet0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test95()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity(0);
  }
}

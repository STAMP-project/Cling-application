/*

 * Tue Mar 03 18:58:27 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeArray_ESTest extends NativeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-4938676049251384304L));
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      Byte byte0 = new Byte((byte)20);
      nativeArray0.getOwnPropertyDescriptor(context0, byte0);
      assertEquals((-4938676049251384304L), nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(7793L);
      Context context0 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      nativeArray0.defineOwnProperty(context0, (Object) context0, scriptableObject0, false);
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(4985L);
      nativeArray0.delete((-5564));
      assertEquals(4985L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      nativeArray0.delete(10000);
      NativeArray.init(nativeArray0, true);
      assertEquals(8, ScriptableObject.UNINITIALIZED_CONST);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeArray.init((Scriptable) null, false);
      NativeArray nativeArray0 = new NativeArray(10000);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(212);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 212 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity((-2471));
      NativeArray nativeArray0 = new NativeArray(374L);
      nativeArray0.put(10000, (Scriptable) nativeArray0, (Object) nativeArray0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      assertEquals(0, ScriptableObject.EMPTY);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray.init((Scriptable) null, false);
      NativeArray.setMaximumInitialCapacity((-20));
      NativeArray nativeArray0 = new NativeArray(1L);
      nativeArray0.delete((-20));
      assertEquals("Array", nativeArray0.getClassName());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1090L));
      NativeArray.init(nativeArray0, true);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-19));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -19 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(0L);
      NativeArray.init(nativeArray0, false);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes(901);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property 901 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(1334, nativeArray0, false);
      Object[] objectArray0 = new Object[5];
      nativeArray0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeArray0, objectArray0);
      assertFalse(nativeArray0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(2);
      nativeArray0.exportAsJSClass(20, nativeArray0, false);
      Class<NativeJavaPackage> class0 = NativeJavaPackage.class;
      // Undeclared exception!
      try { 
        nativeArray0.getDefaultValue(class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeJavaPackage
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      NativeArray.setMaximumInitialCapacity((-20));
      NativeArray nativeArray0 = new NativeArray(1L);
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("final", classLoader0);
      // Undeclared exception!
      try { 
        nativeArray0.defineOwnProperty((Context) null, (Object) importerTopLevel0, (ScriptableObject) nativeJavaPackage0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeArray.init((Scriptable) null, false);
      Object[] objectArray0 = new Object[1];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        nativeArray0.getOwnPropertyDescriptor(context0, nativeJavaClass0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeJavaClass", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(7793L);
      Context context0 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      nativeArray0.put("error reporter", (Scriptable) scriptableObject0, (Object) context0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray(641L);
      nativeArray0.delete(1);
      NativeArray.init(nativeArray0, false);
      assertEquals(641L, nativeArray0.jsGet_length());
      assertEquals("Array", nativeArray0.getClassName());
      assertEquals(641L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeArray.init((Scriptable) null, false);
      NativeArray nativeArray0 = new NativeArray(4975L);
      Integer[] integerArray0 = nativeArray0.getIndexIds();
      assertEquals(0, integerArray0.length);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      NativeArray.init((Scriptable) null, false);
      NativeArray.setMaximumInitialCapacity((-20));
      NativeArray nativeArray0 = new NativeArray(1L);
      // Undeclared exception!
      try { 
        nativeArray0.getAttributes((-20));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Property -20 not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1669L));
      NativeWith nativeWith0 = new NativeWith((Scriptable) null, nativeArray0);
      nativeArray0.put(1821, (Scriptable) nativeWith0, (Object) null);
      NativeArray.init(nativeWith0, false);
      assertEquals(1822L, nativeArray0.jsGet_length());
      assertEquals(1822L, nativeArray0.getLength());
  }
}

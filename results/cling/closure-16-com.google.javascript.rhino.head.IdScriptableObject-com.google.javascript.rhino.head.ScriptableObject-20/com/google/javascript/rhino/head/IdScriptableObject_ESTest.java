/*

 * Tue Mar 03 18:50:00 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.JavaAdapter;
import com.google.javascript.rhino.head.JavaMembers;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.WrapFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptable((Object) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type object
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeContinuation nativeContinuation1 = (NativeContinuation)ScriptableObject.ensureScriptable(nativeContinuation0);
      assertTrue(nativeContinuation1.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test02()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Object object0 = ScriptableObject.getProperty((Scriptable) importerTopLevel0, 2);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      ScriptableObject.defineConstProperty(importerTopLevel0, "");
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      Class<Object> class0 = Object.class;
      JavaMembers javaMembers0 = new JavaMembers(importerTopLevel0, class0);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      Object object0 = new Object();
      nativeJavaMethod0.defineOwnProperty(context0, object0, importerTopLevel0);
      assertTrue(context0.isGeneratingSource());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      context0.initStandardObjects((ScriptableObject) nativeArray0, false);
      // Undeclared exception!
      try { 
        nativeArray0.exportAsJSClass(1299, nativeArray0, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Array.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-1L));
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeArray0, "JSDOC");
      assertTrue(nativeArray0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeString nativeString0 = new NativeString((CharSequence) null);
      Object[] objectArray0 = new Object[15];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeString0.checkPropertyChange((String) null, nativeArray0, nativeArray0);
      assertTrue(nativeArray0.isEmpty());
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      Class<String> class0 = String.class;
      String string0 = ScriptableObject.getTypedProperty((Scriptable) nativeCall0, (-504), class0);
      assertTrue(nativeCall0.isEmpty());
      assertTrue(nativeCall0.isExtensible());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeString nativeString0 = new NativeString("Continuation");
      importerTopLevel0.defineOwnProperty(context0, "Continuation", nativeString0);
      assertEquals("global", importerTopLevel0.getClassName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = Context.getCurrentContext();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeContinuation0, nativeContinuation0, nativeContinuation0, (Object[]) null);
      assertTrue(nativeContinuation0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        JavaAdapter.createAdapterWrapper(nativeIterator_StopIteration0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("com.google.javascript.rhino.head.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Class<Object> class0 = Object.class;
      JavaMembers javaMembers0 = JavaMembers.lookupClass(importerTopLevel0, class0, class0, false);
      assertNotNull(javaMembers0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      WrapFactory wrapFactory0 = new WrapFactory();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      // Undeclared exception!
      try { 
        wrapFactory0.wrapNewObject(context0, nativeJavaClass0, context0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can't find top level scope for ClassCache.get
         //
         verifyException("com.google.javascript.rhino.head.ClassCache", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.toArray();
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test15()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeString nativeString0 = new NativeString("error reporter");
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeString0, nativeContinuation0, 0);
      importerTopLevel0.defineOwnProperty(context0, context0, scriptableObject0);
      assertTrue(importerTopLevel0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[15];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      ScriptableObject.redefineProperty(nativeArray0, "/=g.;P`VQCedQP~}x&", false);
      assertTrue(nativeArray0.isEmpty());
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeString nativeString0 = new NativeString((CharSequence) null);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeString0, 8);
      assertTrue(nativeString0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      IdFunctionObject idFunctionObject0 = nativeContinuation0.exportAsJSClass(7, scriptable0, false);
      assertEquals(0, idFunctionObject0.getLength());
      assertFalse(idFunctionObject0.isSealed());
      assertEquals(1, idFunctionObject0.methodId());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) nativeContinuation0, "language version", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: language version is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeString nativeString0 = new NativeString((CharSequence) null);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      ClassLoader classLoader0 = context0.getApplicationClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      nativeString0.defineOwnProperties(context0, nativeJavaTopPackage0);
      assertTrue(nativeJavaTopPackage0.isExtensible());
      assertTrue(nativeString0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptableObject("P3]{'d^XPn0");
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type string
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      ScriptableObject.deleteProperty((Scriptable) importerTopLevel0, 4623);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      ScriptableObject.getPropertyIds(nativeCall0);
      assertTrue(nativeCall0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      Class<Object> class0 = Object.class;
      JavaMembers javaMembers0 = new JavaMembers(importerTopLevel0, class0);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      Object[] objectArray0 = new Object[0];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.defineOwnProperty(context0, importerTopLevel0, nativeJavaMethod0);
  }
}

/*

 * Tue Mar 03 18:46:15 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeString;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import java.lang.annotation.Annotation;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        nativeObject0.defineProperty("", class0, 735);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      BaseFunction baseFunction1 = (BaseFunction)ScriptableObject.ensureScriptable(baseFunction0);
      assertTrue(baseFunction1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Object object0 = ScriptableObject.getProperty((Scriptable) importerTopLevel0, 2);
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeCall0, false);
      Object object0 = ScriptableObject.getProperty((Scriptable) nativeGenerator0, "language version");
      boolean boolean0 = nativeGenerator0.sameValue(object0, object0);
      assertTrue(nativeGenerator0.isEmpty());
      assertTrue(nativeGenerator0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      ScriptableObject.defineConstProperty(baseFunction0, "language version");
      assertFalse(baseFunction0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Object object0 = importerTopLevel0.get("", (Scriptable) baseFunction0);
      ScriptableObject.putConstProperty(baseFunction0, "", object0);
      assertFalse(baseFunction0.isEmpty());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test06()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      baseFunction0.defineOwnProperty(context0, context0, importerTopLevel0);
      assertEquals(12, Context.FEATURE_WARNING_AS_ERROR);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      Context context0 = Context.getCurrentContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects((ScriptableObject) nativeError0, true);
      // Undeclared exception!
      try { 
        nativeError0.exportAsJSClass(1348, scriptableObject0, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Error.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) baseFunction0, (-4933));
      assertTrue(baseFunction0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeObject0, "= ");
      assertTrue(boolean0);
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "z";
      Class<Object> class0 = Object.class;
      // Undeclared exception!
      try { 
        nativeContinuation0.defineFunctionProperties(stringArray0, class0, 0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \"z\" not found in \"java.lang.Object\".
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isFalse((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Class<Annotation> class0 = Annotation.class;
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass(scriptableObject0, class0);
      assertEquals("JavaClass", nativeJavaClass0.getClassName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      ScriptableObject.getTopScopeValue(baseFunction0, baseFunction0);
      assertTrue(baseFunction0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      Object object0 = NativeIterator.getStopIterationObject(scriptable0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.toArray();
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = new Context();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeContinuation0, nativeContinuation0, nativeContinuation0, (Object[]) null);
      Class<Integer> class0 = Integer.class;
      ScriptableObject.getTypedProperty((Scriptable) boundFunction0, 212, class0);
      assertTrue(nativeContinuation0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(topLevel0, topLevel0, 52);
      Context context0 = new Context();
      topLevel0.defineOwnProperty(context0, "", scriptableObject0);
      assertEquals(130, Context.VERSION_1_3);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      ScriptableObject.redefineProperty(baseFunction0, "language version", false);
      assertTrue(baseFunction0.isEmpty());
      assertTrue(baseFunction0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage(true, "RKFTV\"iT0,}V#", (ClassLoader) null);
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeJavaPackage0, 1);
      assertFalse(boolean0);
      assertTrue(nativeJavaPackage0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber(4);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      boolean boolean0 = nativeNumber0.isGenericDescriptor(nativeContinuation0);
      assertTrue(boolean0);
      assertTrue(nativeContinuation0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeError.init(scriptable0, true);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test22()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      importerTopLevel0.defineOwnProperty(context0, "Error", nativeError0);
      assertEquals("object", importerTopLevel0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeString nativeString0 = new NativeString("");
      BaseFunction baseFunction0 = new BaseFunction(nativeString0, nativeString0);
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) baseFunction0, "error reporter", (Object[]) null);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: error reporter is not a function, it is function.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Class<Object> class0 = Object.class;
      Object object0 = ScriptableObject.getTypedProperty((Scriptable) nativeContinuation0, "language version", class0);
      assertNull(object0);
      assertTrue(nativeContinuation0.isExtensible());
      assertTrue(nativeContinuation0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      Context context0 = new Context();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeContinuation0, nativeContinuation0, nativeContinuation0, (Object[]) null);
      boundFunction0.defineOwnProperties(context0, nativeContinuation0);
      assertEquals(1, Context.FEATURE_NON_ECMA_GET_YEAR);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeGenerator nativeGenerator0 = NativeGenerator.init((ScriptableObject) null, true);
      boolean boolean0 = nativeGenerator0.sameValue(context0, context0);
      assertTrue(boolean0);
      assertTrue(nativeGenerator0.isEmpty());
      assertTrue(nativeGenerator0.isExtensible());
      assertTrue(nativeGenerator0.isSealed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptableObject(context0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type com.google.javascript.rhino.head.Context
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ScriptableObject scriptableObject0 = ScriptableObject.ensureScriptableObject(nativeContinuation0);
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = ScriptableObject.getPropertyIds(baseFunction0);
      assertEquals(0, objectArray0.length);
      assertTrue(baseFunction0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      Class<Object> class0 = Object.class;
      IdFunctionObject idFunctionObject0 = (IdFunctionObject)ScriptableObject.getTypedProperty((Scriptable) importerTopLevel0, "constructor", class0);
      assertNotNull(idFunctionObject0);
      assertTrue(idFunctionObject0.isSealed());
      assertEquals("Object", idFunctionObject0.getFunctionName());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        nativeObject0.defineProperty("2Y`-o%Qj0xv6~o~g<g1", class0, (-415));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -415
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }
}

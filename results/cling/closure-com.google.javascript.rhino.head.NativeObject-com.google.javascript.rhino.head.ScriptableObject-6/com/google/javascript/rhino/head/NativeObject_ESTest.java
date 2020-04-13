/*

 * Tue Mar 03 18:54:11 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Callable;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.FunctionObject;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.LazilyLoadedCtor;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import java.lang.reflect.Method;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeObject_ESTest extends NativeObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  @Ignore
  public void test00()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn(nativeObject0).when(context0).initStandardObjects(any(com.google.javascript.rhino.head.ScriptableObject.class) , anyBoolean());
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Class<ImporterTopLevel> class0 = ImporterTopLevel.class;
      String string0 = ScriptableObject.defineClass((Scriptable) importerTopLevel0, class0, false, false);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<TopLevel> class0 = TopLevel.class;
      String string0 = ScriptableObject.defineClass((Scriptable) nativeObject0, class0, false, false);
      assertEquals("global", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeObject0.defineProperty("valueOf", (Object) null, (Method) null, (Method) null, (-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test03()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<FunctionObject> class0 = FunctionObject.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) nativeObject0, class0, false, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.FunctionObject\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = ScriptableObject.isFalse(nativeIterator_StopIteration0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(0).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.execIdCall(idFunctionObject0, context0, (Scriptable) null, (Scriptable) null, (Object[]) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 0
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      boolean boolean0 = nativeObject0.sameValue(context0, context0);
      assertTrue(nativeObject0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("writable");
      NativeJavaPackage nativeJavaPackage1 = nativeJavaPackage0.forcePackage("*(6cZ)z !+", nativeObject0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      // Undeclared exception!
      try { 
        importerTopLevel0.checkPropertyDefinition(nativeJavaPackage1);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: [JavaPackage writable.*(6cZ)z !+.get] is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      String[] stringArray0 = new String[9];
      stringArray0[0] = "writable";
      Class<FunctionObject> class0 = FunctionObject.class;
      // Undeclared exception!
      try { 
        nativeObject0.defineFunctionProperties(stringArray0, class0, (-1904));
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \"writable\" not found in \"com.google.javascript.rhino.head.FunctionObject\".
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isFalse((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeJavaClass> class0 = NativeJavaClass.class;
      // Undeclared exception!
      try { 
        ScriptableObject.buildClassCtor((Scriptable) nativeObject0, class0, false, false);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Unsupported parameter type \"java.lang.Class\" in method \"com.google.javascript.rhino.head.NativeJavaClass\".
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("xrUA&@Rr ", classLoader0);
      ScriptableObject.putConstProperty(nativeJavaPackage0, "xrUA&@Rr ", classLoader0);
      // Undeclared exception!
      try { 
        nativeJavaPackage0.defineOwnProperties((Context) null, nativeJavaPackage0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type sun.misc.Launcher$AppClassLoader
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("xrUA&@Rr ", classLoader0);
      nativeJavaPackage0.defineOwnProperties((Context) null, nativeJavaPackage0);
      assertTrue(nativeJavaPackage0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeObject nativeObject0 = new NativeObject();
      IdFunctionObject idFunctionObject0 = nativeObject0.exportAsJSClass(308, importerTopLevel0, false);
      // Undeclared exception!
      try { 
        nativeObject0.execIdCall(idFunctionObject0, context0, idFunctionObject0, importerTopLevel0, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      NativeNumber nativeNumber0 = new NativeNumber(4);
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeJavaTopPackage0.getOwnPropertyDescriptor(context0, nativeNumber0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeObject0.defineOwnProperty(context0, "isFrozen", importerTopLevel0);
      assertEquals(2, ScriptableObject.DONTENUM);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(importerTopLevel0, "language version", "error reporter", false, true);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.addLazilyInitializedValue("error reporter", 13, lazilyLoadedCtor0, 37);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // error reporter
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeGenerator> class0 = NativeGenerator.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) nativeObject0, (Class<?>) class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeGenerator
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      assertFalse(nativeObject0.isSealed());
      
      Class<BaseFunction> class0 = BaseFunction.class;
      BaseFunction baseFunction0 = ScriptableObject.buildClassCtor((Scriptable) nativeObject0, class0, true, true);
      assertTrue(nativeObject0.isEmpty());
      assertTrue(baseFunction0.isEmpty());
      assertTrue(baseFunction0.isSealed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      ScriptableObject.getPropertyIds(importerTopLevel0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("writable");
      NativeJavaPackage nativeJavaPackage1 = nativeJavaPackage0.forcePackage("*(6cZ)z !+", nativeObject0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeJavaPackage1, (Callable) null, nativeObject0, (Object[]) null);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(3, importerTopLevel0, true);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.fillConstructorProperties(idFunctionObject0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: getPrototypeOf.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeCall nativeCall0 = new NativeCall();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeCall0.checkPropertyChange("toString", nativeIterator_StopIteration0, nativeIterator_StopIteration0);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }
}

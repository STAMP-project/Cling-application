/*

 * Tue Mar 03 18:53:43 GMT 2020
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
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.JavaMembers;
import com.google.javascript.rhino.head.LazilyLoadedCtor;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeError;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.NativeWith;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeObject_ESTest extends NativeObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeJavaClass> class0 = NativeJavaClass.class;
      // Undeclared exception!
      try { 
        nativeObject0.defineProperty("preventExtensions", class0, 62);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 63
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test01()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<Synchronizer> class0 = Synchronizer.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) nativeIterator_StopIteration0, class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.Synchronizer\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      importerTopLevel0.sealObject();
      assertFalse(importerTopLevel0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      boolean boolean0 = importerTopLevel0.sameValue(nativeObject0, 4);
      assertFalse(boolean0);
      assertTrue(importerTopLevel0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Short short0 = new Short((short) (-39));
      Double double0 = new Double(1);
      boolean boolean0 = importerTopLevel0.sameValue(short0, double0);
      assertTrue(importerTopLevel0.isExtensible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      IdFunctionObject idFunctionObject0 = mock(IdFunctionObject.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(idFunctionObject0).hasTag(any());
      doReturn(0).when(idFunctionObject0).methodId();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        nativeObject0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, (Object[]) null);
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
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      boolean boolean0 = importerTopLevel0.sameValue(nativeObject0, nativeObject0);
      assertTrue(boolean0);
      assertTrue(importerTopLevel0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test07()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("JUa^,nP{e`Q]J(cg");
      Context context0 = Context.enter((Context) null);
      // Undeclared exception!
      try { 
        nativeJavaPackage0.getOwnPropertyDescriptor(context0, nativeObject0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isTrue((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(2, nativeError0, true);
      nativeIterator_StopIteration0.initPrototypeConstructor(idFunctionObject0);
      assertTrue(nativeIterator_StopIteration0.isSealed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      Context context0 = Context.getContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<BaseFunction> class0 = BaseFunction.class;
      ScriptableObject.defineClass((Scriptable) nativeObject0, class0, true, false);
      assertFalse(nativeObject0.isEmpty());
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test12()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeObject.KeySet nativeObject_KeySet0 = nativeObject0.new KeySet();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeObject0, nativeObject_KeySet0, 2277);
      // Undeclared exception!
      try { 
        nativeObject0.defineOwnProperties(context0, scriptableObject0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type com.google.javascript.rhino.head.NativeObject$KeySet
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = new Context(contextFactory0);
      nativeObject0.defineOwnProperties(context0, nativeObject0);
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(8, nativeError0, true);
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeError0, (Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        nativeObject0.getDefaultValue(class0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = Context.getContext();
      NativeNumber nativeNumber0 = new NativeNumber(1);
      nativeObject0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) nativeNumber0, true);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Object object0 = new Object();
      nativeObject0.equivalentValues(object0);
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, false);
      nativeIterator_StopIteration0.checkPropertyDefinition(importerTopLevel0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeObject0, "-*6T,}[`sA~OEVc6", "message", true, false);
      // Undeclared exception!
      try { 
        nativeObject0.addLazilyInitializedValue("-*6T,}[`sA~OEVc6", 108957, lazilyLoadedCtor0, 108957);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -*6T,}[`sA~OEVc6
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeContinuation> class0 = NativeContinuation.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) nativeObject0, (Class<?>) class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeContinuation
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      Class<BaseFunction> class0 = BaseFunction.class;
      String string0 = ScriptableObject.defineClass((Scriptable) topLevel0, class0, true, true);
      assertEquals("Function", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      nativeObject0.exportAsJSClass(120, (Scriptable) null, false);
      NativeObject.KeySet nativeObject_KeySet0 = nativeObject0.new KeySet();
      // Undeclared exception!
      try { 
        nativeObject_KeySet0.iterator();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = Context.getContext();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeObject0, (Callable) null, (Scriptable) null, (Object[]) null);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      nativeObject0.sealObject();
      // Undeclared exception!
      try { 
        nativeObject0.remove((Object) 2);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: 2.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeError nativeError0 = new NativeError();
      NativeObject nativeObject0 = new NativeObject();
      nativeObject0.checkPropertyChange("NEG", nativeError0, nativeError0);
      assertTrue(nativeObject0.isExtensible());
      assertTrue(nativeError0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<Delegator> class0 = Delegator.class;
      JavaMembers javaMembers0 = new JavaMembers(nativeObject0, class0, false);
      NativeJavaMethod nativeJavaMethod0 = javaMembers0.ctors;
      NativeWith nativeWith0 = new NativeWith(nativeJavaMethod0, nativeJavaMethod0);
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeObject0, nativeWith0, 50);
      nativeObject0.checkPropertyChange("Yp;s?1/9:", scriptableObject0, nativeJavaMethod0);
      assertTrue(nativeObject0.isEmpty());
  }
}

/*

 * Tue Mar 03 20:03:53 GMT 2020
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
import com.google.javascript.rhino.head.Delegator;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaObject;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeNumber;
import com.google.javascript.rhino.head.Ref;
import com.google.javascript.rhino.head.ScriptRuntime;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class ScriptRuntime_ESTest extends ScriptRuntime_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      long long0 = ScriptRuntime.testUint32String("com.google.javascript.rhino.head.InterpretedFunction");
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      context0.initStandardObjects();
      long long0 = ScriptRuntime.testUint32String("__parent__");
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enter();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeContinuation0, nativeContinuation0, nativeContinuation0, (Object[]) null);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.enumInit((Object) context0, context0, true);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Class<NativeJavaTopPackage> class0 = NativeJavaTopPackage.class;
      ClassLoader classLoader0 = mock(ClassLoader.class, new ViolatedAssumptionAnswer());
      doReturn((Class) null).when(classLoader0).loadClass(anyString());
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      // Undeclared exception!
      try { 
        ScriptRuntime.enumInit((Object) nativeJavaTopPackage0, (Context) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.setObjectIndex((Object) nativeJavaClass0, 0.0, (Object) nativeJavaClass0, context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeJavaObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeJavaObject nativeJavaObject0 = new NativeJavaObject();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        ScriptRuntime.setObjectIndex((Object) nativeJavaObject0, (-69.51242), (Object) nativeJavaObject0, context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeJavaObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyInt() , any(com.google.javascript.rhino.head.Scriptable.class));
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.getObjectIndex(scriptable0, 690, context0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.enumInit((Object) topLevel0, context0, 13);
      Ref ref0 = mock(Ref.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(ref0).get(any(com.google.javascript.rhino.head.Context.class));
      doReturn((Object) null).when(ref0).set(any(com.google.javascript.rhino.head.Context.class) , any());
      Object object0 = ScriptRuntime.refIncrDecr(ref0, (Context) null, 6);
      assertEquals(0.0, object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test09()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      // Undeclared exception!
      try { 
        ScriptRuntime.getCallable(scriptableObject0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: [object Object] is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(nativeJavaTopPackage0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn(nativeJavaTopPackage0).when(scriptable0).getParentScope();
      NativeJavaTopPackage nativeJavaTopPackage1 = (NativeJavaTopPackage)ScriptRuntime.name(context0, scriptable0, "");
      assertTrue(nativeJavaTopPackage1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null).when(scriptable0).getParentScope();
      Object object0 = ScriptRuntime.name(context0, scriptable0, "");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object object0 = ScriptRuntime.getIndexObject("c.1je\"x-0@!Hj");
      assertEquals("c.1je\"x-0@!Hj", object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      boolean boolean0 = ScriptRuntime.isJSWhitespaceOrLineTerminator(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.storeUint32Result(context0, 7);
      Ref ref0 = mock(Ref.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(ref0).get(any(com.google.javascript.rhino.head.Context.class));
      doReturn((Object) null).when(ref0).set(any(com.google.javascript.rhino.head.Context.class) , any());
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.refIncrDecr(ref0, context1, (-507));
      assertNotNull(object0);
      assertEquals((-1.0), object0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      assertFalse(nativeJavaTopPackage0.isSealed());
      
      Context context0 = Context.getCurrentContext();
      Object object0 = ScriptRuntime.delete((Object) nativeJavaTopPackage0, (Object) nativeJavaTopPackage0, context0, false);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn(false).when(scriptable0).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Scriptable scriptable1 = ScriptRuntime.bind(context0, scriptable0, "");
      assertNull(scriptable1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      Object object0 = new Object();
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn(object0).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.nameIncrDecr(scriptable0, "/)f", context0, (-59));
      Scriptable scriptable1 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable1).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      Context context1 = mock(Context.class, new ViolatedAssumptionAnswer());
      ScriptRuntime.getObjectElem(scriptable1, objectArray0[1], context1);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).getDefaultValue(nullable(java.lang.Class.class));
      ScriptRuntime.toNumber((Object) scriptable0);
      Scriptable scriptable1 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable1).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      // Undeclared exception!
      try { 
        ScriptRuntime.getExistingCtor((Context) null, scriptable1, "language version");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // \"language version\" is not a constructor.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeNumber nativeNumber0 = new NativeNumber(0);
      // Undeclared exception!
      try { 
        ScriptRuntime.toCharSequence(nativeNumber0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).getDefaultValue(nullable(java.lang.Class.class));
      ScriptRuntime.toNumber((Object) scriptable0);
      Scriptable scriptable1 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null).when(scriptable1).getPrototype();
      doReturn(false).when(scriptable1).has(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((String) null).when(scriptable1).toString();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.setConst(scriptable1, scriptable1, context0, "language version");
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test21()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TopLevel topLevel0 = new TopLevel();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      Object object0 = ScriptRuntime.enumInit((Object) topLevel0, context0, 13);
      Context context1 = new Context();
      ScriptRuntime.strictSetName(topLevel0, object0, context1, topLevel0, "ygP~`Bk");
      assertFalse(topLevel0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Class<NativeContinuation> class0 = NativeContinuation.class;
      Object object0 = ScriptRuntime.toPrimitive((Object) null, class0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test24()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptRuntime.toBoolean(nativeIterator_StopIteration0);
      // Undeclared exception!
      try { 
        ScriptRuntime.getCallable(scriptableObject0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: [object Object] is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.makeContext();
      ScriptableObject scriptableObject0 = context0.initStandardObjects();
      Delegator delegator0 = new Delegator(scriptableObject0);
      Object[] objectArray0 = delegator0.getIds();
      assertEquals(0, objectArray0.length);
  }
}

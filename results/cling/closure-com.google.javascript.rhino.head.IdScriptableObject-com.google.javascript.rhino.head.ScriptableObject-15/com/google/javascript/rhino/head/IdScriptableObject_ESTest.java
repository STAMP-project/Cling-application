/*

 * Tue Mar 03 18:47:06 GMT 2020
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
import com.google.javascript.rhino.head.IdScriptableObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeCall;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeDate;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeJavaTopPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class IdScriptableObject_ESTest extends IdScriptableObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<IdScriptableObject> class0 = IdScriptableObject.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineProperty("", class0, 10);
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
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptable(">hAm");
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type string
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      NativeContinuation nativeContinuation1 = (NativeContinuation)ScriptableObject.ensureScriptable(nativeContinuation0);
      assertTrue(nativeContinuation1.isExtensible());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Object;
      Scriptable scriptable0 = importerTopLevel0.getBuiltinPrototype(topLevel_Builtins0);
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      BoundFunction boundFunction0 = new BoundFunction(context0, scriptable0, nativeContinuation0, scriptable0, (Object[]) null);
      assertFalse(boundFunction0.isSealed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test04()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaTopPackage nativeJavaTopPackage0 = new NativeJavaTopPackage(classLoader0);
      // Undeclared exception!
      try { 
        ScriptableObject.putProperty((Scriptable) nativeJavaTopPackage0, (-3143), (Object) context0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Java package names may not be numbers.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test05()  throws Throwable  {
      ScriptableObject scriptableObject0 = mock(ScriptableObject.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptableObject0).associateValue(any() , any());
      doReturn((Object) null).when(scriptableObject0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null).when(scriptableObject0).getParentScope();
      doReturn((String) null, (String) null).when(scriptableObject0).toString();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(scriptableObject0, false);
      boolean boolean0 = ScriptableObject.deleteProperty((Scriptable) nativeGenerator0, ":My");
      assertTrue(boolean0);
      assertTrue(nativeGenerator0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = mock(Context.class, new ViolatedAssumptionAnswer());
      doReturn("Q#jZudF", "").when(context0).toString();
      nativeArray0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) baseFunction0, false);
      assertFalse(baseFunction0.isSealed());
      assertTrue(baseFunction0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Integer integer0 = new Integer(0);
      boolean boolean0 = ScriptableObject.isFalse(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test08()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = ScriptableObject.isFalse(nativeIterator_StopIteration0);
      assertFalse(boolean0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Class<String> class0 = String.class;
      String string0 = ScriptableObject.getTypedProperty((Scriptable) nativeIterator_StopIteration0, 4, class0);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test10()  throws Throwable  {
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.getContext();
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(baseFunction0, baseFunction0, 6);
      baseFunction0.defineOwnProperty(context0, context0, scriptableObject0);
      assertEquals(110, Context.VERSION_1_1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      IdFunctionObject idFunctionObject0 = nativeObject0.exportAsJSClass(13, importerTopLevel0, false);
      ScriptableObject.getTopScopeValue(idFunctionObject0, (Object) null);
      assertEquals(1, idFunctionObject0.getArity());
      assertEquals(1, idFunctionObject0.getLength());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((Scriptable) null).when(scriptable0).getPrototype();
      doReturn((String) null, (String) null).when(scriptable0).toString();
      Object object0 = NativeIterator.getStopIterationObject(scriptable0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[6];
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      nativeArray0.toArray(objectArray0);
      assertTrue(nativeArray0.isExtensible());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test14()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      ScriptableObject scriptableObject0 = ScriptableObject.buildDataDescriptor(nativeIterator_StopIteration0, contextFactory0, 8);
      importerTopLevel0.defineOwnProperty((Context) null, "dplicate.defieClass.name", scriptableObject0);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject.redefineProperty(nativeIterator_StopIteration0, "", false);
      assertTrue(nativeIterator_StopIteration0.isEmpty());
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ClassLoader classLoader0 = ClassLoader.getSystemClassLoader();
      NativeJavaPackage nativeJavaPackage0 = new NativeJavaPackage("P;h-L;`Q-c;C1s&P", classLoader0);
      boolean boolean0 = ScriptableObject.hasProperty((Scriptable) nativeJavaPackage0, 26);
      assertTrue(nativeJavaPackage0.isExtensible());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Scriptable scriptable0 = mock(Scriptable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(scriptable0).get(anyString() , any(com.google.javascript.rhino.head.Scriptable.class));
      doReturn((Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null, (Scriptable) null).when(scriptable0).getParentScope();
      doReturn((String) null, (String) null, (String) null, (String) null, (String) null).when(scriptable0).toString();
      NativeDate.init(scriptable0, true);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.enterContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0, true);
      Object object0 = importerTopLevel0.get("Changing attributes not supported for ", (Scriptable) nativeObject0);
      assertNotNull(object0);
      
      IdFunctionObject idFunctionObject0 = nativeObject0.exportAsJSClass(13, importerTopLevel0, false);
      idFunctionObject0.defineOwnProperty((Context) null, object0, importerTopLevel0);
      assertEquals(1, idFunctionObject0.getArity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test19()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeIterator_StopIteration0, true);
      // Undeclared exception!
      try { 
        nativeGenerator0.delete("msg.invalid.type");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: msg.invalid.type.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test20()  throws Throwable  {
      NativeArray nativeArray0 = new NativeArray((-2379L));
      NativeGenerator nativeGenerator0 = NativeGenerator.init(nativeArray0, true);
      // Undeclared exception!
      try { 
        nativeGenerator0.setAttributes(8, (Scriptable) nativeArray0, 13);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: 8.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      TopLevel topLevel0 = new TopLevel();
      // Undeclared exception!
      try { 
        ScriptableObject.callMethod((Scriptable) topLevel0, "", objectArray0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError:  is not a function, it is object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<IdScriptableObject> class0 = IdScriptableObject.class;
      ScriptableObject.getTypedProperty((Scriptable) nativeObject0, "", class0);
      assertTrue(nativeObject0.isEmpty());
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = contextFactory0.enterContext();
      NativeCall nativeCall0 = new NativeCall();
      nativeIterator_StopIteration0.defineOwnProperties(context0, nativeCall0);
      assertTrue(nativeCall0.isExtensible());
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScriptableObject.ensureScriptableObject("`Jiorc;1V");
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Expected argument of type object, but instead had type string
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ScriptableObject scriptableObject0 = ScriptableObject.ensureScriptableObject(nativeIterator_StopIteration0);
      assertTrue(scriptableObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      TopLevel topLevel0 = new TopLevel();
      NativeArray nativeArray0 = new NativeArray(objectArray0);
      IdFunctionObject idFunctionObject0 = nativeArray0.exportAsJSClass(40, topLevel0, true);
      idFunctionObject0.exportAsJSClass(1, topLevel0, true);
      assertTrue(nativeArray0.isSealed());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test27()  throws Throwable  {
      ContextFactory contextFactory0 = new ContextFactory();
      Context context0 = contextFactory0.makeContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Class<Integer> class0 = Integer.class;
      importerTopLevel0.getDefaultValue(class0);
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      Context context0 = new Context();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        importerTopLevel0.defineProperty("error reporter", class0, 1073741824);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 1073741825
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }
}

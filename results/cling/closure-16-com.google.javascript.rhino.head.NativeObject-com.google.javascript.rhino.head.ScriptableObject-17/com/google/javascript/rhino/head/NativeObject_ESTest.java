/*

 * Tue Mar 03 18:53:20 GMT 2020
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.BaseFunction;
import com.google.javascript.rhino.head.BoundFunction;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.ContextFactory;
import com.google.javascript.rhino.head.EcmaError;
import com.google.javascript.rhino.head.EvaluatorException;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.LazilyLoadedCtor;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.NativeGenerator;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaClass;
import com.google.javascript.rhino.head.NativeJavaPackage;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeObject_ESTest extends NativeObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<ImporterTopLevel> class0 = ImporterTopLevel.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) nativeObject0, class0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeJavaPackage> class0 = NativeJavaPackage.class;
      // Undeclared exception!
      try { 
        nativeObject0.defineProperty("StopIteration", class0, (-3185));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -3185
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeGenerator> class0 = NativeGenerator.class;
      // Undeclared exception!
      try { 
        ScriptableObject.defineClass((Scriptable) nativeObject0, class0, true);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot load class \"com.google.javascript.rhino.head.NativeGenerator\" which has no zero-parameter constructor.
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      NativeObject nativeObject0 = new NativeObject();
      Long long0 = Long.valueOf((long) 2);
      boolean boolean0 = nativeObject0.sameValue(importerTopLevel0, long0);
      assertFalse(boolean0);
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = nativeObject0.sameValue(nativeIterator_StopIteration0, nativeIterator_StopIteration0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Double double0 = new Double(3821.4699188189);
      boolean boolean0 = nativeIterator_StopIteration0.sameValue(double0, double0);
      assertTrue(boolean0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Object[] objectArray0 = nativeObject0.getAllIds();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(4, nativeObject0, false);
      Context context0 = Context.getCurrentContext();
      nativeIterator_StopIteration0.execIdCall(idFunctionObject0, context0, idFunctionObject0, nativeObject0, objectArray0);
      assertEquals(1, idFunctionObject0.getArity());
      assertEquals(1, idFunctionObject0.getLength());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      String[] stringArray0 = new String[5];
      stringArray0[0] = "[i.cy;]gGJS&[e0D1s!";
      Class<Integer> class0 = Integer.class;
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.defineFunctionProperties(stringArray0, class0, 2);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Method \"[i.cy;]gGJS&[e0D1s!\" not found in \"java.lang.Integer\".
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeObject0, "Object", 8, "Object", 34, nativeObject0);
      ContextFactory contextFactory0 = ContextFactory.getGlobal();
      Context context0 = new Context(contextFactory0);
      Object object0 = nativeObject0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, (Object[]) null);
      assertEquals("({})", object0);
      assertTrue(idFunctionObject0.isExtensible());
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Double double0 = new Double(0.0);
      boolean boolean0 = nativeIterator_StopIteration0.sameValue(double0, double0);
      assertTrue(boolean0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        ScriptableObject.isFalse(nativeObject0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = ScriptableObject.isFalse((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      Class<String> class0 = String.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) importerTopLevel0, (Class<?>) class0);
        fail("Expecting exception: EcmaError");
      
      } catch(EcmaError e) {
         //
         // TypeError: Cannot find default value for object.
         //
         verifyException("com.google.javascript.rhino.head.ScriptRuntime", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = Context.getCurrentContext();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      nativeObject0.defineOwnProperty(context0, (Object) context0, (ScriptableObject) importerTopLevel0, true);
      assertFalse(importerTopLevel0.isSealed());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.equivalentValues(nativeIterator_StopIteration0);
      assertTrue(nativeIterator_StopIteration0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Set<Object> set0 = nativeObject0.keySet();
      nativeObject0.equivalentValues(set0);
      assertTrue(nativeObject0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      importerTopLevel0.checkPropertyDefinition(nativeObject0);
      assertTrue(importerTopLevel0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(importerTopLevel0, "language version", "language version", true);
      // Undeclared exception!
      try { 
        importerTopLevel0.addLazilyInitializedValue("DEBUGGER", 199, lazilyLoadedCtor0, 5);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // DEBUGGER
         //
         verifyException("com.google.javascript.rhino.head.ScriptableObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        Context.getContext();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No Context associated with current Thread
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<NativeArray> class0 = NativeArray.class;
      // Undeclared exception!
      try { 
        ScriptableObject.getDefaultValue((Scriptable) nativeObject0, (Class<?>) class0);
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Invalid JavaScript value of type class com.google.javascript.rhino.head.NativeArray
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Class<BaseFunction> class0 = BaseFunction.class;
      BaseFunction baseFunction0 = ScriptableObject.buildClassCtor((Scriptable) nativeObject0, class0, false, true);
      assertTrue(nativeObject0.isEmpty());
      assertTrue(baseFunction0.isExtensible());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      nativeIterator_StopIteration0.exportAsJSClass(345, nativeObject0, false);
      NativeObject.ValueCollection nativeObject_ValueCollection0 = nativeIterator_StopIteration0.new ValueCollection();
      // Undeclared exception!
      try { 
        nativeObject_ValueCollection0.iterator();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = new Context();
      NativeJavaClass nativeJavaClass0 = new NativeJavaClass();
      BoundFunction boundFunction0 = new BoundFunction(context0, nativeObject0, nativeJavaClass0, nativeObject0, (Object[]) null);
      assertTrue(nativeObject0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      nativeObject0.exportAsJSClass(2, importerTopLevel0, true);
      // Undeclared exception!
      try { 
        nativeObject0.remove((Object) "Object");
        fail("Expecting exception: EvaluatorException");
      
      } catch(EvaluatorException e) {
         //
         // Cannot modify a property of a sealed object: Object.
         //
         verifyException("com.google.javascript.rhino.head.Context", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      nativeIterator_StopIteration0.checkPropertyChange("X+Mqg?:IFB", nativeContinuation0, nativeContinuation0);
      assertTrue(nativeContinuation0.isExtensible());
      assertTrue(nativeContinuation0.isEmpty());
  }
}

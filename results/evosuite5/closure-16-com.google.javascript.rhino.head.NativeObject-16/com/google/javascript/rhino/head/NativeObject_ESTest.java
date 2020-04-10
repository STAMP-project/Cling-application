/*
 * This file was automatically generated by EvoSuite
 * Tue Aug 20 14:44:42 GMT 2019
 */

package com.google.javascript.rhino.head;

import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.javascript.rhino.head.Context;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.ImporterTopLevel;
import com.google.javascript.rhino.head.LazilyLoadedCtor;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeBoolean;
import com.google.javascript.rhino.head.NativeIterator;
import com.google.javascript.rhino.head.NativeJavaMethod;
import com.google.javascript.rhino.head.NativeObject;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.ScriptableObject;
import com.google.javascript.rhino.head.TopLevel;
import java.util.Iterator;
import java.util.Set;
import java.util.function.BiConsumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class NativeObject_ESTest extends NativeObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      int int0 = nativeIterator_StopIteration0.findPrototypeId("__defineGetter__");
      assertEquals(9, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      int int0 = nativeIterator_StopIteration0.findPrototypeId("language version");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      int int0 = nativeObject0.findPrototypeId("\"qdNQ]cv/w}!~T^.");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      int int0 = nativeObject0.findPrototypeId("error reporter");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      int int0 = nativeIterator_StopIteration0.findPrototypeId("s[LQ6l:DuT:lDvPMWK");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      int int0 = nativeObject0.findPrototypeId("vUWwt^a`e~['Y2+c3");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      int int0 = nativeIterator_StopIteration0.findPrototypeId("__lookup>tter__");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      int int0 = nativeIterator_StopIteration0.findPrototypeId("function ");
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Object object0 = nativeObject0.remove((Object) null);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Object object0 = nativeIterator_StopIteration0.remove((Object) "jB$Y1tJ5;|0");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Long long0 = new Long(351L);
      Object object0 = nativeObject0.remove((Object) long0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeIterator_StopIteration0, "error reporter", "2iYeOo(RM2V<7&q", true, true);
      nativeIterator_StopIteration0.addLazilyInitializedValue((String) null, (-1), lazilyLoadedCtor0, 0);
      boolean boolean0 = nativeIterator_StopIteration0.containsValue((Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Short short0 = new Short((short)27356);
      boolean boolean0 = nativeIterator_StopIteration0.containsKey(short0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      boolean boolean0 = nativeIterator_StopIteration0.containsKey("HiQVE]qEkP");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = new Context();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(9, nativeIterator_StopIteration0, false);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) idFunctionObject0;
      IdFunctionObject idFunctionObject1 = (IdFunctionObject)nativeIterator_StopIteration0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, objectArray0);
      assertEquals(1, idFunctionObject1.getLength());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Context context0 = new Context();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(9, nativeIterator_StopIteration0, false);
      Object[] objectArray0 = new Object[1];
      nativeIterator_StopIteration0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, objectArray0);
      assertEquals(1, idFunctionObject0.getLength());
      assertEquals(1, idFunctionObject0.getArity());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeBoolean nativeBoolean0 = new NativeBoolean(false);
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeBoolean0, "Object", 160, "language version", 140, nativeBoolean0);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.execIdCall(idFunctionObject0, context0, (Scriptable) null, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 160
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test17()  throws Throwable  {
      Context context0 = new Context();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(9, nativeIterator_StopIteration0, false);
      idFunctionObject0.defineOwnProperty(context0, (Object) nativeIterator_StopIteration0, (ScriptableObject) nativeIterator_StopIteration0, false);
      assertEquals(1, idFunctionObject0.getArity());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Context context0 = new Context();
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      IdFunctionObject idFunctionObject0 = nativeIterator_StopIteration0.exportAsJSClass(9, nativeIterator_StopIteration0, false);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel();
      nativeIterator_StopIteration0.exportAsJSClass(110, importerTopLevel0, false);
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.containsValue(importerTopLevel0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 13
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.put((Object) nativeIterator_StopIteration0, (Object) nativeIterator_StopIteration0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      // Undeclared exception!
      try { 
        nativeIterator_StopIteration0.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Context context0 = Context.getCurrentContext();
      IdFunctionObject idFunctionObject0 = new IdFunctionObject(nativeObject0, context0, 8, 12);
      // Undeclared exception!
      try { 
        nativeObject0.execIdCall(idFunctionObject0, context0, idFunctionObject0, idFunctionObject0, context0.emptyArgs);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // BAD FUNCTION ID=8 MASTER=[object Object]
         //
         verifyException("com.google.javascript.rhino.head.IdFunctionObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      // Undeclared exception!
      try { 
        nativeObject0.putAll(nativeObject0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.NativeObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Context context0 = Context.enter();
      ImporterTopLevel importerTopLevel0 = new ImporterTopLevel(context0);
      TopLevel.Builtins topLevel_Builtins0 = TopLevel.Builtins.Function;
      IdFunctionObject idFunctionObject0 = (IdFunctionObject)importerTopLevel0.getBuiltinCtor(topLevel_Builtins0);
      idFunctionObject0.defineOwnProperty(context0, (Object) idFunctionObject0, (ScriptableObject) idFunctionObject0, true);
      assertEquals(1, idFunctionObject0.getLength());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      LazilyLoadedCtor lazilyLoadedCtor0 = new LazilyLoadedCtor(nativeIterator_StopIteration0, "error reporter", "", true, true);
      nativeIterator_StopIteration0.addLazilyInitializedValue((String) null, (-1), lazilyLoadedCtor0, 0);
      boolean boolean0 = nativeIterator_StopIteration0.containsValue(170);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NativeObject nativeObject0 = new NativeObject();
      Long long0 = new Long(150);
      nativeObject0.defaultPut("c[.`agBZRTa", long0);
      BiConsumer<NativeArray, NativeJavaMethod> biConsumer0 = (BiConsumer<NativeArray, NativeJavaMethod>) mock(BiConsumer.class, new ViolatedAssumptionAnswer());
      nativeObject0.forEach(biConsumer0);
      assertEquals(13, ScriptableObject.CONST);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeObject.KeySet nativeObject_KeySet0 = nativeIterator_StopIteration0.new KeySet();
      Iterator<Object> iterator0 = nativeObject_KeySet0.iterator();
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeObject.EntrySet nativeObject_EntrySet0 = nativeIterator_StopIteration0.new EntrySet();
      NativeObject.KeySet nativeObject_KeySet0 = nativeIterator_StopIteration0.new KeySet();
      boolean boolean0 = nativeObject_KeySet0.contains(nativeObject_EntrySet0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeObject.KeySet nativeObject_KeySet0 = nativeIterator_StopIteration0.new KeySet();
      int int0 = nativeObject_KeySet0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      Set<Object> set0 = nativeIterator_StopIteration0.keySet();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeObject.ValueCollection nativeObject_ValueCollection0 = nativeIterator_StopIteration0.new ValueCollection();
      int int0 = nativeObject_ValueCollection0.size();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NativeIterator.StopIteration nativeIterator_StopIteration0 = new NativeIterator.StopIteration();
      NativeObject.EntrySet nativeObject_EntrySet0 = nativeIterator_StopIteration0.new EntrySet();
      int int0 = nativeObject_EntrySet0.size();
      assertEquals(0, int0);
  }
}

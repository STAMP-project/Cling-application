/*
 * This file was automatically generated by EvoSuite
 * Wed Aug 21 17:20:06 GMT 2019
 */

package com.google.javascript.rhino.head.tools.shell;

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
import com.google.javascript.rhino.head.Function;
import com.google.javascript.rhino.head.IdFunctionObject;
import com.google.javascript.rhino.head.NativeArray;
import com.google.javascript.rhino.head.NativeContinuation;
import com.google.javascript.rhino.head.Scriptable;
import com.google.javascript.rhino.head.Synchronizer;
import com.google.javascript.rhino.head.commonjs.module.Require;
import com.google.javascript.rhino.head.tools.shell.Global;
import com.google.javascript.rhino.head.tools.shell.QuitAction;
import com.google.javascript.rhino.head.tools.shell.ShellContextFactory;
import java.io.ByteArrayInputStream;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PrintStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.util.Locale;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class Global_ESTest extends Global_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("null");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "P");
      Object[] objectArray0 = new Object[15];
      try { 
        Global.readFile((Context) null, (Scriptable) null, objectArray0, (Function) null);
        fail("Expecting exception: UnsupportedEncodingException");
      
      } catch(UnsupportedEncodingException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("null");
      FileSystemHandling.createFolder(evoSuiteFile0);
      Object object0 = Global.readFile((Context) null, (Scriptable) null, objectArray0, (Function) null);
      assertEquals("", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("null");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "P");
      Object[] objectArray0 = new Object[1];
      Object object0 = Global.readFile((Context) null, (Scriptable) null, objectArray0, (Function) null);
      assertEquals("P", object0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Global global0 = new Global();
      PrintStream printStream0 = global0.getOut();
      // Undeclared exception!
      try { 
        Global.pipe(true, (InputStream) null, printStream0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("error reporter");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      Global.pipe(true, mockFileInputStream0, objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("language version");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      Global.pipe(false, sequenceInputStream0, objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockPrintStream mockPrintStream0 = new MockPrintStream("language version");
      ObjectOutputStream objectOutputStream0 = new ObjectOutputStream(mockPrintStream0);
      byte[] byteArray0 = new byte[1];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(byteArrayInputStream0, byteArrayInputStream0);
      Global.pipe(true, sequenceInputStream0, objectOutputStream0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Global global0 = new Global();
      InputStream inputStream0 = global0.getIn();
      InputStream inputStream1 = global0.getIn();
      assertSame(inputStream1, inputStream0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      InputStream inputStream0 = global0.getIn();
      Global.pipe(true, inputStream0, (OutputStream) null);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[7];
      Object object0 = Global.toint32(context0, delegator0, objectArray0, delegator0);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = Locale.getISOLanguages();
      BaseFunction baseFunction0 = new BaseFunction();
      try { 
        Global.readUrl((Context) null, baseFunction0, stringArray0, baseFunction0);
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: aa
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test11()  throws Throwable  {
      Context context0 = new Context();
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        Global.readUrl(context0, delegator0, context0.emptyArgs, delegator0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // readUrl require at least file path to be specified
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Object[] objectArray0 = new Object[15];
      try { 
        Global.readFile((Context) null, (Scriptable) null, objectArray0, (Function) null);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File not found: null
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test13()  throws Throwable  {
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        Global.readFile(context0, (Scriptable) null, context0.emptyArgs, (Function) null);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // readFile require at least file path to be specified
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Context context0 = Context.enter();
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) delegator0;
      // Undeclared exception!
      try { 
        Global.seal(context0, delegator0, objectArray0, delegator0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // seal function supports only sealing of ScriptableObject instances
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      String[] stringArray0 = Locale.getISOLanguages();
      IdFunctionObject idFunctionObject0 = global0.exportAsJSClass(9, (Scriptable) null, false);
      try { 
        Global.runCommand(context0, global0, stringArray0, idFunctionObject0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Cannot start processes in a unit test
         //
         verifyException("org.evosuite.runtime.mock.java.lang.MockRuntime", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test16()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) delegator0;
      // Undeclared exception!
      try { 
        Global.runCommand(context0, global0, objectArray0, delegator0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // The first argument to runCommand must be a command name.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        Global.runCommand(context0, (Scriptable) null, objectArray0, (Function) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test18()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        Global.runCommand(context0, baseFunction0, context0.emptyArgs, baseFunction0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // The first argument to runCommand must be a command name.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Global global0 = new Global();
      Context context0 = Context.getCurrentContext();
      String[] stringArray0 = global0.getPrompts(context0);
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        Global.sync(context0, global0, stringArray0, baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global();
      String[] stringArray0 = Locale.getISOLanguages();
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        Global.sync(context0, global0, stringArray0, baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Context context0 = new Context();
      // Undeclared exception!
      try { 
        Global.sync(context0, delegator0, context0.emptyArgs, delegator0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.sync.args
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Context context0 = new Context();
      BaseFunction baseFunction0 = new BaseFunction();
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) baseFunction0;
      MockThread mockThread0 = (MockThread)Global.spawn(context0, baseFunction0, objectArray0, baseFunction0);
      assertEquals(0, mockThread0.countStackFrames());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test23()  throws Throwable  {
      Context context0 = new Context();
      Global global0 = new Global();
      NativeContinuation nativeContinuation0 = new NativeContinuation();
      // Undeclared exception!
      try { 
        Global.spawn(context0, global0, context0.emptyArgs, nativeContinuation0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Argument to spawn() must be a function or script.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      int int0 = global0.runDoctest(context0, global0, "error reporter", "{ubdc=AkCf6-Ox8N", 8);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Context context0 = Context.enter();
      String[] stringArray0 = Locale.getISOCountries();
      Global global0 = new Global(context0);
      // Undeclared exception!
      try { 
        Global.doctest(context0, global0, stringArray0, (Function) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        Global.deserialize(context0, global0, context0.emptyArgs, delegator0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Expected a filename to read the serialization from
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      BoundFunction boundFunction0 = new BoundFunction(context0, global0, (Callable) null, global0, context0.emptyArgs);
      // Undeclared exception!
      try { 
        Global.serialize(context0, global0, context0.emptyArgs, boundFunction0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Expected an object to serialize and a filename to write the serialization to
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test28()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      NativeArray nativeArray0 = global0.history;
      String[] stringArray0 = global0.getPrompts(context0);
      BaseFunction baseFunction0 = new BaseFunction();
      Global.serialize(context0, nativeArray0, stringArray0, baseFunction0);
      assertEquals(0L, nativeArray0.jsGet_length());
      assertEquals(0L, nativeArray0.getLength());
  }

  @Test(timeout = 4000)
  @Ignore
  public void test29()  throws Throwable  {
      Context context0 = Context.getCurrentContext();
      Delegator delegator0 = new Delegator();
      // Undeclared exception!
      try { 
        Global.loadClass(context0, delegator0, context0.emptyArgs, delegator0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Expected a string argument.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test30()  throws Throwable  {
      Context context0 = new Context();
      Global global0 = new Global();
      String[] stringArray0 = global0.getPrompts(context0);
      BaseFunction baseFunction0 = new BaseFunction();
      // Undeclared exception!
      try { 
        Global.loadClass(context0, baseFunction0, stringArray0, baseFunction0);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // Class \"js> \" not found.
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Delegator delegator0 = new Delegator();
      Object[] objectArray0 = new Object[1];
      Context context0 = Context.enter();
      double double0 = Global.version(context0, (Scriptable) null, objectArray0, delegator0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Context context0 = new Context();
      Global global0 = new Global();
      IdFunctionObject idFunctionObject0 = global0.exportAsJSClass(5, global0, false);
      Global.quit(context0, idFunctionObject0, context0.emptyArgs, idFunctionObject0);
      assertFalse(idFunctionObject0.avoidObjectDetection());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Context context0 = new Context();
      String[] stringArray0 = Locale.getISOLanguages();
      Global global0 = new Global();
      NativeArray nativeArray0 = new NativeArray(stringArray0);
      Require require0 = global0.installRequire(context0, nativeArray0, false);
      assertFalse(require0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      // Undeclared exception!
      try { 
        global0.initQuitAction((QuitAction) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // quitAction is null
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Global global0 = new Global();
      QuitAction quitAction0 = mock(QuitAction.class, new ViolatedAssumptionAnswer());
      global0.initQuitAction(quitAction0);
      QuitAction quitAction1 = mock(QuitAction.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        global0.initQuitAction(quitAction1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The method is once-call.
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  @Ignore
  public void test36()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      // Undeclared exception!
      try { 
        Global.seal((Context) null, (Scriptable) null, objectArray0, (Function) null);
       //  fail("Expecting exception: RuntimeException");
       // Unstable assertion
      } catch(RuntimeException e) {
         //
         // seal function can only be applied to objects
         //
         verifyException("com.google.javascript.rhino.head.DefaultErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Global global0 = new Global();
      global0.setSealedStdLib(false);
      assertTrue(global0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Global global0 = new Global();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      PushbackInputStream pushbackInputStream0 = new PushbackInputStream(pipedInputStream0);
      global0.setIn(pushbackInputStream0);
      assertEquals("object", global0.getTypeOf());
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Global global0 = new Global();
      ShellContextFactory shellContextFactory0 = new ShellContextFactory();
      global0.init((ContextFactory) shellContextFactory0);
      assertFalse(shellContextFactory0.isSealed());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Context context0 = new Context();
      Global global0 = new Global();
      // Undeclared exception!
      try { 
        Global.help(context0, global0, context0.emptyArgs, (Function) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.rhino.head.tools.shell.Global", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Global global0 = new Global();
      boolean boolean0 = global0.isInitialized();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Global global0 = new Global();
      String[] stringArray0 = Locale.getISOLanguages();
      BaseFunction baseFunction0 = new BaseFunction();
      Context context0 = Context.getCurrentContext();
      // Undeclared exception!
      try { 
        Global.runCommand(context0, global0, stringArray0, baseFunction0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // no message resource found for message property msg.bad.shell.function.scope
         //
         verifyException("com.google.javascript.rhino.head.tools.ToolErrorReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Context context0 = Context.enter();
      Global global0 = new Global(context0);
      Synchronizer synchronizer0 = new Synchronizer(global0, global0);
      Global.gc(context0, global0, context0.emptyArgs, synchronizer0);
      assertEquals(Integer.MAX_VALUE, context0.getMaximumInterpreterStackDepth());
  }
}

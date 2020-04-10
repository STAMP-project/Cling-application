/*
 * This file was automatically generated by EvoSuite
 * Sun Aug 18 05:22:00 GMT 2019
 */

package com.google.javascript.jscomp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Function;
import com.google.common.base.Supplier;
import com.google.common.collect.LinkedListMultimap;
import com.google.javascript.jscomp.AbstractCommandLineRunner;
import com.google.javascript.jscomp.CheckLevel;
import com.google.javascript.jscomp.CommandLineRunner;
import com.google.javascript.jscomp.Compiler;
import com.google.javascript.jscomp.CompilerOptions;
import com.google.javascript.jscomp.FunctionInformationMap;
import com.google.javascript.jscomp.JSError;
import com.google.javascript.jscomp.JSModule;
import com.google.javascript.jscomp.JSModuleGraph;
import com.google.javascript.jscomp.JSSourceFile;
import com.google.javascript.jscomp.PhaseOptimizer;
import com.google.javascript.jscomp.Result;
import com.google.javascript.jscomp.SourceFile;
import com.google.javascript.jscomp.SourceMap;
import com.google.javascript.jscomp.VariableMap;
import com.google.javascript.rhino.SimpleErrorReporter;
import com.google.protobuf.ByteString;
import com.google.protobuf.ExtensionRegistryLite;
import java.io.ByteArrayInputStream;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.OutputStream;
import java.io.StringWriter;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ResourceBundle;
import java.util.Stack;
import java.util.TreeMap;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true) 
public class AbstractCommandLineRunner_ESTest extends AbstractCommandLineRunner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setOutputManifest(list0);
      assertNotNull(abstractCommandLineRunner_CommandLineConfig1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JSModule jSModule0 = new JSModule("]l");
      MockPrintStream mockPrintStream0 = new MockPrintStream("]l");
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
      JSModule[] jSModuleArray0 = new JSModule[1];
      jSModuleArray0[0] = jSModule0;
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph(jSModuleArray0);
      MockFile mockFile0 = new MockFile("]l", "]l");
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile((File) mockFile0, (Charset) null);
      jSModule0.addFirst((SourceFile) jSSourceFile0);
      // Undeclared exception!
      try { 
        commandLineRunner0.printModuleGraphManifestOrBundleTo(jSModuleGraph0, mockPrintStream0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JSModule jSModule0 = new JSModule("]l");
      MockPrintStream mockPrintStream0 = new MockPrintStream("]l");
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
      JSModule[] jSModuleArray0 = new JSModule[1];
      jSModuleArray0[0] = jSModule0;
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph(jSModuleArray0);
      MockFile mockFile0 = new MockFile("]l", "]l");
      JSSourceFile jSSourceFile0 = JSSourceFile.fromFile((File) mockFile0, (Charset) null);
      jSModule0.addFirst((SourceFile) jSSourceFile0);
      // Undeclared exception!
      try { 
        commandLineRunner0.printModuleGraphManifestOrBundleTo(jSModuleGraph0, mockPrintStream0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JSModule jSModule0 = new JSModule("]l");
      MockPrintStream mockPrintStream0 = new MockPrintStream("]l");
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
      JSModule[] jSModuleArray0 = new JSModule[1];
      jSModuleArray0[0] = jSModule0;
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph(jSModuleArray0);
      commandLineRunner0.printModuleGraphManifestOrBundleTo(jSModuleGraph0, mockPrintStream0, true);
      assertTrue(commandLineRunner0.shouldRunCompiler());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JSModule jSModule0 = new JSModule("]l");
      MockPrintStream mockPrintStream0 = new MockPrintStream("]l");
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
      JSModule[] jSModuleArray0 = new JSModule[1];
      jSModuleArray0[0] = jSModule0;
      JSModuleGraph jSModuleGraph0 = new JSModuleGraph(jSModuleArray0);
      commandLineRunner0.printModuleGraphManifestOrBundleTo(jSModuleGraph0, mockPrintStream0, false);
      assertTrue(commandLineRunner0.shouldRunCompiler());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      simpleErrorReporter0.error("X.FW (deadAssignmentsElimination#2122)", "X.FW (deadAssignmentsElimination#2122)", (-49), 4);
      List<String> list0 = simpleErrorReporter0.errors();
      simpleErrorReporter0.error("C*&g[d{.\"=W", "e6=,u;ut(ReBqr4Z=):", (-135), 4);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      // Undeclared exception!
      try { 
        AbstractCommandLineRunner.createDefineOrTweakReplacements(list0, compilerOptions0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // --define flag syntax invalid: C*&g[d{.\"=W
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      simpleErrorReporter0.error("X.FW (deadAssignmentsElimination#2122)", "X.FW (deadAssignmentsElimination#2122)", (-49), 4);
      List<String> list0 = simpleErrorReporter0.errors();
      CompilerOptions compilerOptions0 = new CompilerOptions();
      AbstractCommandLineRunner.createDefineOrTweakReplacements(list0, compilerOptions0, false);
      assertFalse(compilerOptions0.aliasExternals);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      simpleErrorReporter0.error("u/Hy*whN0XW=5s-(%[", "u/Hy*whN0XW=5s-(%[", (-49), (-49));
      List<String> list0 = simpleErrorReporter0.errors();
      // Undeclared exception!
      try { 
        AbstractCommandLineRunner.createDefineOrTweakReplacements(list0, compilerOptions0, true);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // --tweak flag syntax invalid: u/Hy*whN0XW=5s-(%[
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CompilerOptions compilerOptions0 = new CompilerOptions();
      SimpleErrorReporter simpleErrorReporter0 = new SimpleErrorReporter();
      simpleErrorReporter0.error("", "", (-49), (-49));
      List<String> list0 = simpleErrorReporter0.errors();
      // Undeclared exception!
      try { 
        AbstractCommandLineRunner.createDefineOrTweakReplacements(list0, compilerOptions0, false);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // --define flag syntax invalid: 
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      CompilerOptions compilerOptions0 = new CompilerOptions();
      AbstractCommandLineRunner.createDefineOrTweakReplacements(list0, compilerOptions0, true);
      assertFalse(compilerOptions0.crossModuleMethodMotion);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      OutputStream outputStream0 = commandLineRunner0.filenameToOutputStream((String) null);
      assertNull(outputStream0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      OutputStream outputStream0 = commandLineRunner0.filenameToOutputStream("unsupported language extension: for each");
      assertNotNull(outputStream0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      JSError[] jSErrorArray0 = new JSError[1];
      TreeMap<String, String> treeMap0 = new TreeMap<String, String>();
      VariableMap variableMap0 = new VariableMap(treeMap0);
      Result result0 = new Result(jSErrorArray0, jSErrorArray0, (String) null, variableMap0, variableMap0, variableMap0, (FunctionInformationMap) null, (SourceMap) null, "com.google.javascript.jscomp.AbstractCommandLineRunner$WarningGuardSpec");
      Stack<JSModule> stack0 = new Stack<JSModule>();
      int int0 = commandLineRunner0.processResults(result0, stack0, (CompilerOptions) null);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-";
      stringArray0[1] = "collapseObjectLiterals";
      stringArray0[2] = "iegdb)}=";
      stringArray0[3] = "\"JFtY";
      stringArray0[4] = "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.";
      MockPrintStream mockPrintStream0 = new MockPrintStream("-");
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
      JSError[] jSErrorArray0 = new JSError[0];
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      VariableMap variableMap0 = VariableMap.fromMap(hashMap0);
      byte[] byteArray0 = new byte[0];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      ByteString byteString0 = ByteString.copyFrom(byteBuffer0);
      FunctionInformationMap functionInformationMap0 = FunctionInformationMap.parseFrom(byteString0, (ExtensionRegistryLite) null);
      HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>(101);
      Result result0 = new Result(jSErrorArray0, jSErrorArray0, "/>=", variableMap0, variableMap0, variableMap0, variableMap0, functionInformationMap0, (SourceMap) null, "Expected module wrapper to have <name>:<wrapper> format: ", hashMap1, "Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
      Stack<JSModule> stack0 = new Stack<JSModule>();
      // Undeclared exception!
      try { 
        commandLineRunner0.processResults(result0, stack0, (CompilerOptions) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      AbstractCommandLineRunner.writeOutput(charArrayWriter0, (Compiler) null, "O=/`+", "O=/`+", "O=/`+");
      assertEquals(6, charArrayWriter0.size());
      assertEquals("O=/`+\n", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Compiler compiler0 = new Compiler();
      StringWriter stringWriter0 = new StringWriter();
      AbstractCommandLineRunner.writeOutput(stringWriter0, compiler0, (String) null, "Y6uBEA'1S}!H", "!");
      assertEquals("Y6uBEA'1S}nullH\n", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      Compiler compiler0 = new Compiler();
      AbstractCommandLineRunner.writeOutput(charArrayWriter0, compiler0, "_", "_", "eRr=8.");
      assertEquals(2, charArrayWriter0.size());
      assertEquals("_\n", charArrayWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JSModule jSModule0 = new JSModule("]l");
      MockPrintStream mockPrintStream0 = new MockPrintStream("]l");
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
      // Undeclared exception!
      try { 
        commandLineRunner0.writeModuleOutput(mockPrintStream0, jSModule0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("):#127)");
      ArrayList<JSModule> arrayList1 = new ArrayList<JSModule>();
      try { 
        AbstractCommandLineRunner.parseModuleWrappers(arrayList0, arrayList1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unknown module: ')'
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArrayList<JSModule> arrayList0 = new ArrayList<JSModule>();
      arrayList0.add((JSModule) null);
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      // Undeclared exception!
      try { 
        AbstractCommandLineRunner.parseModuleWrappers(list0, arrayList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector<JSModule> vector0 = new Vector<JSModule>();
      // Undeclared exception!
      try { 
        AbstractCommandLineRunner.parseModuleWrappers((List<String>) null, vector0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      commandLineRunner0.checkModuleName("ECMASCRIPT3");
      assertTrue(commandLineRunner0.shouldRunCompiler());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[0];
      JSModule jSModule0 = new JSModule("Duplicate module name: ");
      MockPrintStream mockPrintStream0 = new MockPrintStream("VYx_;%?k$");
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0, mockPrintStream0, mockPrintStream0);
      List<String> list0 = jSModule0.getProvides();
      try { 
        commandLineRunner0.createJsModules(list0, list0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid module name: 'Duplicate module name'
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      // Undeclared exception!
      try { 
        commandLineRunner0.createJsModules(list0, (List<String>) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      Vector<String> vector0 = new Vector<String>();
      // Undeclared exception!
      try { 
        commandLineRunner0.createJsModules(vector0, vector0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      // Undeclared exception!
      try { 
        commandLineRunner0.createJsModules((List<String>) null, (List<String>) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      Supplier<List<JSModule>> supplier0 = (Supplier<List<JSModule>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(supplier0).get();
      Function<Integer, Boolean> function0 = (Function<Integer, Boolean>) mock(Function.class, new ViolatedAssumptionAnswer());
      commandLineRunner0.enableTestMode((Supplier<List<SourceFile>>) null, (Supplier<List<SourceFile>>) null, supplier0, function0);
      List<String> list0 = ResourceBundle.Control.FORMAT_DEFAULT;
      List<JSModule> list1 = commandLineRunner0.createJsModules(list0, list0);
      assertNull(list1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      List<SourceFile> list1 = commandLineRunner0.createInputs(list0, false);
      assertEquals(1, list1.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      commandLineRunner0.setRunOptions(compilerOptions0);
      assertFalse(compilerOptions0.foldConstants);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      String[] stringArray0 = new String[6];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "msg.no.name.after.coloncolon";
      stringArray0[3] = "-";
      stringArray0[4] = "g]<M0~Ty}T|9qWNS?`Q";
      stringArray0[5] = "ECMASCRIPT5";
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      commandLineRunner0.setRunOptions(compilerOptions0);
      assertFalse(compilerOptions0.inlineLocalFunctions);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      Supplier<List<SourceFile>> supplier0 = (Supplier<List<SourceFile>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      Function<Integer, Boolean> function0 = (Function<Integer, Boolean>) mock(Function.class, new ViolatedAssumptionAnswer());
      commandLineRunner0.enableTestMode(supplier0, supplier0, (Supplier<List<JSModule>>) null, function0);
      assertTrue(commandLineRunner0.shouldRunCompiler());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      Supplier<List<JSModule>> supplier0 = (Supplier<List<JSModule>>) mock(Supplier.class, new ViolatedAssumptionAnswer());
      Function<Integer, Boolean> function0 = (Function<Integer, Boolean>) mock(Function.class, new ViolatedAssumptionAnswer());
      commandLineRunner0.enableTestMode((Supplier<List<SourceFile>>) null, (Supplier<List<SourceFile>>) null, supplier0, function0);
      // Undeclared exception!
      try { 
        commandLineRunner0.doRun();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      AbstractCommandLineRunner.WarningGuardSpec abstractCommandLineRunner_WarningGuardSpec0 = new AbstractCommandLineRunner.WarningGuardSpec();
      CheckLevel checkLevel0 = CheckLevel.WARNING;
      abstractCommandLineRunner_WarningGuardSpec0.add(checkLevel0, ":#127)");
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      // Undeclared exception!
      try { 
        commandLineRunner0.run();
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      List<String> list0 = ResourceBundle.Control.FORMAT_PROPERTIES;
      try { 
        commandLineRunner0.createJsModules(list0, list0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Expected 2-4 colon-delimited parts in module spec: java.properties
         //
         verifyException("com.google.javascript.jscomp.AbstractCommandLineRunner", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      ArrayList<SourceFile> arrayList0 = new ArrayList<SourceFile>();
      CompilerOptions compilerOptions0 = commandLineRunner0.createOptions();
      Compiler compiler0 = new Compiler();
      compiler0.compile((List<SourceFile>) arrayList0, (List<SourceFile>) arrayList0, compilerOptions0);
      ArrayList<JSModule> arrayList1 = new ArrayList<JSModule>();
      Result result0 = compiler0.getResult();
      int int0 = commandLineRunner0.processResults(result0, arrayList1, compilerOptions0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      Compiler compiler0 = commandLineRunner0.getCompiler();
      assertNull(compiler0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      CompilerOptions compilerOptions0 = new CompilerOptions();
      commandLineRunner0.initOptionsFromFlags(compilerOptions0);
      assertFalse(compilerOptions0.removeUnusedClassProperties);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String[] stringArray0 = new String[0];
      CommandLineRunner commandLineRunner0 = new CommandLineRunner(stringArray0);
      Compiler compiler0 = commandLineRunner0.createCompiler();
      assertEquals(0.0, compiler0.getProgress(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
      SourceMap.DetailLevel sourceMap_DetailLevel0 = SourceMap.DetailLevel.SYMBOLS;
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setSourceMapDetailLevel(sourceMap_DetailLevel0);
      assertNotNull(abstractCommandLineRunner_CommandLineConfig1);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setComputePhaseOrdering(false);
      assertNotNull(abstractCommandLineRunner_CommandLineConfig1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
      List<String> list0 = PhaseOptimizer.OPTIMAL_ORDER;
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setTweak(list0);
      assertNotNull(abstractCommandLineRunner_CommandLineConfig1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
      CompilerOptions.TweakProcessing compilerOptions_TweakProcessing0 = CompilerOptions.TweakProcessing.OFF;
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setTweakProcessing(compilerOptions_TweakProcessing0);
      assertNotNull(abstractCommandLineRunner_CommandLineConfig1);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
      LinkedListMultimap<ByteArrayInputStream, String> linkedListMultimap0 = LinkedListMultimap.create();
      byte[] byteArray0 = new byte[5];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 1124, 0);
      List<String> list0 = linkedListMultimap0.get(byteArrayInputStream0);
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setManifestMaps(list0);
      assertNotNull(abstractCommandLineRunner_CommandLineConfig1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
      List<String> list0 = ResourceBundle.Control.FORMAT_CLASS;
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setOutputBundle(list0);
      assertNotNull(abstractCommandLineRunner_CommandLineConfig1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig0 = new AbstractCommandLineRunner.CommandLineConfig();
      AbstractCommandLineRunner.CommandLineConfig abstractCommandLineRunner_CommandLineConfig1 = abstractCommandLineRunner_CommandLineConfig0.setSkipNormalOutputs(false);
      assertNotNull(abstractCommandLineRunner_CommandLineConfig1);
  }
}

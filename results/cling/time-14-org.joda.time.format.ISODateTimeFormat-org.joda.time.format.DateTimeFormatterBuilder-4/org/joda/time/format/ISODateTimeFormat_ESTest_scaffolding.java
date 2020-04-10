/**
 * Scaffolding file used to store all the setups needed to run 
 * Tue Mar 03 18:25:16 GMT 2020
 */

package org.joda.time.format;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ISODateTimeFormat_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.joda.time.format.ISODateTimeFormat"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.timezone", "Europe/Amsterdam"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ISODateTimeFormat_ESTest_scaffolding.class.getClassLoader() ,
      "org.joda.time.format.DateTimeFormatterBuilder$PaddedNumber",
      "org.joda.time.format.DateTimeFormatterBuilder$TimeZoneOffset",
      "org.joda.time.DateTimeZone",
      "org.joda.time.field.BaseDateTimeField",
      "org.joda.time.format.DateTimeFormatterBuilder",
      "org.joda.time.format.DateTimeParser",
      "org.joda.time.base.AbstractPartial",
      "org.joda.time.base.BaseDateTime",
      "org.joda.time.format.DateTimeFormatterBuilder$CharacterLiteral",
      "org.joda.time.LocalTime",
      "org.joda.time.format.DateTimeFormatterBuilder$StringLiteral",
      "org.joda.time.base.AbstractInstant",
      "org.joda.time.JodaTimePermission",
      "org.joda.time.tz.ZoneInfoProvider",
      "org.joda.time.DateTimeZone$1",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.DateTimeField",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.format.DateTimeFormatterBuilder$Fraction",
      "org.joda.time.format.DateTimeFormatterBuilder$FixedNumber",
      "org.joda.time.format.DateTimeFormatterBuilder$MatchingParser",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.format.ISODateTimeFormat",
      "org.joda.time.format.DateTimeFormatterBuilder$NumberFormatter",
      "org.joda.time.format.DateTimeFormatter",
      "org.joda.time.Chronology",
      "org.joda.time.DateTime",
      "org.joda.time.ReadableInstant",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.LocalDateTime",
      "org.joda.time.MutableDateTime",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.format.DateTimeFormatterBuilder$Composite",
      "org.joda.time.format.DateTimeFormatterBuilder$UnpaddedNumber",
      "org.joda.time.tz.DefaultNameProvider",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.LocalDate",
      "org.joda.time.tz.Provider",
      "org.joda.time.ReadableDateTime",
      "org.joda.time.base.AbstractDateTime",
      "org.joda.time.ReadWritableDateTime",
      "org.joda.time.DurationFieldType",
      "org.joda.time.format.DateTimePrinter",
      "org.joda.time.ReadWritableInstant",
      "org.joda.time.ReadablePartial",
      "org.joda.time.base.BaseLocal",
      "org.joda.time.tz.NameProvider",
      "org.joda.time.DurationFieldType$StandardDurationFieldType"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ISODateTimeFormat_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.joda.time.format.ISODateTimeFormat",
      "org.joda.time.DurationFieldType$StandardDurationFieldType",
      "org.joda.time.DurationFieldType",
      "org.joda.time.DateTimeFieldType$StandardDateTimeFieldType",
      "org.joda.time.DateTimeFieldType",
      "org.joda.time.tz.FixedDateTimeZone",
      "org.joda.time.DateTimeZone",
      "org.joda.time.DateTimeUtils",
      "org.joda.time.chrono.BaseChronology",
      "org.joda.time.chrono.AssembledChronology",
      "org.joda.time.field.MillisDurationField",
      "org.joda.time.field.BaseDurationField",
      "org.joda.time.field.PreciseDurationField",
      "org.joda.time.field.PreciseDurationDateTimeField",
      "org.joda.time.field.PreciseDateTimeField",
      "org.joda.time.field.DecoratedDateTimeField",
      "org.joda.time.field.ZeroIsMaxDateTimeField",
      "org.joda.time.chrono.BasicChronology$HalfdayField",
      "org.joda.time.chrono.BasicChronology",
      "org.joda.time.chrono.BasicGJChronology",
      "org.joda.time.field.ImpreciseDateTimeField",
      "org.joda.time.chrono.BasicYearDateTimeField",
      "org.joda.time.field.ImpreciseDateTimeField$LinkedDurationField",
      "org.joda.time.chrono.GJYearOfEraDateTimeField",
      "org.joda.time.field.OffsetDateTimeField",
      "org.joda.time.field.DividedDateTimeField",
      "org.joda.time.field.DecoratedDurationField",
      "org.joda.time.field.ScaledDurationField",
      "org.joda.time.field.RemainderDateTimeField",
      "org.joda.time.chrono.GJEraDateTimeField",
      "org.joda.time.chrono.GJDayOfWeekDateTimeField",
      "org.joda.time.chrono.BasicDayOfMonthDateTimeField",
      "org.joda.time.chrono.BasicDayOfYearDateTimeField",
      "org.joda.time.chrono.BasicMonthOfYearDateTimeField",
      "org.joda.time.chrono.GJMonthOfYearDateTimeField",
      "org.joda.time.chrono.BasicWeekyearDateTimeField",
      "org.joda.time.chrono.BasicWeekOfWeekyearDateTimeField",
      "org.joda.time.field.UnsupportedDurationField",
      "org.joda.time.chrono.GregorianChronology",
      "org.joda.time.chrono.ISOYearOfEraDateTimeField",
      "org.joda.time.chrono.ISOChronology",
      "org.joda.time.tz.DateTimeZoneBuilder$PrecalculatedZone",
      "org.joda.time.tz.DateTimeZoneBuilder$DSTZone",
      "org.joda.time.tz.CachedDateTimeZone",
      "org.joda.time.chrono.ZonedChronology",
      "org.joda.time.chrono.ZonedChronology$ZonedDurationField",
      "org.joda.time.chrono.ZonedChronology$ZonedDateTimeField",
      "org.joda.time.format.FormatUtils",
      "org.joda.time.field.DelegatedDateTimeField",
      "org.joda.time.field.SkipDateTimeField",
      "org.joda.time.chrono.JulianChronology"
    );
  }
}

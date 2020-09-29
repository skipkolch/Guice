package ru.mail.guice.main;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import org.jetbrains.annotations.NotNull;

public final class TestModule extends AbstractModule {

//  @Provides
//  public @NotNull DBHelper provideDBHelper() {
//    String url = "jdbc:mysql://localhost:5326/emp";
//    String user = "user";
//    int timeout = 100;
//    return new DBHelper(url, user, timeout);
//  }
//
//  @Provides
//  public @NotNull @MyAnn DBHelper provideDBHelper2() {
//    return new DBHelper("url", "user", 100);
//  }

  @Override
  protected void configure() {
    bind(SpellChecker.class).toInstance(new SpellCheckerImpl());
    //bind(SpellChecker.class).annotatedWith(Names.named("SCIWAnn")).to(SpellCheckerImplWithAnn.class);
    bind(String.class).annotatedWith(Names.named("URL")).toInstance("localhost:5432");
    bind(DBHelper.class).toProvider(DBHelperProvider.class);
  }

}

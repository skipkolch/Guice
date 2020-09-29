package ru.mail.guice.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;

public final class Main {


  public static void main(@NotNull String[] args) {
    final Injector injector = Guice.createInjector(new TestModule());
    final TextEditor editor = injector.getInstance(TextEditor.class);
    editor.doSmth();
  }
}

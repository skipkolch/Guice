package ru.mail.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;

public final class Main {


  public static void main(@NotNull String[] args) {
    final Injector injector = Guice.createInjector(new MainModule());
    final TestEntity entity = injector.getInstance(TestEntity.class);
    entity.todo();
  }
}

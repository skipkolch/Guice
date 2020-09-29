package ru.mail.guice.singleton;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.jetbrains.annotations.NotNull;

public final class Main {
  public static void main(@NotNull String[] args) {
    final Injector injector = Guice.createInjector(new MainModule());
    final EntityId entity = injector.getInstance(EntityId.class);
    final EntityId entity2 = injector.getInstance(EntityId.class);

    entity.id();
    entity2.id();
  }
}

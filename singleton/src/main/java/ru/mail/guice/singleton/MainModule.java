package ru.mail.guice.singleton;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;

public final class MainModule extends AbstractModule {
  @Override
  protected void configure() {
    install(new TestMainModule());
    bind(EntityId.class).to(SubEntityId.class);
  }
}

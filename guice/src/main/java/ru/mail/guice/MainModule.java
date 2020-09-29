package ru.mail.guice;

import com.google.inject.AbstractModule;

public final class MainModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(Helper.class).to(HelperSecondImpl.class);
  }
}

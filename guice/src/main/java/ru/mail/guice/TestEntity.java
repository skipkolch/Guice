package ru.mail.guice;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class TestEntity {
  private final @Nullable Helper helper;

  @Inject
  public TestEntity(@NotNull Helper helper) {
    this.helper = helper;
  }

  public void todo(){
    if(helper == null ) {

    }
    helper.help();
  }
}

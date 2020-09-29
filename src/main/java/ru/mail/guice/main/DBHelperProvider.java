package ru.mail.guice.main;

import com.google.inject.Provider;
import org.jetbrains.annotations.NotNull;

public final class DBHelperProvider implements Provider<DBHelper> {
  @Override
  public @NotNull DBHelper get() {
    return new DBHelper("url2", "user2", 200);
  }
}
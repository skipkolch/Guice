package ru.mail.guice.main;

import com.google.inject.Inject;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

public final class DBHelper {

  private final @NotNull String url;
  private final @NotNull String user;
  private final int timeout;

  public DBHelper(@NotNull String url, @NotNull String user, int timeout) {
    this.url = url;
    this.user = user;
    this.timeout = timeout;
  }

  @Override
  public @NotNull String toString() {
    return "DBHelper{" +
        "url='" + url + '\'' +
        ", user='" + user + '\'' +
        ", timeout=" + timeout +
        '}';
  }
}

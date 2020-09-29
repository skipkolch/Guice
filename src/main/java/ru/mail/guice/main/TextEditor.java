package ru.mail.guice.main;

import com.google.inject.Inject;
import com.google.inject.name.Named;
import org.jetbrains.annotations.NotNull;

import java.util.logging.Logger;

public final class TextEditor {

//  @Inject
//  private @NotNull Logger logger;
  @Inject
  private @NotNull Logger logger;

  private final @NotNull DBHelper dbHelper;

  @Inject
  public TextEditor(@NotNull DBHelper dbHelper) {
    this.dbHelper = dbHelper;
  }

  public void doSmth() {
    //spellChecker.check();
    System.out.println(dbHelper);
    logger.info(logger.getName());
  }
}

package ru.mail.guice.main;

public final class SpellCheckerImplWithAnn implements SpellChecker {
  @Override
  public void check() {
    System.out.println("Metod check() in SpellCheckerImplWithAnn.class");
  }
}

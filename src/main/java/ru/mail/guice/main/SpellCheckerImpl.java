package ru.mail.guice.main;

public final class SpellCheckerImpl implements SpellChecker {
  @Override
  public void check() {
    System.out.println("Metod check() in SpellCheckerImpl.class");
  }
}

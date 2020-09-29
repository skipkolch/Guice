package ru.mail.guice.singleton;

import com.google.inject.Inject;
import com.google.inject.Singleton;

public abstract class EntityId {
  private final double id;

  @Inject
  public EntityId() {
    this.id = Math.random();
  }

  public void id() {
    System.out.println(id);
  }
}

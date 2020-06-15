package de.kontextwork.virginspring.foo;

import lombok.extern.log4j.Log4j2;
import org.springframework.shell.standard.*;

@Log4j2
@ShellComponent
public class FooCommands
{
  @ShellMethod("Greets you")
  @SuppressWarnings("unused")
  public String hello(@ShellOption String name)
  {
    return String.format("Hello %s!", name);
  }
}

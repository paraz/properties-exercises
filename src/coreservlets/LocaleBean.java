package coreservlets;

import java.util.*;
import javax.faces.bean.*;

@ManagedBean
public class LocaleBean {
  private Locale locale;
  private String localeName = "fr";

  public LocaleBean() {
    locale = new Locale(localeName);
  }

  public Locale getLocale() {
    return(locale);
  }

  public String getLocaleName() {
    return(localeName);
  }

  // Planning ahead for later example where user
  // passes in a Locale name.
  
  public void setLocaleName(String localeName) {
    locale = new Locale(localeName);
    this.localeName = localeName;
  }
  
  private final Locale[] localeChoices =
    { new Locale("en"), new Locale("es"), new Locale("fr") };
  
  public Locale getRandomLocale() {
    return(RandomUtils.randomElement(localeChoices));
  }
}
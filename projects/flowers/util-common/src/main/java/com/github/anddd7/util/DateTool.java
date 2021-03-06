package com.github.anddd7.util;

import static java.time.format.DateTimeFormatter.ofPattern;

import java.time.format.DateTimeFormatter;
import lombok.experimental.UtilityClass;

@UtilityClass
public final class DateTool {

  public static final DateTimeFormatter DATE_NO_SEPARATOR = ofPattern("yyyyMMdd");
  public static final DateTimeFormatter DATE_TIME = ofPattern("yyyy-MM-dd HH:mm:ss");
  public static final DateTimeFormatter DATE_TIME_IGNORE_SEC = ofPattern("yyyy-MM-dd HH:mm");
}

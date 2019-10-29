package com.groovy.start;

import java.util.List;
import java.util.NoSuchElementException;

public class Logic {

  public Integer findBiggest(List<Integer> integers) {
    return integers.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
  }
}

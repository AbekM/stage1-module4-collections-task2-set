package com.epam.mjc.collections.set;

import java.util.HashSet;
import java.util.List;

public class HashSetCreator {

  public HashSet<Integer> createHashSet (List<Integer> sourceList) {
    HashSet set = new HashSet<>();
    for (Integer i : sourceList) {
      if (i % 2 == 0) {
        while (i % 2 == 0) {
          set.add(i);
          i /= 2;
        }
        set.add(i);
      } else {
        set.add(i);
        set.add(i * 2);
      }
    }
    return set;
  }
}

package edu.calpoly.csc305;

import java.util.ArrayList;
import java.util.List;

public class IssueTwo {
  /**
   * Method to illustrate common issue with generics.
   *
   * @param items list to copy
   * @return duplicate of input list
   */
  public List<?> duplicate(List<?> items) {
    List<?> copy = new ArrayList<>();

    for (Object item : items) {
      copy.add(item);
    }

    return copy;
  }
}

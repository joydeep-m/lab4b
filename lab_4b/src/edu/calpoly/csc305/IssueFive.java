package edu.calpoly.csc305;

import java.util.List;

public class IssueFive {
  public long sumAsLongs(List<Number> numbers) {
    long total = 0;

    for (Number number : numbers) {
      total += number.longValue();
    }

    return total;
  }

  public long sumIntsAsLongs(List<Integer> ints) {
    return sumAsLongs(ints);
  }

  public long sumDoublesAsLongs(List<Double> doubles) {
    return sumAsLongs(doubles);
  }
}

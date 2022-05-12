package com.engkimbs.domain.book.entry;

import lombok.Data;

@Data
public class Price implements Comparable<Price> {
    private Long value;

    @Override
    public int compareTo(Price other) {
        return this.value.compareTo(other.value);
    }
}

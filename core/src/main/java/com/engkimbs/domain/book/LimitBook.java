package com.engkimbs.domain.book;

import com.engkimbs.domain.book.entry.BookEntry;
import com.engkimbs.domain.book.entry.BookEntryKey;
import com.engkimbs.domain.book.entry.Side;
import io.vavr.collection.TreeMap;
import lombok.Data;

@Data
public class LimitBook {

    private TreeMap<BookEntryKey, BookEntry> entries;

    public LimitBook(Side side) {
        TreeMap.empty(

        )
    }

}

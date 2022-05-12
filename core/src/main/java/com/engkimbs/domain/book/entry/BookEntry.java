package com.engkimbs.domain.book.entry;

import lombok.Data;

@Data
public class BookEntry {
    private BookEntryKey key;
    private ClientRequestId requestId;
    private Client whoRequested;
    private Boolean isQuote;
    private EntryType entryType;
    private Side side;
    private TimeInForce timeInForce;
    private EntrySizes sizes;
    private EntryStatus entryStatus;
}
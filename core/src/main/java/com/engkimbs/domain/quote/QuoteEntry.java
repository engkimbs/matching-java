package com.engkimbs.domain.quote;

import com.engkimbs.domain.book.entry.SizeAtPrice;
import lombok.Data;

@Data
public class QuoteEntry {
    public String quoteEntryId;
    public String quoteSetId;
    public SizeAtPrice bid;
    public SizeAtPrice offer;
}

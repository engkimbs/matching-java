package com.engkimbs.domain.book;

import com.engkimbs.domain.book.entry.Side;
import lombok.Data;

@Data
public class Books {
    public BookId bookId;
    public LimitBook buyLimitBook = LimitBook(Side.BUY);
    public LimitBook sellLimitBook = LimitBook(Side.SELL)
}

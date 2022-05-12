package com.engkimbs.domain.book.entry;

import com.engkimbs.domain.book.Books;
import com.engkimbs.domain.book.LimitBook;
import com.engkimbs.domain.quote.QuoteEntry;

public enum Side {
    BUY {
        @Override
        public Side oppositeSide() {
            return Side.SELL;
        }

        @Override
        public Integer comparatorMultiplier() {
            return -1;
        }

        @Override
        public LimitBook sameSideBook(Books books) {
            return books.buyLimitBook;
        }

        @Override
        public LimitBook oppositeSideBook(Books books) {
            return books.sellLimitBook;
        }

        @Override
        public SizeAtPrice sizeAtPrice(QuoteEntry quoteEntry) {
            return quoteEntry.bid;
        }
    },
    SELL {
        @Override
        public Side oppositeSide() {
            return Side.BUY;
        }

        @Override
        public Integer comparatorMultiplier() {
            return 1;
        }

        @Override
        public LimitBook sameSideBook(Books books) {
            return books.sellLimitBook;
        }

        @Override
        public LimitBook oppositeSideBook(Books books) {
            return books.buyLimitBook;
        }

        @Override
        public SizeAtPrice sizeAtPrice(QuoteEntry quoteEntry) {
            return quoteEntry.offer;
        }
    };

    abstract public Side oppositeSide();

    abstract public Integer comparatorMultiplier();

    abstract public LimitBook sameSideBook(Books books);

    abstract public LimitBook oppositeSideBook(Books books);

    abstract public SizeAtPrice sizeAtPrice(QuoteEntry quoteEntry);
}

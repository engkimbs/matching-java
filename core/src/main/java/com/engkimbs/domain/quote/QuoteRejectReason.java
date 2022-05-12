package com.engkimbs.domain.quote;

enum QuoteRejectReason {
    UNKNOWN_SYMBOL,
    EXCHANGE_CLOSED,
    DUPLICATE_QUOTE,
    INVALID_BID_ASK_SPREAD,
    INVALID_PRICE,
    INVALID_QUANTITY,
    NOT_AUTHORISED,
    NO_QUOTE_FOUND,
    OTHER
}


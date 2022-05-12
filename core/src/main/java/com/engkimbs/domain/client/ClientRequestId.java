package com.engkimbs.domain.client;

import lombok.Data;

@Data
public class ClientRequestId {
    private String current;
    private String original;
    private String collectionId;
    private String parentId;
}
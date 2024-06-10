package com.orbit.dto.request;

import lombok.Data;

@Data
public class TransactionStatusRequest {
    private String sessionId;
    private int channelCode;
    private String sourceInstitutionCode;
    private String responseCode;
}

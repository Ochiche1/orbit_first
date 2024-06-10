package com.orbit.dto.response;

import lombok.Data;

@Data
public class TransactionStatusResponse {
    private String sessionId;
    private int channelCode;
    private String sourceInstitutionCode;
    private String responseCode;
}

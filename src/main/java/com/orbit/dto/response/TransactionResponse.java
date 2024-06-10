package com.orbit.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TransactionResponse {
    private String transactionRef;
    private String accountNo;
    private String tranAppl;
    private String fromAccountNumber;
    private String toAccountNumber;
    private String transReceiver;
    private BigDecimal transAmount;
    private String tranStatus;
    private String narration;
    private String transactionType;
    private LocalDate transactionDate;
    private String debitCrditFlag;
    private String responseCode;


}

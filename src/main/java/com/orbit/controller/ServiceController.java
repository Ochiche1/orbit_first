//package com.orbit.controller;
//
//import com.orbit.dto.request.TransactionRequest;
//import com.orbit.services.transaction.TransactionsService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
////import javax.security.auth.login.AccountNotFoundException;
////import javax.validation.Valid;
//
//@CrossOrigin
//@RestController
//public class ServiceController {
//
//@Autowired
//TransactionsService transactionsService;
//
//    @PostMapping("/transfer")
//    public ResponseEntity<?> transfer( @RequestBody TransactionRequest request, TransactionType transType)  {
//        return ResponseEntity.ok(transactionsService.doFundTransfer(request, transType));
//    }
//}

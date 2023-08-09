package com.billease.server.controller;
import com.billease.server.model.Invoice;
import com.billease.server.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController // To Specify it as a controller
public class InvoiceController {

    @Autowired //Object of interface cannot be made so we are using this
    InvoiceService invoiceService;

    @PostMapping("/invoice") // To map post request
    public Invoice addInvoice(@RequestBody Invoice invoice){ //Takes payload object as arg
        return this.invoiceService.addInvoice(invoice);
    }
}

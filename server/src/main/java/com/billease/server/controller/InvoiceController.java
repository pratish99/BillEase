package com.billease.server.controller;
import com.billease.server.model.Invoice;
import com.billease.server.services.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // To Specify it as a controller
@CrossOrigin //To handle CORS error as frontend and backend are running on different servers
public class InvoiceController {

    @Autowired //Object of interface cannot be made so we are using this
    InvoiceService invoiceService;

    @PostMapping("/invoice") // To map post request
    public Invoice addInvoice(@RequestBody Invoice invoice){ //Takes payload object as arg
        return this.invoiceService.addInvoice(invoice);
    }

    @GetMapping("/invoice")
    public List<Invoice> getInvoice() {
        return this.invoiceService.getInvoices();
    }

    @DeleteMapping("/invoice/{invoiceId}")
    public Invoice deleteInvoice(@PathVariable String invoiceId){
        return this.invoiceService.deleteInvoice(Long.parseLong(invoiceId));

    }
}

/*========================FLOW=============================

INVOICE:
-> 'invoice' firstly it will match the API from multiple api's
-> will call invoiceService and pass invoice
-> get to know that it is an interface having abstract method so will search where it is implemented
-> will go to invoiceServiceImplementation and execute addInvoice method
-> call InvoiceDao (extending JPRepository) save method which will save invoice
-> saved invoice object will returned back to controller


 */
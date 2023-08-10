package com.billease.server.services;

import com.billease.server.model.Invoice;

import java.util.List;

public interface InvoiceService {

    public Invoice addInvoice(Invoice invoice);

    public List<Invoice> getInvoices();

}

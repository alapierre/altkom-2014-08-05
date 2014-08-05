/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pl.altkom.bookstore.model;

import java.util.Date;

/**
 *
 * @author Piotr Wajcowicz
 */
public class Invoice {
    private int invoceId;
    private Date invoiceDate;
    //obiekt pracownika

    //obiekt produktów na fakturze
    //obiekt kontrahenta
    public int getInvoceId() {
        return invoceId;
    }

    public void setInvoceId(int invoceId) {
        this.invoceId = invoceId;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }
}

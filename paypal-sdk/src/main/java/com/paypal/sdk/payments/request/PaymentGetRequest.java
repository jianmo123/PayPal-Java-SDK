// This class was generated on Mon, 31 Jul 2017 18:27:14 UTC by version 0.1 of Braintree SDK Generator
// PaymentGetRequest.java
// DO NOT EDIT
// @type request
// @json {"Name":"payment.get","Description":"Shows details for a payment, by ID, that has yet to complete. For example, shows details for a payment that was created, approved, or failed.\u003cbr/\u003e\u003cbr/\u003eA successful request returns the HTTP `200 OK` status code and a JSON response body that shows payment details.","QueryParameters":[],"HeaderParameters":[],"FormParameters":[],"PathParameters":[{"Type":"string","VariableName":"payment_id","Description":"The ID of the payment for which to show details.","IsArray":false,"ReadOnly":false,"Required":true,"Properties":null}],"RequestType":null,"ResponseType":{"Type":"Payment","VariableName":"","Description":"A payment. Use this object to create, process, and manage payments.","IsArray":false,"ReadOnly":false,"Required":false,"Properties":null},"ContentType":"application/json","HttpMethod":"GET","Path":"/v1/payments/payment/{payment_id}","ExpectedStatusCode":200}

package com.paypal.sdk.payments.request;

import com.braintreepayments.http.*;
import com.paypal.sdk.payments.object.*;
import java.util.*;
import java.util.List;


/**
 * Shows details for a payment, by ID, that has yet to complete. For example, shows details for a payment that was created, approved, or failed.<br/><br/>A successful request returns the HTTP `200 OK` status code and a JSON response body that shows payment details.
 */
public class PaymentGetRequest extends HttpRequest<Payment> {

    public PaymentGetRequest(String paymentId) {
        super("/v1/payments/payment/{payment_id}?"
            .replace("{payment_id}", String.valueOf(paymentId)), "GET", Payment.class);
        header("Content-Type", "application/json");
    }
    
}
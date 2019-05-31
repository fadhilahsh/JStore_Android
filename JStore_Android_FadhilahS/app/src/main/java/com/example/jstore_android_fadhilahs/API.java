package com.example.jstore_android_fadhilahs;

public interface API {
    String base = "http://10.0.2.2:8080/";
    String loginURL = base+"logincust";
    String Regis_URL = base+"newcustomer";
    String itemsURL = base+"/items/";
    String createPaidURL = base+"createpaid";
    String createUnpaidURL = base+"createunpaid";
    String createInstallmentURL = base+"createinstallment";
    String fetchPesananURL = base+"/pesanancustomer/";
    String finishPesananURL = base+"finishpesanan";
    String cancelPesananURL = base+"cancelpesanan";

}
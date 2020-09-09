package com.sreejesh.oncompletion;

import org.apache.camel.Exchange;

//@Component
public class OnCompletionBean {


    public void onFailure(Exchange exchange) {
        System.out.println("*** "+Thread.currentThread().getName()+":In OnCompletionBean.onFailure() ***");
    }


    public void onComplete(Exchange exchange) {
        System.out.println("*** "+Thread.currentThread().getName()+":In OnCompletionBean.onComplete() ***");
    }
}

package com.sreejesh.oncompletion;

import org.apache.camel.Exchange;
import org.apache.camel.util.FileUtil;

import java.io.File;

public class FileRollback  {


    public void onFailure(Exchange exchange) {
        System.out.println("*** In FileRollback.onFailure() ***");
        String name = exchange.getIn().getHeader(Exchange.FILE_NAME_PRODUCED, String.class);
        FileUtil.deleteFile(new File(name));
//        FileUtil.removeDir(new File(name));
    }


    public void onComplete(Exchange exchange) {
        System.out.println("*** In FileRollback.onComplete() ***");
    }
}

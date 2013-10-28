package org.unsure.rdio;


import com.rdio.simple.RdioClient;
import com.rdio.simple.RdioCoreClient;

public class Rdio {

    public static void main (String[] args) {
        RdioClient rdioClient = new RdioCoreClient(new RdioClient.Consumer("XXXX", "XXXX"));
        //rdioClient.call()
    }
}

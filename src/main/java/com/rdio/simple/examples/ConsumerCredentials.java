package com.rdio.simple.examples;

import com.rdio.simple.RdioClient;

public class ConsumerCredentials extends RdioClient.Consumer {
    // you can get these by signing up for a developer account at:
    // http://developer.rdio.com/
    private static final String RDIO_CONSUMER_KEY = "62st7w2dq6jq76dtt3g3dh3k";
    private static final String RDIO_CONSUMER_SECRET = "PfqBrzYgsp";

    public ConsumerCredentials() {
        super(RDIO_CONSUMER_KEY, RDIO_CONSUMER_SECRET);
    }
}

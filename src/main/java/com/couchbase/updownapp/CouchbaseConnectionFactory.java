package com.couchbase.updownapp;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.CouchbaseCluster;

public class CouchbaseConnectionFactory {

    public static Bucket getDefaultConnection() {
      return CouchbaseCluster.create().openBucket("default").toBlocking().single();
    }

}

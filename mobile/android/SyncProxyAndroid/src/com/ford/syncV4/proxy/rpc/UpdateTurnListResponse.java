package com.ford.syncV4.proxy.rpc;

import java.util.Hashtable;

import com.ford.syncV4.proxy.RPCResponse;

public class UpdateTurnListResponse extends RPCResponse {

    public UpdateTurnListResponse() {
        super("UpdateTurnList");
    }
    public UpdateTurnListResponse(Hashtable hash) {
        super(hash);
    }
}
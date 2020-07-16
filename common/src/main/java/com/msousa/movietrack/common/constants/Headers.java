package com.msousa.movietrack.common.constants;

public enum Headers {
    VF_TRACE_TRANSACTION_ID("vf-trace-transaction-id"),
    VF_EXT_BP_ID("vf_ext_bp_id"),
    VF_INT_CALLER_ID("vf_int_caller_id");

    private String value;

    Headers(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

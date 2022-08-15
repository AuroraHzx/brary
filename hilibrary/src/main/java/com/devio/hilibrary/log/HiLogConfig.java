package com.devio.hilibrary.log;

public abstract class HiLogConfig {
    static int MAX_LEN = 512;
    static HiStackTraceFormatter HI_STACK_TRACE_FORMATTER = new HiStackTraceFormatter();
    static HiThreadFormatter HI_THREAD_FORMATTER = new HiThreadFormatter();

    public String getGlobalTag() {
        return "HiLog";
    }

    public JsonPare injectJsonParser() {
        return null;
    }

    public boolean enable() {
        return true;
    }

    public boolean includeTread() {
        return false;
    }

    public int stackTraceDepth() {
        return 5;
    }

    public HiLogPrinter[] printers() {
        return null;
    }

    public interface JsonPare {
        String toJson(Object src);
    }
}

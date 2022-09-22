package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("Shakespeare")) {
            return "He's a pretty cool guy";
        }
        return "";
    }
}

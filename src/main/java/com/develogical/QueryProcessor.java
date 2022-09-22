package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("Tell me a story")) {
            return "I'm certain you've heard it before"
        }
        return "";
    }
}

package com.develogical.app;

public class QueryProcessor {
    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare333")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English bard, playwright, and actor, widely regarded as the one of greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        return "";
    }
}

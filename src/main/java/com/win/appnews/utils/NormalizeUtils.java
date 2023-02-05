package com.win.appnews.utils;

import java.text.Normalizer;

public class NormalizeUtils {

    public String normalizeValue(String value){
        var normalizedValue = Normalizer.normalize(value, Normalizer.Form.NFKD);
        normalizedValue = normalizedValue.replaceAll("\\p{M}", "");
        return normalizedValue.toLowerCase().trim();
    }
}

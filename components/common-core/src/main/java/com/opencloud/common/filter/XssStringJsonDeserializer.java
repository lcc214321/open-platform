package com.opencloud.common.filter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import org.apache.commons.text.StringEscapeUtils;

import java.io.IOException;

/**
 * @author liuyadu
 */
public class XssStringJsonDeserializer extends JsonDeserializer<String> {
    @Override
    public String deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException {
        String source = jsonParser.getText().trim();
        //  富文本解码
        return StringEscapeUtils.unescapeHtml4(source);
    }
}

package edu.wctc.service.converter;

import edu.wctc.service.FormatService;
import entity.Format;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;

public class StringToFormatConverter implements Converter<String, Format> {

    @Autowired
    private FormatService formatService;

    public Format convert(String source) {
        int formatId = Integer.parseInt(source);
        Format format = formatService.getFormat(formatId);

        return format;
    }
}

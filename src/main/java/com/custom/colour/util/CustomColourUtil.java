package com.custom.colour.util;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.color.ANSIConstants;
import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;

public class CustomColourUtil extends ForegroundCompositeConverterBase<ILoggingEvent> {

    @Override
    protected String getForegroundColorCode(ILoggingEvent event) {
        Level level = event.getLevel();
        return switch (level.toInt()) {
            // ERROR level is red
            case Level.ERROR_INT -> ANSIConstants.RED_FG;
            // WARN level is yellow
            case Level.WARN_INT -> ANSIConstants.YELLOW_FG;
            // DEBUG level is blue
            case Level.DEBUG_INT -> ANSIConstants.BLUE_FG;
            // INFO level is green
            case Level.INFO_INT -> ANSIConstants.GREEN_FG;
            // TRACE level is red
            case Level.TRACE_INT -> ANSIConstants.WHITE_FG;
            // Other is the default color
            default -> ANSIConstants.DEFAULT_FG;
        };
    }
}

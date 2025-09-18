package com.bcp.training;


import io.smallrye.config.ConfigMapping;
import io.smallrye.config.WithDefault;

import java.util.Optional;

@ConfigMapping(prefix = "expense")
public interface ExpenseConfiguration {

    @WithDefault("false")
    boolean debugEnabled();   //debug-enabled

    Optional<String> debugMessage(); //debug-message

    int rangeHigh(); //range-high

    int rangeLow(); //range-low

}

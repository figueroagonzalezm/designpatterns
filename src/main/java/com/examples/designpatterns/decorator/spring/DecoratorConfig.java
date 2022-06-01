package com.examples.designpatterns.decorator.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DecoratorConfig {
    @Bean
    @Qualifier("upperCase")
    PrinterDecorator upperCasePrinterDecorator(final Printer printer) { // Injected automatically
        return new UpperCaseDecorator(printer);

    }

    @Bean
    @Qualifier("lowerCase")
    PrinterDecorator lowerCasePrinterDecorator(final Printer printer) {
        return new LowerCaseDecorator(printer);
    }

    @Bean
    @Qualifier("asterisk")
    PrinterDecorator addAsterisksPrinterDecorator(final Printer printer) {
        return new AddAsterisksDecorator(printer);
    }
}

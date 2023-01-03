/* Generated by camel build tools - do NOT edit this file! */
package io.github.jam01.camel.converter;

import org.apache.camel.CamelContext;
import org.apache.camel.CamelContextAware;
import org.apache.camel.DeferredContextBinding;
import org.apache.camel.Exchange;
import org.apache.camel.TypeConversionException;
import org.apache.camel.TypeConverterLoaderException;
import org.apache.camel.spi.TypeConverterLoader;
import org.apache.camel.spi.TypeConverterRegistry;
import org.apache.camel.support.SimpleTypeConverter;
import org.apache.camel.support.TypeConverterSupport;
import org.apache.camel.util.DoubleMap;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
@DeferredContextBinding
public final class DocumentConverterLoader implements TypeConverterLoader, CamelContextAware {

    private CamelContext camelContext;

    public DocumentConverterLoader() {
    }

    @Override
    public void setCamelContext(CamelContext camelContext) {
        this.camelContext = camelContext;
    }

    @Override
    public CamelContext getCamelContext() {
        return camelContext;
    }

    @Override
    public void load(TypeConverterRegistry registry) throws TypeConverterLoaderException {
        registerConverters(registry);
        registerFallbackConverters(registry);
    }

    private void registerConverters(TypeConverterRegistry registry) {
        addTypeConverter(registry, io.github.jam01.xtrasonnet.document.MediaType.class, java.lang.String.class, false,
            (type, exchange, value) -> io.github.jam01.camel.converter.DocumentConverter.toMediaType((java.lang.String) value));
    }

    private static void addTypeConverter(TypeConverterRegistry registry, Class<?> toType, Class<?> fromType, boolean allowNull, SimpleTypeConverter.ConversionMethod method) { 
        registry.addTypeConverter(toType, fromType, new SimpleTypeConverter(allowNull, method));
    }

    private void registerFallbackConverters(TypeConverterRegistry registry) {
        addFallbackTypeConverter(registry, false, false, (type, exchange, value) -> io.github.jam01.camel.converter.DocumentConverter.convertTo(type, exchange, value, registry));
    }

    private static void addFallbackTypeConverter(TypeConverterRegistry registry, boolean allowNull, boolean canPromote, SimpleTypeConverter.ConversionMethod method) { 
        registry.addFallbackTypeConverter(new SimpleTypeConverter(allowNull, method), canPromote);
    }

}

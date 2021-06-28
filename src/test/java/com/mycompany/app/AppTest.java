package com.mycompany.app;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
import org.immutables.value.internal.$processor$.meta.$GsonMirrors;
import org.junit.Ignore;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        String json = objectMapper.writeValueAsString(
            ImmutableVal.builder()
                        .a(1)
                        .b("B")
                        .build());

        Val val = objectMapper.readValue(json, Val.class);

        assertTrue( true );
    }

    @Test
    //@Ignore
    public void shouldAnswerWithThisTrueToo() {

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.registerModule(new AfterburnerModule());

        try {
            String json = objectMapper.writeValueAsString(
                ImmutableVal.builder()
                            .a(1)
                            .b("B")
                            .build());
            Val val = objectMapper.readValue(json, Val.class);

        } catch (Exception e) {
           throw new RuntimeException(e);
        }

        assertTrue( true );
    }
}

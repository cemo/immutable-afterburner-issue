package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.afterburner.AfterburnerModule;
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

        assertTrue( true );
    }

    @Test
    public void shouldAnswerWithThisTrueToo() throws JsonProcessingException {

        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.registerModule(new AfterburnerModule());

        String json = objectMapper.writeValueAsString(
            ImmutableVal.builder()
                        .a(1)
                        .b("B")
                        .build());

        assertTrue( true );
    }
}

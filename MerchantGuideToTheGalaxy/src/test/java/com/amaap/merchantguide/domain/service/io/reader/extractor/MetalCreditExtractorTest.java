package com.amaap.merchantguide.domain.service.io.reader.extractor;

import com.amaap.merchantguide.domain.model.entity.MetalCredit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MetalCreditExtractorTest {

    @Test
    void shouldBeAbleToExtractAndReturnMetalAndValueFromInputLine() {
        // arrange
        String inputLine = "glob   glob  Silver  is 34  Credits";
        String metalName = "glob glob Silver";
        int metalValue = 34;
        MetalCredit expected = MetalCredit.create(metalName, metalValue);

        // act
        MetalCredit actual = MetalCreditExtractor.getMetalCredit(inputLine);

        // assert
        assertEquals(expected, actual);
    }
}
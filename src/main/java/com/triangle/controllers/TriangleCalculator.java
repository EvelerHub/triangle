package com.triangle.controllers;

import com.triangle.model.TriangleInputData;
import com.triangle.model.TriangleResultData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Alexander Manko, alexander.eveler@gmail.com
 * @since 27.11.16
 */
@RestController
public class TriangleCalculator {

    @RequestMapping(value = "/calculate")
    TriangleResultData doCalculation(TriangleInputData inputData) {
        double result = Math.sqrt(Math.pow(inputData.getFirstSide(), 2) + Math.pow(inputData.getSecondSide(), 2));

        return new TriangleResultData(result);
    }
}

package com.finalproject.automated.refactoring.tool.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Dufan Quraish
 * @version 1.0.0
 * @since 8 August 2019
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PropertyModel {

    @Builder.Default
    private List<String> keywords = new ArrayList<>();

    private String type;

    private String name;
}

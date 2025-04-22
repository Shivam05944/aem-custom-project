package com.custom.core.models;

import com.custom.core.models.impl.MultiOption;

import java.util.List;

public interface OptionField {
    String getImage();

    String getTitle();

    String getHeader();

    String getSubHeader();

    String getDescription();

    List<MultiOption> getForm();
}


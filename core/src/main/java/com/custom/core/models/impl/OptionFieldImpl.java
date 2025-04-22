package com.custom.core.models.impl;

import com.custom.core.models.OptionField;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.List;
@Model(adaptables = {SlingHttpServletRequest.class}, adapters = {OptionField.class}, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class OptionFieldImpl implements OptionField {

    @ChildResource
    public List<MultiOption> forms;

    @ValueMapValue
    public String image;

    @ValueMapValue
    public String title;

    @ValueMapValue
    public String header;

    @ValueMapValue
    public String subHeader;

    @ValueMapValue
    public String description;

    @Override
    public String getImage() {
        return image;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getHeader() {
        return header;
    }

    @Override
    public String getSubHeader() {
        return subHeader;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public List<MultiOption> getForm() {
        return forms;
    }
}

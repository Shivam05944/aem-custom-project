package com.custom.core.models.impl;

import com.custom.core.models.MultiField;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;

import java.util.List;

@Model(adaptables = {Resource.class},
        adapters = {MultiField.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class MultiFieldImpl implements MultiField {

    @ChildResource
    public List<MultiForm> forms;


    @Override
    public List<MultiForm> getForm() {
        return forms;
    }
}

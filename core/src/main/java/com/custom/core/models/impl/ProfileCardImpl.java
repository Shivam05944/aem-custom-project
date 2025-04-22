package com.custom.core.models.impl;

import com.custom.core.models.ProfileCard;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {Resource.class},
        adapters = {ProfileCard.class},
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class ProfileCardImpl implements ProfileCard {

    @ValueMapValue
    public String name;

    @ValueMapValue
    public String fileReference;

    @ValueMapValue
    public String description;


    @Override
    public String getFileReference() {
        return fileReference;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}

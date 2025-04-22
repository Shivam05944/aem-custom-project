package com.custom.core.models.impl;
import com.custom.core.models.Page;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(adaptables = {SlingHttpServletRequest.class}, adapters = {Page.class}, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)
public class PageImpl implements Page {

    @ValueMapValue
    public String fileReference;

    @Override
    public String getFileReference() {
        return fileReference;
    }
}

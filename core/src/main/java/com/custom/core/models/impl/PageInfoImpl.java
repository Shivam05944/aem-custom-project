package com.custom.core.models.impl;

import com.day.cq.tagging.Tag;
import com.day.cq.wcm.api.Page;
import com.custom.core.models.PageInfo;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.Self;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import java.util.ArrayList;
import java.util.List;

@Model(adaptables = {SlingHttpServletRequest.class}, adapters = {PageInfo.class}, defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL)

public class PageInfoImpl implements PageInfo {
    @Self
    private SlingHttpServletRequest request;
    @ValueMapValue
    private String pagePath;

    @ValueMapValue
    private List<String> tags;


    public List<String> getFilteredPages() {
        List<String> filteredList = new ArrayList<>();
        ResourceResolver resourceResolver = request.getResourceResolver();
        Resource resource = resourceResolver.getResource(pagePath);

        if (resource != null) {
            for (Resource child : resource.getChildren()) {
                Page page = child.adaptTo(Page.class);
                if (page == null) {
                    continue;
                }
                Tag[] pageTags = page.getTags();
                for (Tag tag : pageTags) {
                    if (tags.contains(tag.getTagID())) {
                        filteredList.add(child.getPath());
                    }

                }
            }
        }
        return filteredList;
    }

    @Override
    public List<String> getFileReference() {
        List<String> imageReferences = new ArrayList<>();
        ResourceResolver resourceResolver = request.getResourceResolver();
        Resource rootResource = resourceResolver.getResource(pagePath);

        if (rootResource != null) {
            for (Resource child : rootResource.getChildren()) {
                Page childPage = child.adaptTo(Page.class);
                if (childPage != null) {
                    Resource contentResource = childPage.getContentResource();
                    if (contentResource != null) {
                        String fileReference = contentResource.getValueMap().get("fileReference", String.class);
                        if (fileReference != null) {
                            imageReferences.add(fileReference);
                        }
                    }
                }
            }
        }
        return imageReferences;
    }

    @Override
    public List<String> getPageTitles() {
        List<String> pageTitles = new ArrayList<>();
        ResourceResolver resourceResolver = request.getResourceResolver();
        Resource rootResource = resourceResolver.getResource(pagePath);

        if (rootResource != null) {
            for (Resource child : rootResource.getChildren()) {
                Page childPage = child.adaptTo(Page.class);
                if (childPage != null) {
                    Tag[] pageTags = childPage.getTags();
                    for (Tag tag : pageTags) {
                        if (tags.contains(tag.getTagID())) {
                            String title = childPage.getTitle();
                            if (title != null){
                                pageTitles.add(title);
                            }
                        }
                    }
                }
            }
        }
        return pageTitles;
    }
}

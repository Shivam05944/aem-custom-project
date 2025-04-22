package com.custom.core.models;

import java.util.List;

public interface PageInfo {
    List<String> getFilteredPages();

    List<String> getFileReference();

    List<String> getPageTitles();

}

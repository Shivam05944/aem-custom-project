/*
package com.custom.core.models;

import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.exec.WorkflowData;
import com.adobe.granite.workflow.metadata.MetaDataMap;
import com.day.cq.dam.api.Asset;
import org.apache.sling.api.resource.LoginException;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;
import org.osgi.annotation.versioning.ProviderType;

import java.util.List;

@ProviderType
@SuppressWarnings("squid:S1214")
public interface WorkflowHelper {

    String PROCESS_ARGS = "PROCESS_ARGS";
    String TYPE_JCR_PATH = "JCR_PATH";
    String PAYLOAD_TYPE_JCR_PATH = "JCR_PATH";

    ResourceResolver getResourceResolver(com.adobe.granite.workflow.WorkflowSession workflowSession);

    ResourceResolver getResourceResolver(WorkflowSession workflowSession) throws LoginException;

    WorkflowHelper.AssetResourceResolverPair getAssetFromPayload(WorkItem item, WorkflowSession workflowSession);

    String getExtension(String mimetype);

    String[] buildArguments(MetaDataMap metaDataMap);

    List<String> getValuesFromArgs(String name, String[] args);

    double getQuality(double base, String qualityStr);

    final class AssetResourceResolverPair {

        public final Asset asset;

        public final ResourceResolver resourceResolver;

        public AssetResourceResolverPair(Asset asset, ResourceResolver resourceResolver) {
            this.asset = asset;
            this.resourceResolver = resourceResolver;
        }

    }

    Resource getPageOrAssetResource(ResourceResolver resourceResolver, String path);

    boolean isPathTypedPayload(WorkflowData workflowData);

    boolean isPathTypedPayload(com.adobe.granite.workflow.exec.WorkflowData workflowData);

}
*/

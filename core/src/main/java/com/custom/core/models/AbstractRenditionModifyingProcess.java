/*
package com.custom.core.models;
import com.adobe.granite.workflow.WorkflowException;
import com.adobe.granite.workflow.WorkflowSession;
import com.adobe.granite.workflow.exec.WorkItem;
import com.adobe.granite.workflow.metadata.MetaDataMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AbstractRenditionModifyingProcess {
    private static final int MAX_GIF_QUALITY = 255;
    private static final String DEFAULT_QUALITY = "60";
    private static final String ARG_QUALITY = "quality";
    private static final String ARG_RENDITION_NAME = "renditionNAME";


    private static final Logger log = LoggerFactory.getLogger(AbstractRenditionModifyingProcess.class);

    public final void execute(WorkItem workItem, WorkflowSession workflowSession, MetaDataMap metaData, WorkflowHelper workflowHelper) throws WorkflowException {
        String[] args = workflowHelper.buildArguments(metaData);

        final String reditionName = workflowHelper.getValuesFromArgs(ARG_RENDITION_NAME, args).size()>0? workflowHelper.getValuesFromArgs(
                ARG_RENDITION_NAME, args).get(0) : null;


        final String qualityStr = workflowHelper.getValuesFromArgs(ARG_QUALITY, args).size()>
    }

}
*/

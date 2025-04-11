package com.custom.core.models.impl;

import com.day.cq.workflow.WorkflowException;
import com.day.cq.workflow.WorkflowSession;
import com.day.cq.workflow.exec.WorkItem;
import com.day.cq.workflow.exec.WorkflowProcess;
import com.day.cq.workflow.metadata.MetaDataMap;
import org.apache.commons.codec.binary.StringUtils;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = WorkflowProcess.class,
        property = {"process.label=Practice Custom Workflow Process"})
public class PracticeCustom implements WorkflowProcess {
    protected final Logger logger = LoggerFactory.getLogger(PracticeCustom.class);

    public void execute(WorkItem workItem, WorkflowSession wfSession,
                        MetaDataMap metaDataMap) throws WorkflowException {

        logger.error("PracticeCustomWorkflowProcess called >>>>>>>>");

        String pathInfo = workItem.getWorkflow().getMetaDataMap().get("pathInfo", String.class);
        logger.error("pathInfo >>>>>>> {}", pathInfo);

    }
}

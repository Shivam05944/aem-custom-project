package com.custom.core.models.impl;

import com.day.cq.workflow.WorkflowException;
import com.day.cq.workflow.WorkflowSession;
import com.day.cq.workflow.exec.WorkItem;
import com.day.cq.workflow.exec.WorkflowProcess;
import com.day.cq.workflow.metadata.MetaDataMap;
import org.osgi.service.component.annotations.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = WorkflowProcess.class,
        property = {"process.label=Practice Second Workflow Process" })
public class PracticeSecondWorkflowProcess implements WorkflowProcess {
    protected final Logger logger = LoggerFactory.getLogger(PracticeSecondWorkflowProcess.class);

    public void execute(WorkItem workItem, WorkflowSession wfSession,
                        MetaDataMap metaDataMap) throws WorkflowException {
        String name = workItem.getWorkflow().getMetaDataMap().get("user", String.class);
        String age = workItem.getWorkflow().getMetaDataMap().get("Age", String.class);

        logger.error("Name - {}", name);
        logger.error("Age - {}", age);
    }
}

package com.bradnicolle.erready.workflow;

import android.content.Intent;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

public class Workflow {
    private static Workflow sWorkFlow;
    private WorkNode rootNode;

    public static Workflow get() {
        if (sWorkFlow == null) {
            sWorkFlow = new Workflow();
        }
        return sWorkFlow;
    }

    private Workflow() {}

    public void setRootNode(WorkNode node) {
        rootNode = node;
    }

    public static class WorkNode {
        private Map<String, WorkNode> nextNodeMap = new HashMap<>();
        private Intent activityIntent;
        private String key;

        public WorkNode(String key, Intent activityIntent) {
            this.key = key;
            this.activityIntent = activityIntent;
        }

        public void setNextNodes(WorkNode... nodes) {
            for (WorkNode node : nodes) {
                nextNodeMap.put(node.getKey(), node);
            }
        }

        public String getKey() {
            return key;
        }

        public Intent getActivityIntent() {
            return activityIntent;
        }

        public WorkNode getNextNode(String key) {
            return nextNodeMap.get(key);
        }
    }
}

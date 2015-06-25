package com.christianjandl.phototask.data;

/**
 * Created by christianjandl on 23.06.15.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DataModel {


    public static List<TaskItem> TASKS = new ArrayList<TaskItem>();

    /**
     * A map of sample  items, by ID.
     */
    public static Map<String, TaskItem> ITEM_MAP = new HashMap<String, TaskItem>();

    static {
        // Add 3 sample items.
        addItem(new TaskItem("1", "Gruber" , "Audi A4"));
        addItem(new TaskItem("2", "Item 2", "VW Skoda"));
        addItem(new TaskItem("3", "Item 3" , "Renault"));
    }

    private static void addItem(TaskItem item) {
        TASKS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class TaskItem {
        public String id;
        public String content;
        public String marke;


        public TaskItem(String id, String content, String marke) {
            this.id = id;
            this.content = content;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}

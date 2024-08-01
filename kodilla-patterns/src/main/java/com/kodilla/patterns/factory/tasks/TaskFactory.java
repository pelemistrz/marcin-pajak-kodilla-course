package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING_TASK = "ShoppingTask";
    public static final String PAINTING_TASK = "PaintingTask";
    public static final String DRIVING_TASK = "DrivingTask";
    public static Task createTask(final String taskName) {

        return switch (taskName){
            case "PaintingTask" -> new PaintingTask("Weekend painting","blue","living room");
            case "ShoppingTask" -> new ShoppingTask("weekend shopping","beer", 2);
            case "DrivingTask" -> new DrivingTask("monday driving","school","bus");
            default -> null;
        };
    }
}

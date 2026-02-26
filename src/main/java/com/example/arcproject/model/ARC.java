package com.example.arcproject.model;

import java.util.List;

public class ARC {
    private List<String> workbenches;
    private String name;
    private boolean isLarge;
    private boolean canFly;
    private boolean isStationary;
    private boolean hasLegs;
    private String description;

    public boolean isHasLegs() {
        return hasLegs;
    }

    public void setHasLegs(boolean hasLegs) {
        this.hasLegs = hasLegs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ARC(String name, boolean isLarge, boolean canFly, boolean isStationary, boolean hasLegs,
               String description, List<String> workbenches) {
        this.name = name;
        this.isLarge = isLarge;
        this.canFly = canFly;
        this.isStationary = isStationary;
        this.hasLegs = hasLegs;
        this.description = description;
        this.workbenches = workbenches;
    }

    // Empty constructor to be used for our /add method in the controller.
    public ARC() {
    }

    public List<String> getWorkbenches() {
        return workbenches;
    }

    public void setWorkbenches(List<String> workbenches) {
        this.workbenches = workbenches;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLarge() {
        return isLarge;
    }

    public void setLarge(boolean large) {
        isLarge = large;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isStationary() {
        return isStationary;
    }

    public void setStationary(boolean stationary) {
        isStationary = stationary;
    }
}

package com.example.arcproject.repository;

import com.example.arcproject.model.ARC;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ArcRepository {
    private List<ARC> arcList = new ArrayList<>();
    private final List<String> workbenches = new ArrayList<>(List.of("Workbench", "Gunsmith", "Gear Bench",
            "Utility Station", "Explosives Station",
            "Medical Lab", "Refiner"));

    public ArcRepository() {
        populateArcList();
    }

    public ARC findByName(String searchName) {
        for (ARC arc : arcList) {
            if (arc.getName().equalsIgnoreCase(searchName)) {
                return arc;
            }
        }
        return null;
    }

    public ARC add(ARC arc) {
        if (arc.getName() != null) {
            arcList.add(arc);
        }
        return arc;
    }


    public ARC deleteFromList(String name) {
        ARC foundArc = findByName(name);
        if (foundArc != null) {
            arcList.remove(foundArc);
            return foundArc;
        }
        return null;
    }

    public List<ARC> getArcList() {
        return arcList;
    }

    public List<String> getWorkbenches() {
        return workbenches;
    }

    private void populateArcList() {
        add(new ARC("Rocketeer", true, true, false, List.of("Explosives Station")));
        add(new ARC("Tick", false, false, false, List.of("Medical Lab")));
        add(new ARC("Snitch", false, true, false, List.of("Utility Station")));
    }


}

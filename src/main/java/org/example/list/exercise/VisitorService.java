package org.example.list.exercise;

import java.util.ArrayList;
import java.util.List;

public class VisitorService {

    private final List<Visitor> visitors = new ArrayList<>(100);


    public static List<Visitor> filterByFavoriteCastle(List<Visitor> visitors, Castle castle) {
        return visitors.stream()
                .filter(visitor -> visitor.getPreferredCastles().indexOf(castle) == 0)
                .toList();
    }

    public void checkIn(Visitor visitor) {
        if (visitor.isHaveExclusiveAccess() && !this.visitors.isEmpty()) {
            int i = 0;
            for (; i < visitors.size(); i++) {
                if (this.visitors.get(i).isHaveExclusiveAccess()) {
                    continue;
                }
                break;
            }
            this.visitors.add(i, visitor);
        } else {
            this.visitors.add(visitor);
        }
    }

    public void swapPosition(Visitor visitor1, Visitor visitor2) {
        int position1 = this.visitors.indexOf(visitor1);
        int position2 = this.visitors.indexOf(visitor2);

        if (position1 != -1 && position2 != -1) {
            this.visitors.set(position1, visitor2);
            this.visitors.set(position2, visitor1);
        }
    }

    public List<Visitor> getVisitorsList() {
        return List.copyOf(this.visitors);
    }

}
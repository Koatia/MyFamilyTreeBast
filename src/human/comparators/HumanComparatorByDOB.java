package src.human.comparators;

import src.human.Human;
import java.util.Comparator;

public class HumanComparatorByDOB implements Comparator<Human> {
    @Override
    public int compare(Human o1, Human o2) {
        return o1.getBirthDate().compareTo(o2.getBirthDate());
    }
}
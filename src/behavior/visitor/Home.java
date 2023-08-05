/*
 * Copyright (c) 2023. ALL.
 */

package behavior.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @author heyabo
 * @since 2023/8/5 16:33
 */

public class Home {
    List<Animal> animalList = new ArrayList<>();

    /**
     * 添加动物
     * @param animal 动物
     */
    public void addAnimal(Animal animal) {
        animalList.add(animal);
    }

    public void action(Person person) {
        animalList.forEach(v -> v.accept(person));
    }
}

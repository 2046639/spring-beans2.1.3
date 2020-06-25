package app.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary //Можно указать эту аннотацию и из всех однотипных бинов будет выбираться эта
// @Component("animal") // - можно привязать если поставить параметр аннотации равный названию поля в AnimalsCage
//// Тогда в AnimalsCage можно не указывать @Qualifier("dog")
//@Component("otherNameDog") // otherNameDog - для связывания бина по имени отличного от имени по-умолчанию этого бина
public class Dog extends Animal {
    @Override
    public String toString() {
        return "Im a Dog";
    }
}
